package com.ska;

import com.pojo.DoctorModel;

public class App {

    public static void main(String[] args) {

        DoctorModel doctorModel = new DoctorModel();
        doctorModel.setdAge(45);
        doctorModel.setdName("Azad");
        doctorModel.setLocation("MVG");

Integer age = doctorModel.getdAge();
        System.out.println(age);

        doctorModel.setMBBSDocrot(true);
        Boolean bolean = doctorModel.getMBBSDocrot();
        System.out.println(bolean);
    }

}

