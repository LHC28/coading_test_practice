package backjoonCoadingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int H = Integer.parseInt(st.nextToken()); // È£ÅÚÀÇ Ãþ ¼ö
			int W = Integer.parseInt(st.nextToken()); // °¢ ÃþÀÇ ¹æ¼ö
			int N = Integer.parseInt(st.nextToken()); // ¸î ¹øÂ° ¼Õ´Ô

			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.println(sb);
		
	}
}
