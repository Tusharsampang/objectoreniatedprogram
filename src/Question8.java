//Write a Java program to compute body mass index (BMI).
// Note: The formula is BMI = kg/m2where kg is a person's weight in kilograms and m2is their height in metres squared.

import java.util.Scanner;
public class Question8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in meter :");
        double height =sc.nextDouble();
        System.out.println("Enter the weight in kg :");
        double weight = sc.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("The BMI is" + BMI);
    }
}
