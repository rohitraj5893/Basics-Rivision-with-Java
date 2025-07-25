package Rivision.Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
//        System.out.println("Factorial of " + number + " is " +Factorial(number));
        System.out.println("Factorial of " + number + " is " +FactorialRecursion(number));

    }
    // Using Loop
    private static  BigInteger  Factorial(int number){
        if(number == 0) return BigInteger.ONE;
//        int fac = 1; // it will give negative value for large input values
        BigInteger fac = BigInteger.ONE;
        for(int i = 1; i <= number; i++){
//            fac *= i; // give error because we multiply the object by the integer
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;

    }
    //Using Recursion
    private static int FactorialRecursion(int number){
        if(number == 0 ) return 1;
        return number * FactorialRecursion(number - 1);
    }
}
