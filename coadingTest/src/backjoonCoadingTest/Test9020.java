package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9020 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��� �����ؾ����� ����� �� �ʿ��ҵ�...
		
		// �Ҽ� �迭���� �ֱ� - �Ҽ��̸� false, �ƴϸ� true - �⺻���� false��
		boolean[] decimals = new boolean[5000];
		decimals = decimalChecked(decimals, decimals.length);
		
		
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		
		
		
//		while(count<T) {
//			
//		}
		
	}
	
	static boolean[] decimalChecked(boolean[] d, int n) {
		d[0] = d[1] = true;
		
		for(int i=2; i<Math.sqrt(n); i++) {
			
			if(d[i]==true) continue;
			
			for(int j=i*i; j<n; j+=i) {
				d[j] = true;
			}
		}
		return d;
	}
}
