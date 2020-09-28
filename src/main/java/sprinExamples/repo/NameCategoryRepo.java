package sprinExamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sprinExamples.entity.NameCategory;

import java.util.UUID;

public interface NameCategoryRepo extends JpaRepository<NameCategory, UUID> {


}
