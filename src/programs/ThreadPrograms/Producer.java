package programs.ThreadPrograms;

import java.util.List;

public class Producer extends Thread {

	List<Integer> list;

	public Producer(List<Integer> list) {

		this.list = list;
	}

	@Override
	public void run() {
		try {
			synchronized (list) {

				while (true) {

					if (list.size() > 0) {
						list.wait();
					}else {
						produceItems();
					}
				}

			}

		} catch (InterruptedException e) {
			 e.printStackTrace();
		}

	}

	public void produceItems() throws InterruptedException {
		
		for (int i = 1; i <=5 ; i++) {
			Thread.sleep(1000);
			list.add(i);
			System.out.println("Added Elements in In Producer array Are ::"+i);
		}
		list.notifyAll();
	}
}
