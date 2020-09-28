package sprinExamples.beans;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import sprinExamples.StudentDto;
import sprinExamples.annotations.UserAnnotation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Slf4j
public class SimpleDataService {
    private final JdbcTemplate jdbcTemplate;
    @Value("#{computer.age>18}")
    private   boolean isEighteen;
    @Value("#{{computer.staticComputerName}}")
    private   String staticComputerName;

    public void getData(){
        List<StudentDto> query = jdbcTemplate.query("Select * from public.students",
                new RowMapper<StudentDto>() {
                    @Override
                    public StudentDto mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new StudentDto(resultSet.getObject("id", UUID.class),
                                resultSet.getString("name"), resultSet.getInt("course"));
                    }
                });
        System.out.println("Finish");
    }
    public void isProhibited(){
        if(isEighteen){
            log.info("Access is allowed");
        }else {
            log.info("Access is denied");
        }
    }

    public void getStaticComputerName(){

            log.info(staticComputerName);

    }
}
