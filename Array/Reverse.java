package Rivision.Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = input.nextInt();
        }
        ReverseArray(arr);
        System.out.println();
        ReverseArrayTwoPointer(arr);
    }
    // using brute force
    private  static  void ReverseArray(int[] arr){
        if(arr.length == 0) return;
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reverse[arr.length - 1 - i] = arr[i];
        }
        for(int i = 0 ; i < reverse.length; i++){
            System.out.print( reverse[i] + " ");
        }
    }
    private  static  void ReverseArrayTwoPointer(int[] arr){
        if(arr.length == 0) return;
        int i = 0,j = arr.length -1;
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0 ; k < arr.length; k++){
                System.out.print( arr[k] + " ");
        }
    }
}
