package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.QuestionsDao;
import io.khasang.qb.entity.Question;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class QuestionsDaoImpl extends BaseDaoImpl<Question> implements QuestionsDao<Question> {

    @Override
    public Class<Question> getEntityName() {
        return Question.class;
    }

}
