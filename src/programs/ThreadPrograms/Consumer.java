package programs.ThreadPrograms;

import java.util.List;

public class Consumer extends Thread {

	List<Integer> list;

	public Consumer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {

		try {
			while (true) {
				synchronized (list) {
					if (list.size() == 0) {
						list.wait();
					} else {
						consumeItems();
					}

				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void consumeItems() throws InterruptedException {
		while (!list.isEmpty()) {
			Thread.sleep(1000);
			System.out.println("Removed Elements from list by Consumer::" + list.remove(0));
		}
		list.notifyAll();
	}

}
