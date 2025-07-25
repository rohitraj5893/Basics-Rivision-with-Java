package Rivision.Basic;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        System.out.println("Given number prime : " + helper(number));
    }
    private  static  boolean helper(int number){
        for(int i = 2; i * i <= number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
