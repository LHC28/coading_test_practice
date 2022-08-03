package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int weight = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(true) {
			
			if(weight%5==0) {
				count+=weight/5;
				System.out.println(count);
				break;
			}else {
				weight-=3;
				count+=1;
			}
			
			if(weight<0) {
				System.out.println(-1);
				break;
			}
		}
		
	}
}
