package sprinExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sprinExamples.beans.AnnotationBeanCollection;
import sprinExamples.beans.SimpleDataService;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        AnnotationBeanCollection bean = ctx.getBean(AnnotationBeanCollection.class);
        SimpleDataService service = ctx.getBean(SimpleDataService.class);
        service.getStaticComputerName();



    }

}