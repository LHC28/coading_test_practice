package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		int num = Integer.parseInt(br.readLine());
		
		String[] nums = br.readLine().split(" ");
		int[] intNums = new int[nums.length];
		
		for(int i=0; i<intNums.length; i++) {
			intNums[i] = Integer.parseInt(nums[i]);
			int count2 = 0;
			for(int j=1; j<=intNums[i]; j++) {
				if(intNums[i]%j==0) {
					count2+=1;
				}
			}
			if(count2==2) {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
