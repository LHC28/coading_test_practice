package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int weight = Integer.parseInt(br.readLine());
		int count = 0;
		
		// 5로만
		int c5 = weight/5;
		int r5 = weight%5;
		
		//3으로만
		int c3 = weight/3;
		int r3 = weight%3;
		
		// 5 3 함께
		count+=weight/5;
		weight = weight%5;
		count+=weight/3;
		int r35 = weight%3;
		
	}
}
