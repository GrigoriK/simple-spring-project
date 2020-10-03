package sprinExamples.repo;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.stereotype.Component;
import sprinExamples.crnk.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class PersonCrnkrepo extends ResourceRepositoryBase<Person, UUID> {
    private Map<UUID, Person> IdToPerson = new HashMap<>();

    public PersonCrnkrepo() {
        super(Person.class);
        UUID id = UUID.randomUUID();
        IdToPerson.put(id, new Person(id, "testUser","111111"));
    }

    @Override
    public synchronized ResourceList<Person> findAll(QuerySpec querySpec) {
        return querySpec.apply(IdToPerson.values());
    }
}
