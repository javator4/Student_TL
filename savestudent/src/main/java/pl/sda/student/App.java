package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Tomasz","Łaszkiewicz", 1));
        studentList.add(new Student("Łukasz","Łaszkiewicz", 2));
        studentList.add(new Student("Wojtek","Łaszkiewicz", 3));
        studentList.add(new Student("Mariusz","Łaszkiewicz", 4));
        studentList.add(new Student("Jan","Łaszkiewicz", 5));
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            objectMapper.writeValue(new File("data.json"), studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
