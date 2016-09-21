package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.entity.Answer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AnswersDaoImpl extends BaseDaoImpl<Answer> implements AnswersDao<Answer> {

    @Override
    public Class<Answer> getEntityName() {
        return Answer.class;
    }

}
