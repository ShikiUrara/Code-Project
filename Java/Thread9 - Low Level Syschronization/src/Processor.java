import java.util.LinkedList;
import java.util.Random;

public class Processor {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();
	
	public void producer() throws InterruptedException {
		int value = 0;
		
		while(true) {
			
			synchronized(lock) {
				
				while(list.size() == LIMIT) {
					System.out.println("Stop product");
					lock.wait();
				}
				System.out.println("Now List size is: " + list.size());
				System.out.println("Produced: " + value);
				list.add(value++);
				lock.notify();
			}
			Thread.sleep(2000);
		}
	}
	
	public void consumer() throws InterruptedException {
		
		Random random = new Random();
		
		while(true) {
			
			synchronized(lock) {
				
				while(list.size() == 0) {
					lock.wait();
					System.out.println("Stop buy");
				}
				System.out.println("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("Buy & Remove Value is: " + value);
				lock.notify();
			}
//			Thread.sleep(random.nextInt(1000));
			Thread.sleep(5000);
		}
	}
}
