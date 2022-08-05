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
		
//		for(int i=2; i<=num; i++) {
//			int count=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					count+=1;
//				}
//			}
//			if(count==2) {
//				if(num%i==0) {
//					System.out.println(i);
//					num = num/i;
//					i = i-1;
//				}
//			}
//		}
		
	}
}
