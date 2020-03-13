package testOne;

public class getArea {
	private int c,k;

	/**
	 * @return c
	 */
	public int getC() {
		return c;
	}

	/**
	 * @param c 要设置的 c
	 */
	public void setC(int c) {
		this.c = c;
	}

	/**
	 * @return k
	 */
	public int getK() {
		return k;
	}

	/**
	 * @param k 要设置的 k
	 */
	public void setK(int k) {
		this.k = k;
	}
	getArea(int c,int k) throws noException{
		if (c<=0 || k<=0)
			throw new noException("请输入正规的数值");
		System.out.println(c*k);
		
	}

}
