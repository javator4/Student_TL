package pl.sda.student;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Student[] students = objectMapper.readValue(new File("data.json"), Student[].class);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+" "+students[i].getLastname()+ " ");
        }
        }


    }

