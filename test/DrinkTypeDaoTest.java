import io.khasang.qb.config.AppContext;
import io.khasang.qb.config.AppSecurityConfig;
import io.khasang.qb.config.application.WebConfig;
import io.khasang.qb.config.db.HibernateConfig;
import io.khasang.qb.controller.AppController;
import io.khasang.qb.dao.DrinkTypeDao;
import io.khasang.qb.entity.Drink;
import io.khasang.qb.entity.DrinkType;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, HibernateConfig.class, AppSecurityConfig.class})
public class DrinkTypeDaoTest {
    private static final Logger log = Logger.getLogger(DrinkTypeDaoTest.class);
    @Autowired
    DrinkTypeDao drinkTypeDao;

    /*@Test
    public void testGetDrinkTypeByID(){
        assertEquals("Beer", drinkTypeDao.getDrinkTypeById(1));
    }*/

    @Test
    public void testGetAll(){
        List<DrinkType> drinks = drinkTypeDao.getAll();
        assertNotNull(drinks);
        log.info(drinks.get(0).getTypeName());
        log.info(drinks.get(1).getTypeName());
        assertEquals("Beer", drinks.get(0).getTypeName());
        assertEquals("Kvass", drinks.get(1).getTypeName());
    }
}
