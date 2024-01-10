package com.AngularJava.DailyPrograms.Java_Programs;

import java.util.Scanner;

public class CallStringFunctions {
    public static void main(String[] args) {
        StringFunctions obj=new StringFunctions();
        Scanner sc= new Scanner(System.in);
        char choice;
        do{
            System.out.println("\n>>>Methods<<<\n1)CharAt\n2)CompareTo\n3)Concat\n4)Contains\n5)Ends With\n6)Equals\n" +
                    "7)EqualsIgnoreCase\n8)GetBytes\n9)Format\n10)GetChars\n11)Replace\n12)IsEmpty" +
                    "\n13)Intern\n14)LastIndexOf\n15)Length");
            System.out.println("Enter choice ");
            int ch=sc.nextInt();
            switch (ch){
                case 1-> obj.StringCharAt();
                case 2-> obj.StringCompareTo();
                case 3-> obj.StringConcat();
                case 4-> obj.StringContains();
                case 5->obj.StringEndsWith();
                case 6->obj.StringEquals();
                case 7->obj.StringEqualsIgnoreCase();
                case 8->obj.StringGetBytes();
                case 9->obj.StringFormat();
                case 10->obj.StringGetChars();
                case 11->obj.StringReplace();
                case 12->obj.StringIsEmpty();
                case 13->obj.StringIntern();
                case 14->obj.StringLastIndexOf();
                case 15->obj.StringLength();
            }
            System.out.println("You want to repeat menu");
            choice=sc.next().charAt(0);
        }while(choice=='y' ||choice=='Y');









    }
}
