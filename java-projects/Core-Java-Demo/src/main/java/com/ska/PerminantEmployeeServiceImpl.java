package com.ska;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl2 extends  EmployeeServiceImpl{

    List<String> employeeNameList = new ArrayList<>();
    public EmployeeServiceImpl2(){
        employeeNameList.add("Kamal");
        employeeNameList.add("Azad");
        employeeNameList.add("Arafath");
        employeeNameList.add("Hamid");
    }

    public List<String> fetchAllEmployeeName(){
        return  employeeNameList;
    }


}
