package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.QuestionDao;
import io.khasang.qb.entity.Question;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class QuestionDaoImpl extends BaseDaoImpl<Question> implements QuestionDao {

    @Override
    public Class<Question> getEntityName() {
        return Question.class;
    }

}
