package io.khasang.qb.dao.impl;

import io.khasang.qb.config.AppContext;
import io.khasang.qb.config.HibernateConfig;
import io.khasang.qb.config.WebConfig;
import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.entity.Answers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, HibernateConfig.class})
public class AnswersDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    public AnswersDao answersDao;

    @Autowired
    public Answers answers;

    @Test
    public void getEntityNameTest() {
        Assert.assertNotNull(answersDao);
        Assert.assertEquals(Answers.class, answersDao.getEntityName());
    }
}