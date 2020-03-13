package testForThread;

public class ThreadDemo {

	public static void main(String[] args) {
		yanshi y = new yanshi();
		Thread y1 = new Thread(y);		
		Thread y2 = new Thread(y);		
		y1.start();
		y2.start();
		
		
	}

}
