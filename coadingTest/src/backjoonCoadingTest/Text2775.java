package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] roomNum = new int[15][15];
		for(int i=0; i<roomNum.length; i++) {
			roomNum[0][i] = i+1;
			roomNum[i][0] = 1;
		}
		
		for(int i=1; i<roomNum.length; i++) {
			for(int j=1; j<roomNum[i].length; j++) {
				roomNum[i][j] = roomNum[i-1][j] + roomNum[i][j-1];
			}
		}
		
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine()); // Ãþ 1<=k
			int n = Integer.parseInt(br.readLine()); // È£¼ö n<=14
			
			sb.append(roomNum[k][n-1]+"\n");
		}
		System.out.println(sb);
		
	}
}
