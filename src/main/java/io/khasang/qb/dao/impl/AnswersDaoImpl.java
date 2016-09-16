package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.entity.Answers;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AnswersDaoImpl extends BaseDaoImpl<Answers> implements AnswersDao<Answers> {

    @Override
    public Class<Answers> getEntityName() {
        return Answers.class;
    }

}
