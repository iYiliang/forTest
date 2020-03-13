package testOne;
/*
 * 练习private 私有权限
 * 对象一建立就会调用相应的构造函数，可通过private对构造函数修饰 实现类的私有化
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
	 * @param name 要设置的 name
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
	 * @param age 要设置的 age
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
