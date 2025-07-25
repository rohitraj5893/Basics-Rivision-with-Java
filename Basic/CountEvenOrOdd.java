package Rivision.Basic;

import java.util.Scanner;

public class CountEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        System.out.println("The Even number in the given number is : " + EvenDigits(number));
    }
    private  static  int EvenDigits(int number){
        int even_count = 0;
        while(number > 0){
           int ld = number % 10;
            if(ld % 2 == 0 && ld != 0){
                even_count ++;
            }
            number /= 10;
            }
        return  even_count;
    }
    //
}
