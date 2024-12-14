package com.demo.MavenProject;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mavenDemo.CustomJar.Employee;
public class CustomJar
{
    public static void main( String[] args ) throws JsonProcessingException
    {
   
        
        Employee emp= new Employee("Rahul",23,5000);
        Employee emp2= new Employee("Sanjay",24,4000);
        Employee emp3= new Employee("Ramu",26,30000);
        Employee emp4= new Employee("Babu",21,50700);
        Employee emp5= new Employee("Shyam",29,60600);
        Employee emp6= new Employee("Raju",27,5070);
        Employee emp7= new Employee("Rampal",20,90520);
        Employee emp8= new Employee("Kachara",29,80500);
        Employee emp9= new Employee("Chinmay",21,50700);
        Employee emp10= new Employee("Jigo",24,4010);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);
        
        ObjectMapper mapper= new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
        
        System.out.println(json);
        
        
        
       
        
        
        
    }
}
