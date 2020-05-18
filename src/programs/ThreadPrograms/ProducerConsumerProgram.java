package programs.ThreadPrograms;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProgram {

	
	public static void main(String[] args) {
		List<Integer> list= new ArrayList();

		Producer producer = new Producer(list);
		Consumer consumer = new Consumer(list);
		Consumer2 consumer2 = new Consumer2(list);
		
		Thread t1= new Thread(producer);
		Thread t2= new Thread(consumer);
		Thread t3= new Thread(consumer2);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
