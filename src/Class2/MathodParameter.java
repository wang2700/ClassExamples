package Class2;

import java.util.Arrays;

public class MathodParameter {

    public static void passValue (int x) {
        x = 12;
    }

    public static void passRef (int[] nums) {
        nums[0] = 1000;
    }

    public static void main(String[] args) {
        int y = 5;
        passValue(y);
        System.out.println(5);

        int[] nums = new int[] {0, 1, 2, 3};
        System.out.println("Before Calling Method: " + Arrays.toString(nums));
        passRef(nums);
        System.out.println("After Calling Method: " + Arrays.toString(nums));
    }
}
