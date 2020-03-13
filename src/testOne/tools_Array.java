package testOne;
/**
 ʵ����������ѡȡ�����Сֵ�Ĺ���
 @author Mr.lu
 @version 0.0.1
 */
public class tools_Array {
	
	/**���������ݵ��û����з�װ
	 * 
	 * @param a ��һ����Ҫ�û�����
	 * @param b �ڶ�����Ҫ�û�����
	 */
	private static void sort(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b] ;
		arr[b] = temp;
		
	}
	/**
	 * ������������ݱȽ� ѡȡ��С����
	 * @param arr ������������
	 */
	public static int getMin(int[] arr) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[min]) {
				arr[min] = arr[i];
			}
			
		}
		return arr[min];
	}
	/**
	 * �Ƚ�ѡ��������
	 * @param arr ������������
	 * @return 
	 */
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[max]) {
				arr[max] = arr[i];
			}
			
		}
		return arr[max];
		
	}
	/**
	 * ѡ������
	 * @param arr ����������
	 */
	public static void selectSort(int[] arr){
		for(int x=0;x < arr.length-1;x++) {
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x]>arr[y]) {
					sort(arr,x,y);
				}
			}
		}
		
		
		
		
		type(arr);
	}
	/**
	 * ð������
	 * @param arr �������
	 */
	public static void bubble(int[] arr) {
		for(int m=0;m<arr.length-1;m++) {
			for(int n=0;n<arr.length-m-1;n++) {
				if(arr[n]>arr[n+1]) {
					sort(arr,n,n+1);
				}
			}
		}
		type(arr);
	}
	/**
	 * ʵ������Ĵ�ӡ����
	 * ��ӡ��ʽ�� [element1,element2...]
	 * @param arr
	 */
	public static void type(int[] arr) {
		System.out.print("[");
		for(int a=0;a<arr.length;a++) {
			if(a==arr.length-1) 
				System.out.println(arr[a]+"]");
			else
				System.out.print(arr[a]+",");
		}
	}
	
}
