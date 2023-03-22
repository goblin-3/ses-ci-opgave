package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("give to add numbers ");
int x = myObj.nextInt();
int y = myObj.nextInt();
int z = Calculator(x,y);
System.out.println(z+" \n");

    }


    public static int Calculator(int x, int y){
int z= x +y;
       return z;

    }
}