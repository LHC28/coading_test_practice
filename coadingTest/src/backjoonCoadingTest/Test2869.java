package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		int A = Integer.parseInt(st.nextToken()); // ���� �ö󰡴� ����
		int B = Integer.parseInt(st.nextToken()); // �㿡 �̲������� ����
		int V = Integer.parseInt(st.nextToken()); // �������� ����
		
		int day = (V - B) / (A - B);
		if((V - B) % (A - B) !=0) {
			day++;
		}
		System.out.println(day);
	}
}
