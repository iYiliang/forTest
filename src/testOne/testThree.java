package testOne;
/*
 ѡ������
 ��ʵ����ʹ��Java�� ���������� 
 ����import java.util.*
 �õ�Arrays.sort(arr) ��
 */

public class testThree {

	public static void main(String[] args) {

		int[] arr= {3,5,7,2,6,9,1};
		PaiXu(arr);
		

	}
	public static void PaiXu(int[] arr) {
		int min;
		for(int a=0;a<arr.length-1;a++) {
			for(int b=a+1;b<arr.length;b++) {
				if(arr[a]>arr[b])
					{
						min = arr[b];
						arr[b] = arr[a];
						arr[a] = min;
					}
							
			}
		}
		System.out.print("��С�����˳���ǣ� ");
		for(int i=0;i<arr.length;i++)
		{
			if(i ==arr.length-1)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i]+", ");
		}
		
	}
}
