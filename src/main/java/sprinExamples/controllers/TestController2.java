package sprinExamples.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/testController2")
public class TestController2 {
    @RequestMapping(path = "/test2",method = RequestMethod.GET)
    public void showTestMassage(){
        log.info("Show test Message2");
    }
}
