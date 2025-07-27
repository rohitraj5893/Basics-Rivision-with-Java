package Rivision.Array;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(findDuplicate(arr));

    }
    // using
    public static int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length] ;
        for(int i = 0; i < nums.length; i++){
            if(freq[i] == -1) return  i;
            freq[i] = -1;
        }

        return -1;
    }
}
