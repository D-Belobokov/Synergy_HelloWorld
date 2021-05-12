package com.synergyit.klass;

import java.util.Random;

public  class Kiborg {
    Random random=new Random();
    public  int rMax=random.nextInt(100);
    public  int jMax=random.nextInt(10);

   // public void Kiborg(){};
    public void Kiborg(int rMax,int jMax){
        this.rMax=rMax;
        this.jMax=jMax;
    }
}
