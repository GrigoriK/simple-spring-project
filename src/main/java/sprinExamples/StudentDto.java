package sprinExamples;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class StudentDto {
    private UUID id;
    private String name;
    private int course;

}
