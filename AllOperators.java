package com.AngularJava;

import java.util.Scanner;

public class AllOperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Addition of "+num1+"+"+num2+"="+(num1+num2));
        System.out.println("Subtraction of "+num1+"-"+num2+"="+(num1-num2));
        System.out.println("Multiplication of "+num1+"*"+num2+"="+(num1*num2));
        System.out.println("Division of "+num1+"/"+num2+"="+(num1/num2));
        System.out.println("Mod of "+num1+"%"+num2+"="+(num1%num2));
    }
}
