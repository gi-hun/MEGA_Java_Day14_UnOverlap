/*
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */
package day_14;

import java.util.Random;

public class ArrayEx28 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[10];
		int[] check = new int[10];
		
		for(int i=0;i<5;i++)
		{
			int num = ran.nextInt(10);
			arr[i] = num;
			
			if(check[num] == 0)
			{
				check[num] = 1;
			}
			else
			{
				i--;
			}
		}
		
		System.out.print("[");
		for(int j=0;j<5;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println("]");
		
	}
}
