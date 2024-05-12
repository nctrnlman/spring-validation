package rhazes.rhazesspringvalidation.helper;


import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class SayHello implements ISayHello{

    public String sayHello(@NotBlank String name){
        return "Hello "+ name;
    }
}
