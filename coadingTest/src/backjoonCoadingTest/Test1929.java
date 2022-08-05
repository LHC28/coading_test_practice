package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test1929 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		
		for(int i=Integer.parseInt(nums[0]); i<=Integer.parseInt(nums[1]); i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				bw.write(String.valueOf(i)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
