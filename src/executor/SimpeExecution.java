package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpeExecution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService execSer = Executors.newFixedThreadPool(3);
		Executor exec = Executors.newFixedThreadPool(3);
		for(int i = 1; i <= 3; i++){
			//exec.execute(new SimpleTask());
			execSer.execute(new SimpleTask());
		}
		System.out.println("Is Service Shutdown before -> " + execSer.isShutdown());
		execSer.shutdownNow();
		System.out.println("Is Service Shutdown After -> " + execSer.isShutdown());

	}

}
