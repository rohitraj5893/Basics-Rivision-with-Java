package Rivision.Basic;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number_1 : "); // 5
        int number_1 = input.nextInt();
        System.out.print("Enter the Number_2 : "); // 6
        int number_2 = input.nextInt();
        number_1 = number_1 + number_2; // n1 = (5 + 6) = 11
        number_2 = number_1 - number_2; // n2 = (11 - 6) = 5
        number_1 = number_1 - number_2; // n1 = (11 - 5) = 6
        System.out.println("number_1 : " + number_1 +"\n" + "number_2 : " + number_2);

    }
}
