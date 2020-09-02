package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
    
		int[] nums = {21,72,8,1};
	
		int target = 9;
	//	int[] answer=twoSum(nums,target);
        System.out.println(Arrays.toString(twoSum(nums,target)));
	}

	  public static int[] twoSum(int[] nums, int target) {
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement)) {
		            return new int[] { map.get(complement), i };
		        }
		        map.put(nums[i], i);
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
	
	
}
