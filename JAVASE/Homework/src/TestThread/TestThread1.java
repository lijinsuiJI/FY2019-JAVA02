package TestThread;

public class TestThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//通过Runnable接口实现创建线程
		Runnable r = new MyRunnable();
		Thread thread = new Thread(r,"subthread");
		
		thread.start();
	
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("main thread id:" + thread.getId());
		System.out.println("main thread name:" + thread.getName());
		
		
	}
	
	public TestThread1() {
		
	}

}
