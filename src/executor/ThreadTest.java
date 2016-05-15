package executor;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(new SimpleTask());
		t1.start();
		System.out.println("BEFORE JOIN");
		long start = System.currentTimeMillis();
		t1.join(3000);
		System.out.println("AFTER JOIN"
				+ String.valueOf(System.currentTimeMillis() - start));
		Thread t2 = new Thread(new SimpleTask());
		t2.start();
	}

}
