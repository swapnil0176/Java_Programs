//Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and
//return the string true if it's a power of two. If it's not return the string false. For
//example if the input is 16 then your program should return the string true but if the input is 22 then
//the output should be the string false.
package daily.Java_Programs;

import java.util.Scanner;

public class PowerOfNo {
    String powerOfTwo(int num){
        while (num > 1) {
            if (num % 2 != 0) {
                return "false";
            }
            num /= 2;
        }
        if(num==1)
            return "true";
        return "false";
    }

    public static void main(String[] args) {
        PowerOfNo obj= new PowerOfNo();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        if("true"==obj.powerOfTwo(sc.nextInt())){
            System.out.println("No is power of two");
        }
        else
            System.out.println("No is NOT power of two");
    }
}
