package testOne;
/*
 * ��ϰprivate ˽��Ȩ��
 * ����һ�����ͻ������Ӧ�Ĺ��캯������ͨ��private�Թ��캯������ ʵ�����˽�л�
 */

class testFive {

	private testFive() {
		
	};
	private static String name;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		testFive.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age Ҫ���õ� age
	 */
	public void setAge(int age) {
		testFive.age = age;
	}
	private static int age;
	private static String country = "China";
	
	public static void show() {
		System.out.println("name : "+name+" age : "+age+" country : "+country);
	}
	public static void main(String[] args){
		testFive f = new testFive();
		f.setName("lubaocheng");
		f.setAge(21);
		show();		
	}
}
