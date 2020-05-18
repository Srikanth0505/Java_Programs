package programs.ThreadPrograms;

public class ThreadDeadLockDemo {
	
	public static void main(String[] args) {

		Object resource1 = "This is resource one";
		Object resource2 = "This is resource two";

		Thread t1 = new Thread() {
			public void run() {

				synchronized (resource1) {
					System.out.println("Thread-1: Locked resource-1");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				synchronized (resource2) {
					System.out.println("Thread-1: Locked resource-2");
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {

				synchronized (resource2) {
					System.out.println("Thread-1: Locked resource-1");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				synchronized (resource1) {
					System.out.println("Thread-1: Locked resource-2");
				}
			}
		};

	}

}
