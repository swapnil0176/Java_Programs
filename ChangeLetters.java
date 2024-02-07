//Have the function LetterChanges(str) take the str parameter being passed and modify it
// using the following algorithm. Replace every letter in the string with the letter
// following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel
// in this new string (a, e, i, o, u) and finally return this modified string.
package daily.Java_Programs;

import java.util.Scanner;

public class ChangeLetters {
    String letterChanges(String str) {
        String changesString = "";

        for (int i = 0; i < str.length(); i++) {
            char cha=str.charAt(i);

            if(cha==' '){
                changesString+=(char)cha;
            }
            else{
                if(cha=='z'){
                    changesString+='a';
                }
                else{
                    changesString+=(char)(cha+1);
                }
            }
            if(changesString.charAt(i)=='a' || changesString.charAt(i)=='e' || changesString.charAt(i)=='i' || changesString.charAt(i)=='o' || changesString.charAt(i)=='u'){
               char temp=changesString.toUpperCase().charAt(i);
               changesString=changesString.replace(changesString.charAt(i),temp);
            }
        }
        return changesString;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ChangeLetters letter=new ChangeLetters();
        System.out.print("Enter String: ");
        System.out.println("The changed String is :"+letter.letterChanges(sc.nextLine()));
    }
}