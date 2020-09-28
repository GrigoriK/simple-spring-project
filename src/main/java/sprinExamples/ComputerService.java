package sprinExamples;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sprinExamples.annotations.UserAnnotation;

@Service
//@Slf4j
@UserAnnotation
public class ComputerService {
    public void repairComputer() {
//        log.info("I repaired your computer!");
    }

    public void returnComputer() {
//        log.info("Please take your computer");
    }

    public void returnModelByName(String computerName) {
//        log.info("Please take your {} computer", computerName);
    }
}
