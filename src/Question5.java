//Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
//1. Square Star Pattern
//*****
//*****
//*****
//*****
//*****

public class Question5 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= column; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}


