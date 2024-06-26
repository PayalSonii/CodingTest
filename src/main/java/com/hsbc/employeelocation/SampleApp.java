package com.hsbc.employeelocation;

import java.util.ArrayList;
import java.util.List;

class SampleApp {

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ashish", "A", "IT", "Pune", "Software Engineer", Double.valueOf(10000)));
        employees.add(new Employee("Amit", "R", "HR", "Pune", "Recruiter", Double.valueOf(12000)));
        employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter", Double.valueOf(14000)));
        employees.add(new Employee("Jaya", "S", "IT", "Pune", "Tech Lead", Double.valueOf(15000)));
        employees.add(new Employee("Smita", "M", "IT", "Bangalore", "Recruiter", Double.valueOf(16000)));
        employees.add(new Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer", Double.valueOf(12000)));
        employees.add(new Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer", Double.valueOf(12000)));
        employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Recruiter", Double.valueOf(16000)));
        employees.add(new Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead", Double.valueOf(20000)));
        employees.add(new Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer", Double.valueOf(14000)));


        FindAverageSalaryApp app = new FindAverageSalaryApp();
        app.findAverageSalary(employees);

    }

}