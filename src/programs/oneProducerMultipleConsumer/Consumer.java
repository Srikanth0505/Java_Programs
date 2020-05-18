package programs.oneProducerMultipleConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable{
	
	private BlockingQueue<Integer> queue;
	private String threadId;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue=queue;
	}
	

	@Override
	public void run() {
		threadId="Consumer Id-"+Thread.currentThread().getId();
		try {
			
			while (true) {
				Integer number=queue.poll(5, TimeUnit.SECONDS); //Retrieves and removes the head of this queue,
			
				if (number==null ||number ==-1) {
					break;
				}
				consume(number);
				Thread.sleep(1000);
			}
			
			System.out.println(threadId +"STOPPED");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private void consume(Integer number) {
		System.out.println(threadId + ": Consuming number ==>"+number);
		
	}

}
