package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11653 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 2;
		
		while(count<=num) {
			if(num%count==0) {
				System.out.println(count);
				num = num/count;
			}else {
				count+=1;
			}
		}
	}
}
