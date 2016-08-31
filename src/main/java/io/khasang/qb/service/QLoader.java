package io.khasang.qb.service;

import io.khasang.qb.dao.QuestionDAO;
import io.khasang.qb.entity.Question;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class QLoader {
    @Autowired
    QuestionDAO questionDAO;

    public QLoader() {
    }

    public String load() throws IOException {
        HSSFWorkbook wb = readXLSFile();
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        int count = 0;
        while (it.hasNext()) {
            Row row = it.next();
            Question question = questionFromRow(row);
            questionDAO.addQuestion(question);
            count++;
        }
        return "А вот столько вопросов мы добавили - " + count;
    }

    private String returnStringFromCell(Cell cell) {
        int cellType = cell.getCellType();
        switch (cellType) {
            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            case Cell.CELL_TYPE_NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            default:
                return null;
        }
    }

    private Question questionFromRow(Row row) {
        Iterator<Cell> cells = row.iterator();
        Question question = new Question();
        int numberOfColumn = 0;
        while (cells.hasNext()) {
            Cell cell = cells.next();
            String text =returnStringFromCell(cell);
            switch (numberOfColumn) {
                case 0:
                    question.setQuestion(text);
                    break;
                case 1:
                    question.setAnswer1(text);
                    break;
                case 2:
                    question.setAnswer2(text);
                    break;
                case 3:
                    question.setAnswer3(text);
                    break;
                case 4:
                    question.setAnswer4(text);
                    break;
                default:
                    break;
            }
            numberOfColumn++;
        }
        return question;
    }

    private HSSFWorkbook readXLSFile() throws IOException {
        InputStream in = QLoader.class.getClassLoader().getResourceAsStream("questions.xls");
        HSSFWorkbook wb = new HSSFWorkbook(in);
        return wb;
    }
}
