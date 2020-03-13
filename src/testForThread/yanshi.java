package testForThread;

public class yanshi implements Runnable {
	private int tick = 100;

	public synchronized void run() {
		while (tick > 0)
			System.out.println(Thread.currentThread().getName() + "---------" + tick--);

	}

}
