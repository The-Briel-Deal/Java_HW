import java.util.Scanner;

public class LabProgram {
    public static int largestAbsoluteValue(int[] userValues) {
        int max = 0;
        for (int var : userValues) {
            if (max < Math.abs(var)) {
                max = Math.abs(var);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int toCome = scnr.nextInt();
        int[] nums = new int[toCome];
        for (int i = 0; i < toCome; i++) {
            nums[i] = scnr.nextInt();
        }
        System.out.println(largestAbsoluteValue(nums));

    }
}
