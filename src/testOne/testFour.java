package testOne;
/*
  ����ʵ�ֽ���ת��
  ʮ����--->toBin ������
  ʮ����--->toE   �˽���
  ʮ����--->toHex ʮ������
  
  ����������StringBuffer sb = new StringBuffer();��ȡ���ݡ� sb.append��ȡ��sb.reverse()ʵ�ַ������
  ���Ǹ÷���������ʵ���Ǹ�����ת��
  
 ������ʹ������char������  ָ��pos��װ ����char������������ո�
 
 numΪ���� baseΪ���� offsetΪƫ����
 16���� ����15��ƫ����4
 8���� ����7��ƫ����3
 2���� ����1��ƫ��1λ
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
		//����㷨
			if(num == 0) {
				//�ж�ʮ���������Ƿ�Ϊ0;

				System.out.println("Reselt = "+0);
				return ;			
			}
			char[] ch = new char[]{'0','1','2','3','4',
									'5','6','7','8','9',
									'A','B','C','D','E','F'
					};//����������
			char[] arr=new char[32];//����������ʵ�ֶԽ���ת��ĵĴ�ȡ
			int pos=arr.length;//����ָ��.��ָ��ָ�����һ��λ�ã�ʵ�ֵ��Ŵ��
			while(num!=0) {
				//���ݲ�Ϊ0 ���㿪ʼ
				
				int temp =num & base;//temp���ÿ��������Ľ�� qu���õ���Ӧ������
				arr[--pos]=ch[temp]; //--p�����Ϊ8���Ϊ7 arr[7]
				num >>>= offset;
			}
			for(int i=pos;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
	}
	

}
