package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int min = 0; int sum = 0;
		
		for(int i=num1; i<=num2; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				sum+=i;
				if(min==0) {
					min=i;
				}
			}
		}
		if(min!=0) {
			System.out.println(sum);
			System.out.println(min);
		}
		if(min==0) {
			System.out.println(-1);
		}
	}
}
