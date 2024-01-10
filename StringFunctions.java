package com.AngularJava.DailyPrograms.Java_Programs;

import java.util.Scanner;

public class StringFunctions {
    Scanner sc= new Scanner(System.in);
    public void StringCharAt(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter index you want to see character ");
        int index=sc.nextInt();
        System.out.println(str1.charAt(index));
    }
    public void StringCompareTo(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter 1 String");
        String str2=new String(sc.nextLine());
        if(str1.compareTo(str2)==0){
            System.out.println("Two strings are same");
        }
        else if(str1.compareTo(str2)>0)
            System.out.println("1 String is greater than 2");
        else
            System.out.println("2 String is greater than 1");
    }
    public void StringConcat(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter 1 String");
        String str2=new String(sc.nextLine());
        System.out.println("1 String:-"+str1+"\n2 String:-"+str2);
        System.out.println("2 Strings after concatenation:- "+str1.concat(str2));
    }
    public void StringContains(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter string do want to search in above string");
        String temp=sc.next();
        if(str1.contains(temp)){
            System.out.println("String contains"+temp);
        }
        else {
            System.out.println("String does not contains "+temp);
        }
    }
    public void StringEndsWith(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter string do want to search at end of above string");
        String temp=sc.next();
        if(str1.endsWith(temp)){
            System.out.println("String end with "+temp);
        }
        else {
            System.out.println("String does not end with  "+temp);
        }
    }
    public void StringEquals(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter string do want to search in above string");
        String str2=sc.next();
        if(str1.equals(str2))
            System.out.println("String 1 and String 2 are same it returns true");
        else
            System.out.println("String 1 and String 2 are Different it returns false");
    }

    public void StringEqualsIgnoreCase(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter 1 String");
        String str2=new String(sc.nextLine());
        if(str1.equalsIgnoreCase(str2))
            System.out.println("String 1 and String 2 are same it returns true it ignore the case sensitivity of String");
        else
            System.out.println("String 1 and String 2 are Different it returns false");
    }
    public void StringFormat(){
        System.out.println("Enter  String");
        String str1=new String(sc.nextLine());
        String sf1=String.format("name is %s",str1);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
    public void StringGetBytes(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        byte[] temp=str1.getBytes();
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }

    public void StringGetChars(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        char[] ch = new char[10];
        try{
            str1.getChars(1, 3, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
    }
    public void StringIndexOf(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter substring");
        String temp=sc.next();
        int index1=str1.indexOf(temp);//returns the index of is substring
        System.out.println(index1);
        System.out.println("Enter character want to search in String");
        char ch=sc.next().charAt(0);
        index1=str1.indexOf(ch);//returns the index of s char value
        System.out.println(index1);
    }

    public void StringIntern(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter 1 String");
        String str2=sc.nextLine();
        String str3=str1.intern();//returns string from pool, now it will be same as s2
        System.out.println("false because reference variables are pointing to different instance "+str1==str2);//false because reference variables are pointing to different instance
        System.out.println("true because reference variables "+str2==str3);//
    }
    public void StringIsEmpty(){
        System.out.println("Enter 1 String");
        String str1=new String(sc.nextLine());
        if (str1.isEmpty()){
            System.out.println("String is empty");
        }
        else {
            System.out.println("String is Not empty");
        }
    }
    public void StringLastIndexOf(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter substring");
        String temp=sc.next();
        int index1=str1.lastIndexOf(temp);//returns the index of is substring
        System.out.println(index1);
        System.out.println("Enter character want to search in String");
        char ch=sc.next().charAt(0);
        index1=str1.lastIndexOf(ch);//returns the index of s char value
        System.out.println(index1);
    }
    public void StringLength(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        System.out.println("String length is "+str1.length());
    }
    public void StringReplace(){
        System.out.println("Enter String");
        String str1=new String(sc.nextLine());
        System.out.println("Enter target string  ");
        String target=sc.next();
        System.out.println("Enter string do you want to replace  ");
        String temp=sc.next();
        System.out.println(str1.replace(target,temp));
    }


}

