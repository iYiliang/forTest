package testOne;
/**
 实现数组排序，选取最大最小值的功能
 @author Mr.lu
 @version 0.0.1
 */
public class tools_Array {
	
	/**对两个数据的置换进行封装
	 * 
	 * @param a 第一个需要置换的数
	 * @param b 第二个需要置换的数
	 */
	private static void sort(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b] ;
		arr[b] = temp;
		
	}
	/**
	 * 数组里面的数据比较 选取最小的数
	 * @param arr 传进来的数组
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
	 * 比较选择最大的数
	 * @param arr 传进来的数组
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
	 * 选择排序法
	 * @param arr 参数：数组
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
	 * 冒泡排序法
	 * @param arr 数组参数
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
	 * 实现数组的打印功能
	 * 打印格式是 [element1,element2...]
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
