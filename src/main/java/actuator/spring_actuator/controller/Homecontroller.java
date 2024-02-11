package actuator.spring_actuator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import actuator.spring_actuator.helper.Student;

@RestController
public class Homecontroller {
    @Autowired
    private Student s1;

    @GetMapping("/stud")
    public Map<String, String> getData() {

        return Map.of("name", "abc");
    }
}
