package com.week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int Salary;
    private double texrate;

    public Employee() {
    }

    public Employee(String name, int age, int salary, double texrate) {
        this.name = name;
        this.age = age;
        Salary = salary;
        this.texrate = texrate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public double getTexrate() {
        return texrate;
    }

    public void setTexrate(double texrate) {
        this.texrate = texrate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                ", texrate=" + texrate +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
