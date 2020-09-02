package easy;

import java.util.Arrays;

public class RunningSum {

	public static void main(String[] args) {
		int[] inputArr = {2,5,7,8};
		for(int i=1;i<inputArr.length;i++) {
			inputArr[i] = inputArr[i]+inputArr[i-1];
		}
            System.out.println(Arrays.toString(inputArr));
	}

}
