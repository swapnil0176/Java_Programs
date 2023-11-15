package com.AngularJava;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a', 'e', 'i', 'o','u','A', 'E', 'I', 'O','U'->System.out.println("You enter Vowel");
            default -> System.out.println("You enter either special character,integer or constant");
        }
    }
}
