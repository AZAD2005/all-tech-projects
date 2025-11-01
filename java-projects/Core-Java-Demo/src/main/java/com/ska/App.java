package com.ska;

import com.pojo.DoctorModel;

import java.util.List;

public class App {

    public static void main(String[] args) {
        byte b = 10; // 1 byte
        short s = b;
        int i = b;
        long l = b;

        float f = b;
        double d = b;
    }

    static float methodOne(int i) {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }


}

