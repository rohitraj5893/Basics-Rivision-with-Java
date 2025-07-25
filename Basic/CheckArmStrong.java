package Rivision.Basic;

import java.util.Scanner;

public class CheckArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        System.out.println("Given Number Armstrong : " + helper(number));
    }
    private  static  boolean helper(int number){
        int number_1 = number;
        int temp = number;
        int ans = 0;
        int digit = 0;
        while(number_1 > 0){
           digit++;
           number_1 /= 10;
        }
        while(temp > 0){
            int ld = temp % 10;
           ans += (int) Math.pow(ld,digit);
           temp /= 10;
        }
        if(number == ans) return  true;
        return  false;
    }
}
