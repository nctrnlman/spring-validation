package rhazes.rhazesspringvalidation;

import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rhazes.rhazesspringvalidation.helper.SayHello;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess(){
        String message = sayHello.sayHello("Rhazes");
        Assertions.assertEquals("Hello Rhazes",message);
    }

    @Test
    void testError() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
           sayHello.sayHello("");
        });
    }
}
