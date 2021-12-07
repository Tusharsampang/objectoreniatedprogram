//Write a Java program for sorting a given list of names in ascending order?

import java.util.Scanner;
public class Question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int num = sc.nextInt();
        String[] str = new String[num];
        System.out.println("Enter strings: ");
        for(int i = 0; i < num; i++){
            str[i] = new String(sc.next());
        }
        for(int i = 0; i < num; i++){
            for(int j = i+1; j < num; j++)
                {
                    if(str[i].compareTo(str[j])>0){
                        String temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
            System.out.print("Sorted list of strings is:");
            for(int i = 0; i < num; i++)
            {
                System.out.print(str[i]);
            }
    }
}


