package uz.methods;
// Massivdan belgilangan sonlarni olib tashlash.
import java.util.Arrays;

public class Subtract1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 2, 4, 3, 3, 5, 2, 2, 6};
        System.out.println(Arrays.toString(removeElement(array, 2)));
    }
    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i-offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}