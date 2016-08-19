import io.khasang.qb.entity.Pizza;
import org.junit.*;
import org.junit.Test;

public class PizzaServiceTest {
    @Test
    public void selectPizzaById() {
        Pizza pizza = PizzaService.getPizzaById(5);
        Assert.assertEquals("Острая", pizza.getName());
    }

}
