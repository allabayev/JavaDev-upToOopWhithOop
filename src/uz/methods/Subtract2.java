package uz.methods;
// Massivdan belgilangan sonlarni olib tashlash (2-usul).
import java.util.Arrays;

public class Subtract2 {
    public static void main(String[] args) {
        int array[] = {2, 2, 3, 5, 6, 8, 7, 9, 2, 2};
        System.out.println(Arrays.toString(removeElement2(array, 2)));
    }
    public static int[] removeElement2(int[] nums, int val) {
        int offset = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i-offset] = nums[i];
            }
        }
        int[] newArray = new int[nums.length-offset];
        for (int i=0; i< newArray.length; i++) {
            newArray[i]=nums[i];
        }
        return newArray;
    }
}
