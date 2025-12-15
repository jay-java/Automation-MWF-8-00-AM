package core;

public class P013_Thread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		Thread t = new Thread();
		t.setName("MyThread");
		System.out.println(t);
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t + " : " + i);
			Thread.sleep(3000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("total time : " + (endTime - startTime));
	}
}
