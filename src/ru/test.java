package com.synergyit.klass;

import java.util.Random;




public class test {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);

        }
        Kiborg f=new Kiborg();


        for(int i=0;i<array.length;i++){
            if(array[i]<=f.rMax) {
                System.out.println("Дистанция m:"+array[i]+"\tКиборг бежит");
            }
            if(i==10){
                System.out.println("Дистанция пройдена");
            }
            else{
                System.out.println("киборг отбегался");
                break;
            }
        }

    }
}
