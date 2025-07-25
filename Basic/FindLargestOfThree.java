package Rivision.Basic;

import java.util.Scanner;

public class FindLargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three Number : ");
        int number_1 = input.nextInt();
        int number_2 = input.nextInt();
        int number_3 = input.nextInt();
        System.out.println("In the Given Number , Largest one is : " + Largest(number_1,number_2,number_3));
    }
    private  static  int Largest(int n1,int n2,int n3){
        if(n1 >= n2 && n1 >= n3) return n1;
        else if(n2 >= n1 && n2 >= n3) return  n2;
        return n3;
    }
}
