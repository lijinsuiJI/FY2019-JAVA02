package TestThread;

public class TestThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ͨ��Runnable�ӿ�ʵ�ִ����߳�
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
