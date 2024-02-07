//Have the function LongestWord(sen) take the sen parameter being passed and return the
// longest word in the string. If there are two or more words that are the same length, return
// the first word from the string with that length. Ignore punctuation and assume sen will not be empty.
// Words may also contain numbers, for example "Hello world12 567"
package daily.Java_Programs;

import java.util.Scanner;

public class LongestString {
    String longString(String str){
        String [] splitstring=str.split(" ");
        String word=splitstring[0];
        for(String str2: splitstring){

            if(str2.length()>word.length()){
                word=str2;
            }
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String: ");
        LongestString a=new LongestString();
        System.out.println("The longest String is:- "+a.longString(sc.nextLine()));

    }
}
