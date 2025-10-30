package com.ska;

public class EmployeeTest {
    public static void main(String[] args) {
Employee employee = new Employee("Kamal",1212,35,12000d);
Double dSalary = employee.getEmpSalary();
        System.out.println(dSalary);
String name = employee.m2(employee.empName, employee.empId);
        System.out.println(name);
    }
}
