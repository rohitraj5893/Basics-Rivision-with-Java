package Rivision.Basic;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        System.out.println("Number Palindrome : " +helper(number));
        System.out.println("Number Palindrome : " +helperloop(number));

    }
    // For the Number Using Recursion
    private static boolean helper(int number){
        return (number == ReverseRecursion(number,0));
    }
    private  static  int ReverseRecursion(int number,int rev){
        if(number <= 0){
            return rev;
        }
        return ReverseRecursion(number/10 , rev * 10 + (number %10));
    }
    // Using loop
    private static boolean helperloop(int number){
        return (number == Reverse(number));
    }
    private  static  int Reverse(int number){
        int rev = 0;
        while(number > 0){
            int lastdigit = number % 10;
            rev = rev * 10 + lastdigit;
            number /= 10;
        }
        return rev;
    }

}
