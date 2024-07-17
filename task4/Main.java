package performanceLab.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int[] nums1 = new int[]{1, 10, 2, 9};
        System.out.println(minSteps(nums));
        System.out.println(minSteps(nums1));
    }

    public static int minSteps(int[] nums) {
        int counterSteps = 0;
        Arrays.sort(nums);
        int elementMiddleArray = nums[nums.length / 2]; // нахожу элемент из середины отсорт.массива, т.к. смещение элементов с начала и конца массива займет наименьшее количество шагов

        for (int i = 0; i < nums.length; i++) {
            counterSteps += Math.max(nums[i], elementMiddleArray) - Math.min(nums[i], elementMiddleArray);
        }
        return counterSteps;
    }
}