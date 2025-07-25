package Rivision.Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Upto which number you want to print : ");
        int upto = input.nextInt();
        Fibonacci(upto);
        System.out.println();
        System.out.print("which number you want to print : ");
        int nth = input.nextInt();
        System.out.println(FibonacciRecursion(nth));

    }
    //Using loop
    private static void Fibonacci(int limit){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for(int i = 3; i <=limit; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
    private static int FibonacciRecursion(int nth){
        if(nth < 2) return  nth;

        return FibonacciRecursion(nth - 1) + FibonacciRecursion(nth - 2);
    }
}
