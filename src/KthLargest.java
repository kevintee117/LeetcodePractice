import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class KthLargest {

    int k;
    int[] nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;

    }

    public int add(int val) {
        List<Integer> tempList = new ArrayList<Integer>(nums.length);

        for (int num : nums) {
            tempList.add(num);
        }
        tempList.add(val);
        Collections.sort(tempList);
        int[] ret = new int[tempList.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = tempList.get(i).intValue();
        }
        nums = ret;

        return tempList.get(tempList.size() - (k+1));
    }
}

