//Write a java program to check weather a given number is Armstrong number or not.
// Note: An Armstrong number of a three-digit number is a number in which
// the sum of the cube of the digits is equal to the number itself.
// Hence 153 is an Armstrong
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        int temp, remainder;
        int result =  0 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check whether it's armstrong or not:");
        int number = sc.nextInt();
        int n = String.valueOf(number).length();
        temp = number ;
        while (temp > 0 ){
            remainder = temp % 10 ;
            result += Math.pow(remainder, n);
            temp = temp / 10 ;
        }
        if (number == result){
            System.out.println(number  + " is an Armstrong Number");
        }
        else {
            System.out.println(number + " is not an Armstrong Number");
        }

    }

}
