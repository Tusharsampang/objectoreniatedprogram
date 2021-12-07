//Write a Java program that accepts two floating-point numbers and checks whether they are the same up to
// two decimal places.

import java.util.Scanner;
public class Question7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first float number:");
        float num1 = sc.nextFloat();
        System.out.print("enter the second float number:");
        float num2 = sc.nextFloat();
        if (Math.abs(num1 - num2) <= 0.01){
                System.out.print("same number");
            }
            else{
                System.out.print("different number.");
            }
    }

}
