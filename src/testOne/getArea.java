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
	 * @param c Ҫ���õ� c
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
	 * @param k Ҫ���õ� k
	 */
	public void setK(int k) {
		this.k = k;
	}
	getArea(int c,int k) throws noException{
		if (c<=0 || k<=0)
			throw new noException("�������������ֵ");
		System.out.println(c*k);
		
	}

}
