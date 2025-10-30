package com.ska;

public class Employee {
    String empName;
    Integer empId;
    Integer empAge;
    Double empSalary;


    public Employee(String empName,Integer empId,Integer empAge,Double empSalary){
        this.empName = empName;
        this.empAge = empAge;
        this.empId = empId;
        this.empSalary = empSalary;


    }

    public Double getEmpSalary(){
        return this.empSalary;
    }
    public String m2(String empName,Integer empId){
        return String.format("Hii %s your id is : %d",empName,empId);
    }
}
