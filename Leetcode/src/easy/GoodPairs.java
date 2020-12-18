package easy;

public class GoodPairs {

	public static void main(String[] args) {
		 int[] arr = {1,2,3};
         System.out.println(checkPair(arr));
	}
	
	static int checkPair(int[] inputArr){
		
		int count=0;
		for(int i=0;i<inputArr.length-1;i++) {
			for(int j=i+1;j<inputArr.length;j++) {
				if (inputArr[i]==inputArr[j])
					count++;
			}
		}
		return count;			
			}
}
