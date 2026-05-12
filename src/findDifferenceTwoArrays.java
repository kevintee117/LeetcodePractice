import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDifferenceTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNums1 = new HashSet<>();
        Set<Integer> uniqueNums2 = new HashSet<>();
        List<Integer> firstAnswer = new ArrayList<>();
        List<Integer> secondAnswer = new ArrayList<>();
        List<List<Integer>> fullAnswer = new ArrayList<>();

        for(int i: nums1){
            uniqueNums1.add(i);
        }
        for(int j: nums2) {
            uniqueNums2.add(j);
        }

        for(int k: uniqueNums1) {
            if(!uniqueNums2.contains(k)) {
                firstAnswer.add(k);
            }
        }
        for(int l: uniqueNums2) {
            if(!uniqueNums1.contains(l)) {
                secondAnswer.add(l);
            }
        }

        fullAnswer.add(firstAnswer);
        fullAnswer.add(secondAnswer);
        return fullAnswer;
    }
}
