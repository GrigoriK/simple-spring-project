package sprinExamples.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sprinExamples.entity.NameCategory;
import sprinExamples.service.NameCategoryService;

import java.util.Collection;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/testController")
public class TestController {
    private final NameCategoryService nameCategoryService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public void showTestMassage() {
        Collection<NameCategory> nameCategories = nameCategoryService.showAllEntities();
        log.info(nameCategories.toString());
    }
}
