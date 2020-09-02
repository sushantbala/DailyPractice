package easy;

import java.util.Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int[] oldnums = {5,10,13,6,7,3,18,30};
		int[] newnums= new int[8];
		int limit = oldnums.length/2;
		int j=0;
		for(int i=0;i<limit*2;) {
			newnums[i]= oldnums[j];
			i=i+2;
			j=j+1;
		}
		int k=limit;
		for(int s=1;s<limit*2;) {
			newnums[s]= oldnums[k];
			s=s+2;
			k=k+1;
		}
		
  System.out.println(Arrays.toString(newnums));
	}

}
