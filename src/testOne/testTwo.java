package testOne;
/*
 数组内比较数据大小
 */

public class testTwo {
	
	public static int getMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = new int[] {5,1,6,4,2,8,9};
		int min = getMin(arr);
		System.out.println("min:"+min);
		
		

	}

}
