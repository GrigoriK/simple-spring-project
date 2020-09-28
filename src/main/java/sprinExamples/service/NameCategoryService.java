package sprinExamples.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sprinExamples.entity.NameCategory;
import sprinExamples.repo.NameCategoryRepo;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class NameCategoryService {
    private final NameCategoryRepo nameCategoryRepo;

    public Collection<NameCategory> showAllEntities() {
       return nameCategoryRepo.findAll();

    }


}
