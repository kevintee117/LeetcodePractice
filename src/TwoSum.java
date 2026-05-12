import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {
    //Brute Force Solution
    //O(N^2) time complexity
    //loop through the list and compare each item one by one until you find
    //the ones that add up correctly to the target and return the indices
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }

    //one Pass hashmap solution
    //O(n) time complexity
    //O(n) space complexity
    public static int[] twoSumEfficient(int[] nums, int target) {
        //create hashmap to keep track of number value and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        //loop through nums array
        for (int i = 0; i < n; i++) {
            //find the complement
            //because at its core it's an algebra problem to find x where valueAtCurrentIndex + x = target
            //so complement is x= target -valueAtCurrentIndex
            int complement = target - nums[i];
            //if the numbermap contains the complement, return that value's index along with the current index
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            //record the valueAtCurrentIndex and its index
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 5, 11}, 10)));
        System.out.println(Arrays.toString(twoSumEfficient(new int[]{2, 5, 5, 11}, 10)));

    }
}
