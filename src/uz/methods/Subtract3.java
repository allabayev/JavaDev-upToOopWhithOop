package uz.methods;

import java.util.Arrays;

public class Subtract3 {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 2, 2, 6, 2, 2, 8, 2, 2};
        System.out.println(Arrays.toString(removeElement3(array, 2)));
    }
    public static int[] removeElement3(int[] nums, int val) {
        int count=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] !=val) {
                count++;
            }
        }
        int[] newArray= new int[count];
        int offset=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                newArray[i-offset] = nums[i];
            }
        }
        return newArray;
    }
}
