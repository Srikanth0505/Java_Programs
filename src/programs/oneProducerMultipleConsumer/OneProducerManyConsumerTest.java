package programs.oneProducerMultipleConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class OneProducerManyConsumerTest {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);
		
		Thread producer=new Thread(new Producer(queue));
		
		Thread consumer1=new Thread(new Consumer(queue));
		Thread consumer2=new Thread(new Consumer(queue));
		Thread consumer3=new Thread(new Consumer(queue));
		
		producer.start();
		consumer1.start();
		consumer2.start();
		consumer3.start();
	}
}
