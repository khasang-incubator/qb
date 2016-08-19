import io.khasang.qb.config.AppContext;
import io.khasang.qb.config.AppSecurityConfig;
import io.khasang.qb.config.application.WebConfig;
import io.khasang.qb.config.db.HibernateConfig;
import io.khasang.qb.dao.DrinkTypeDao;
import io.khasang.qb.entity.Drink;
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
    @Autowired
    DrinkTypeDao drinkTypeDao;

    @Test
    public void testGetDrinkTypeByID(){
        assertEquals("Beer", drinkTypeDao.getDrinkTypeById(1));
    }

    @Test
    public void testGetAll(){
        List<Drink> drinks = drinkTypeDao.getAll();
        assertNotNull(drinks);
        assertEquals("Beer", drinks.get(0));
        assertEquals("Kvass", drinks.get(1));
    }
}
