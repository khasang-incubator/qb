package io.khasang.qb.service;

import io.khasang.qb.config.AppContext;
import io.khasang.qb.config.application.WebConfig;
import io.khasang.qb.config.db.HibernateConfig;
import io.khasang.qb.entity.Pizza;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, HibernateConfig.class})
public class PizzaServiceTest {
    @Autowired
    private PizzaService pizzaService;

    @Test
    public void selectPizzaById() {
        Pizza pizza = pizzaService.getPizzaById(5);
        Assert.assertEquals("Острая", pizza.getName());
    }

}
