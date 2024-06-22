package com.hsbc.employeelocation;
/*

Application has Employee class details with it such as First name, Last name, Salary, Department, Designation, OfficeLocation etc.
Write a logic for given list of employees to find out average salary in each OfficeLocation for all common Designation.
 Also, try to demonstrate parallel processing for each OfficeLocation.
 */

import java.util.List;
import java.util.stream.Collectors;

class FindAverageSalaryApp{

    public void findAverageSalary(List<Employee> employees){

        var avgSalaryByDesignationAndLocation = employees.stream().collect(Collectors.groupingByConcurrent(Employee::getOfficeLocation, Collectors.groupingByConcurrent(Employee::getDesignation,
                Collectors.averagingDouble(Employee::getSalary))));

avgSalaryByDesignationAndLocation.forEach((location, salaryByDesignation) ->
{
    StringBuilder builder = new StringBuilder();

    salaryByDesignation.forEach((designation, salary) ->{

        String salaryFormatted = String.format("%.2f", salary);
        builder.append(location+"-->"+designation+"-->"+salaryFormatted);
        builder.append(System.getProperty("line.separator"));
    });

    System.out.println(builder.toString());
});

    }

}