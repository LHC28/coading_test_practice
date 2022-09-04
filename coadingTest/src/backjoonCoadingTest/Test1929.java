package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test1929 {
	
	public static void get_prime(int number) {
		
		if(number<2) {
			return;
		}else if(number==2) {
			System.out.println(number);
			return;
		}
		
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				return;
			}
		}
		System.out.println(number);
		return;
	}
	
	public static void main(String[] args) throws IOException {
		// 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		int min = Integer.valueOf(nums[0]);
		int max = Integer.valueOf(nums[1]);
		
		for(int i=min; i<=max; i++) {
			get_prime(i);
		}
		
		
	}
}
