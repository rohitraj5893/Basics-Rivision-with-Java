package Rivision.Basic;

import java.awt.*;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        System.out.println(Reverse(number));
        System.out.println(ReverseRecursion(number,0));
    }
    // Using Loop with TC-O(no. of digit of the number)
    private  static  int Reverse(int number){
        int rev = 0;
        while(number > 0){
            int lastdigit = number % 10;
            rev = rev * 10 + lastdigit;
            number /= 10;
        }
        return rev;
    }
    private  static  int ReverseRecursion(int number,int rev){
        if(number <= 0) return rev;
        return ReverseRecursion(number/10 , rev * 10 + (number %10));
    }

}
