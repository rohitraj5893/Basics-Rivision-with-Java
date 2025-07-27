package Rivision.Array;

import java.util.Scanner;

public class MinAndMaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Min : " + minElement(arr) + "\n" + "Max : " + maxElement(arr));
        System.out.println("Min : " + minElementRec(arr,0,Integer.MAX_VALUE) + "\n" +"Max : " + maxElementRec(arr,0,Integer.MIN_VALUE));
    }
    // for minimum
    private  static  int minElement(int[] arr){
        if(arr.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;  i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
// for maximum
    private  static  int maxElement(int[] arr){
        if(arr.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;  i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    // using recursion
    private static  int minElementRec(int[] arr, int ind, int min){
        if(ind >= arr.length) return  min;
        min  = Math.min(arr[ind],min);
        return minElementRec(arr,ind + 1,min);
    }
    // using recursion
    private static  int maxElementRec(int[] arr, int ind, int max){
        if(ind >= arr.length) return  max;
        max  = Math.max(arr[ind],max);
        return maxElementRec(arr,ind + 1,max);
    }
}
