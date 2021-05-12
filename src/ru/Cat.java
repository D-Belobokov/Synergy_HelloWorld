package com.synergyit.klass;

import java.util.Random;

import static java.lang.System.*;

public  class Cat {
    Random random = new Random();
    int distansCat = random.nextInt(100);
    int heigthCat = random.nextInt(10);
    void show(String txt){

        out.println("дистанция"+distansCat);
        return;
    }

}
