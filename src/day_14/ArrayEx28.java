/*
 * # �ߺ����� ����[2�ܰ�]
 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
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
