package Rivision.Array;
import  java.util.HashMap;
import java.util.Scanner;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(containsNearbyDuplicate(arr,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Brute Force
        //   for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             if((int)Math.abs(i - j) <= k) return true;
        //         }
        //     }
        //   }
        // return false;

        // Optimize Solution
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){


            if(map.containsKey(nums[i])){
                if((i - map.get(nums[i])) <= k) return true;
            }

            map.put(nums[i],i);
        }
        return false;

    }
}
