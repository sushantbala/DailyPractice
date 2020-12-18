package easy;

import java.util.Arrays;

public class ExtraCandies {

	public static void main(String[] args) {
		
		int[] candies = {12,1,10};
		boolean[] values = new boolean[5];
		int extracandies = 10;
		for(int j=0;j<candies.length;j++) {
			values[j]=true;
			int max = candies[j]+ extracandies;
			for(int i=0;i<candies.length;i++) {
				if (max < candies[i]) {
					values[j]=false;
					System.out.println("hi");
					break;
					
				}	
			}	
		}
		
		
     System.out.println(Arrays.toString(values));
	}
	
	

}
