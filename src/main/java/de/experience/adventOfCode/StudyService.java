package de.experience.adventOfCode;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StudyService {

    public String ausprobieren(String input){
        String huhu1 = "huhu";
        return input + " " + huhu1;
    }
}
