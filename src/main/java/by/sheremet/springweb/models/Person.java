package by.sheremet.springweb.models;

import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 15, message = "Name should be between 2 and 15 characters")
    private String name;


    @Min(value = 0, message = "Age should be greater than 0 ")
    private int age;

    @Min(value = 0, message = "Salary should be greater than 0")
    @Max(value = 2000, message = "Salary should not be greater than 2000")
    private List<Integer> salary;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    {
        salary = new ArrayList<>();
    }

    public List<Integer> getSalary() {
        return salary;
    }

    public void setSalary(List<Integer> salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){};

    public Person(int id, String name, int age, List<Integer> salary, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
