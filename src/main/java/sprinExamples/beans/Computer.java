package sprinExamples.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
import sprinExamples.annotations.UserAnnotation;

@Component
@Data
@UserAnnotation
public class Computer {
    private String name;
    private int age = 10;


    public static String getStaticComputerName() {
        return "Macbook";
    }
}
