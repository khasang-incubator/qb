package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.QuestionsDao;
import io.khasang.qb.entity.Questions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class QuestionsDaoImpl extends BaseDaoImpl<Questions> implements QuestionsDao<Questions> {
    @Override
    protected Class<Questions> getEntityName() {
        return Questions.class;
    }
}
