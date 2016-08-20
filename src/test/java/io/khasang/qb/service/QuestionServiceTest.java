package io.khasang.qb.service;


import io.khasang.qb.config.AppContext;
import io.khasang.qb.config.AppSecurityConfig;
import io.khasang.qb.config.application.WebConfig;
import io.khasang.qb.config.db.HibernateConfig;
import io.khasang.qb.dao.QuestionDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, AppSecurityConfig.class, HibernateConfig.class})
public class QuestionServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
    private String outCat = "cat";
//    @Autowired
//    CatDao catDao;

    @Test
    public void testNewWorld(){
//        assertNotNull();
//        assertNotEquals();
//        assertEquals("barsik", catDao.getCatById(2));
        assertEquals("cat", outCat);
    }

}
