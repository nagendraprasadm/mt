package executor;

public class SimpleTask implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("START:: sleep - >"
					+ Thread.currentThread().getName());
			Thread.sleep(15000);
			System.out.println("END :: sleep - >"
					+ Thread.currentThread().getName());			
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()
					+ "Interrpution caught while sleeping"
					+ ":: isInterrputed ->"
					+ Thread.currentThread().isInterrupted());
			e.printStackTrace();
			Thread.currentThread().interrupt();
			System.out.println("After interrput -> "
					+ Thread.currentThread().isInterrupted());
		}

	}

}
