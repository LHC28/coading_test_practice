package ����;

import java.util.Random;

public class ����2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// �迭 ����
		int[][] arr = new int[4][4];
		
		// 0�� ����
		int count = 0;
		
		// 10�� ���Ƿ� �����
		int[] ranNum = new int[10];
		for(int i=0; i<ranNum.length; i++) {
			ranNum[i] = (int)(Math.random()*10);
		}
		while(count<10) {
			int i = ran.nextInt(4);
			int j = ran.nextInt(4);
			if(arr[i][j]==0) {
				arr[i][j] = ranNum[count];
				count+=1;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
