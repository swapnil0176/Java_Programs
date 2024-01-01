//WAP to accept choice from user and execute the process
//        1:Boxing
//        2:Unboxing
//        3:Garbage collection
package com.AngularJava.DailyPrograms.Java_Programs;

import java.util.Scanner;

public class AutoUnBoxing {

//    public void finalize(){
//        System.out.println("Object is remove");
//    }
    public static void main(String[] args) {
        char ch;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("\n1)Auto Boxing" +
                    "\n2)UnBoxing" +
                    "\n3)Garbage collection");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Auto Boxing->> It is term in which convert primitive " +
                            "data type into appropriate wrapper class(Object class)");
                    System.out.println("Enter integer number ");
                    int no= sc.nextInt();
                    Integer num=no;
                    System.out.println("number is converted into object:- "+num);
                }
                case 2->{
                    System.out.println("UnBoxing->> It is term in which convert Object " +
                            "into primitive data types");
                    System.out.println("Enter integer number ");
                    Integer no= sc.nextInt();
                    int num=no;
                    System.out.println("number is converted into primitive data type:- "+num);
                }
                case 3->{
                    System.out.println("Garbage Collection ->> It is known as automatic memory management" +
                            "The un reference,null object is destroy at run time");
                    AutoUnBoxing obj=new AutoUnBoxing();
                    System.out.println("Object is created ");
                    obj=null;
                    System.out.println("Object is initialise to null value");
                    System.gc();

                }

            }
            System.out.println("Do you want to repeat menu");
            ch=sc.next().charAt(0);
        }while(ch=='y' ||ch=='Y');
    }
}
