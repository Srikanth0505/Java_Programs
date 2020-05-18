package programs.oneProducerMultipleConsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				
				queue.put(Produce());

				Thread.sleep(1000);

			}
			queue.put(-1);
			System.out.println("Producer Stopped");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private Integer Produce() {
		
		Integer number=new Integer((int)(Math.random() * 100));
		System.out.println("Produced Number..."+number);
		return number;
	}

}
