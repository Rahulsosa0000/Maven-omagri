package com.StudentManagementSystem;


import com.google.gson.*;
import java.io.*;
import java.util.*;

public class StudentDataManager {
    private List<Student> students;

    public StudentDataManager() {
        students = new ArrayList<>();
    }

    // Add a student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Save students to a file (Serialization)
    public synchronized void saveStudentsToFile(String filePath) {
        try (Writer writer = new FileWriter(filePath)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(students, writer);  // Serialize the list of students to JSON
            System.out.println("Data has been serialized to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read students from a file (Deserialization)
    public synchronized void loadStudentsFromFile(String filePath) {
        try (Reader reader = new FileReader(filePath)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            students = Arrays.asList(gson.fromJson(reader, Student[].class));  // Deserialize JSON into a list of students
            System.out.println("Data has been deserialized from " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Display all students
    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Age: " + student.getAge());
        }
    }
}

