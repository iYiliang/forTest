package testOne;
/*
  功能实现进制转换
  十进制--->toBin 二进制
  十进制--->toE   八进制
  十进制--->toHex 十六进制
  
  可以用容器StringBuffer sb = new StringBuffer();存取数据。 sb.append存取。sb.reverse()实现反向输出
  但是该方法不能是实现是负数的转换
  
 还可以使用数组char存数据  指针pos分装 以免char数组容器输出空格
 
 num为数据 base为基数 offset为偏移量
 16进制 基数15，偏移量4
 8进制 基数7，偏移量3
 2进制 基数1，偏移1位
   */
 public class testFour { 
	
	public static void main(String[] args) {
		
		//toBin(60);
		toE(60);
		System.out.println();

	}
	public static void toBin(int num) {
		ZhuanHuan(num,1,1);
	}
	
	public static void toE(int num) {
		ZhuanHuan(num,7,3);
	}
	
	public static void toHex(int num) {
		ZhuanHuan(num,15,4);
	}
	
	public static void ZhuanHuan(int num,int base,int offset) {
		//查表算法
			if(num == 0) {
				//判断十进制数据是否为0;

				System.out.println("Reselt = "+0);
				return ;			
			}
			char[] ch = new char[]{'0','1','2','3','4',
									'5','6','7','8','9',
									'A','B','C','D','E','F'
					};//查表法，定义表
			char[] arr=new char[32];//定义容器，实现对进制转后的的存取
			int pos=arr.length;//定义指针.让指针指向最后一个位置，实现倒着存放
			while(num!=0) {
				//数据不为0 运算开始
				
				int temp =num & base;//temp存放每次与运算的结果 qu查表得到相应的数据
				arr[--pos]=ch[temp]; //--p，如表长为8则标为7 arr[7]
				num >>>= offset;
			}
			for(int i=pos;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
	}
	

}
