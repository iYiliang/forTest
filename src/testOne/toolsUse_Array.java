package testOne;
/*
 * ����������ȽϵȽ��з�ס
 */

public class toolsUse_Array {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] arr = {2,7,9,4,8,1};
		tools_Array t = new tools_Array();
		int max = t.getMax(arr);
		System.out.println("max : "+ max);
		
		int min = t.getMin(arr);
		System.out.println("min : "+min);
		
		t.bubble(arr);
		
		
	}

}
