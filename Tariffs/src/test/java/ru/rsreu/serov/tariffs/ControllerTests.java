package ru.rsreu.serov.tariffs;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.rsreu.serov.tariffs.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(UserController.class)
public class ControllerTests {

    @InjectMocks
    private UserController userController;

    @Test
    public void editUser() {
//        User user = userRepository.findById(1);
//        Assert.assertEquals(user.getLogin(), "а2");
    }
}
