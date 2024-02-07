//Have the function ABCheck(str) take the str parameter being passed and return the string
// true if the characters a and b are separated by exactly 3 places anywhere in the string
// at least once (ie. "lane borrowed" would result in true because there is exactly three characters
// between a and b). Otherwise return the string false.
package daily.Java_Programs;

import java.util.Scanner;

public class CountStringQue1 {
    boolean countString(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                if (i + 4 < str.length() && str.charAt(i + 4) == 'b') {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        CountStringQue1 c= new CountStringQue1();
        System.out.println("Enter String");
        if(c.countString(sc.nextLine())){
            System.out.println("Exact String found");
        }
        else {
            System.out.println("Not exact String found");
        }
    }
}
