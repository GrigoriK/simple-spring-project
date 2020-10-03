package sprinExamples.crnk;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@JsonApiResource(type = "person")
public class Person {

    @JsonApiId
    private UUID id;
    private String name;
    private String telephone;

    public Person(UUID id, String name, String telephone) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
    }
}
