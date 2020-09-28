package sprinExamples;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Slf4j
@Component
public class Aspect {
    @Pointcut("execution(* ComputerService.repairComputer(..))")
    public void printSomeWords() {

    }

    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* ComputerService.returnModelByName(String)) && args(computerName)")
    public void interceptComputerName(String computerName) {
    }
//
//    @After("execution( * ComputerService.returnComputer(..))")
//    public void pay() {
//        log.info("Please, take money");
//    }
//
//    @Before("printSomeWords()")
//    public void bringComputer() {
//        log.info("I bring you my crash computer");
//    }
@Before("interceptComputerName(computerName)") // Передача параметра в совет
public void interceptThoughts(String computerName) {
   log.info("Intercepting computer name :{} "
            ,computerName);
}

    @Around("printSomeWords()")
    public void showInfo(ProceedingJoinPoint joinpoint) {
        try {
            log.info("I bring you my crash computer");
            joinpoint.proceed();
            log.info("Please, take money");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
