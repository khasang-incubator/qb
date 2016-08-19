import io.khasang.qb.entity.Pizza;
import org.junit.*;
import org.junit.Test;

public class PizzaServiceTest {
    PizzaService pizzaService;
    @Test
    public void selectPizzaById() {
        Pizza pizza = pizzaService.getPizzaById(5);
        Assert.assertEquals("Острая", pizza.getName());
    }

}
