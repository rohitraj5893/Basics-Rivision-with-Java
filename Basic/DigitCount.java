package Rivision.Basic;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        System.out.println("Number of Digits in "+ number +" is " + Digits(number));
        System.out.println("Number of Digits in "+ number +" is " + DigitsRecursion(number,0));

    }

    // Using Loop
    private static int Digits(int number){
         int count = 0;
         while(number > 0){
             count++;
             number /= 10; // number = number / 10;
         }
         return  count;
    }
    // Using Recursion
    private static int DigitsRecursion(int number,int count){
        if(number <= 0) return count;
        return DigitsRecursion(number / 10 ,++count);
    }
}
