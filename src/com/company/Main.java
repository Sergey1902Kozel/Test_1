package com.company;

import java.util.Scanner;
import java.util.function.*;

public class Main {


    public static void main(String[] args) {
        Runnable t=()->{
            System.out.println("Поток из руна ствртовал      "+Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException er){

            }
            System.out.println("Поток из руна финиширвал    "+Thread.currentThread().getName());

        };

        Thread t1=new Thread(t,"Victor");
        System.out.println("Поток из майна стартовал  ");
        t1.start();


        System.out.println("Поток из майна финишировал  ");
    }
}











