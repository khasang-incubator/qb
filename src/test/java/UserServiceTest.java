import io.khasang.qb.entity.User;
import io.khasang.qb.service.UserService;
import org.junit.*;

public class UserServiceTest {
    private UserService userService;
    @Test
    public void selectUserById() {
        User user = userService.getUserById(2);
        Assert.assertEquals("Петров", user.getName());
    }

}
