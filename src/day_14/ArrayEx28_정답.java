package day_14;

import java.util.Random;

/*
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */

public class ArrayEx28_정답 {
	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] arr = new int[5];
		
		int i = 0;
		while(i < 5) {
			int rNum = ran.nextInt(10) + 1;
			
			int check = 1;
			int j = 0;
			while(j < i) {
				if(rNum == arr[j]) {
					check = -1;
				}
				j += 1;
			}
			
			if(check == 1) {
				arr[i] = rNum;
				i += 1;
			}
		}
		
		for(int j=0; j<5; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
	}
}