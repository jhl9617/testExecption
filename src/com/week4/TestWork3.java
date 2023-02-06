package com.week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestWork3 {
    public static <employees> void main(String[] args) throws IOException {

        //Employee[] employees = new Employee[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.print("사원명 : ");
            String name = reader.readLine();
            System.out.print("나이 : ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("급여 : ");
            int salary = Integer.parseInt(reader.readLine());
            System.out.print("세율 : ");
            double texrate = Double.parseDouble(reader.readLine());
            //employees[i] = new Employee(name, age, salary, texrate);
            employees.add(new Employee(name, age, salary, texrate));
            System.out.println(employees.get(i));
        }




        Collections.sort(employees);
        System.out.println(employees);

        for (int i = 0 ; i < 5; i++){
            System.out.println(employees.get(i));
        }



    }
}