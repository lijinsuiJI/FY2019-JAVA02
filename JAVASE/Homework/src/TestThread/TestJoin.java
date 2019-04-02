package TestThread;

public class TestJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//通过Runnable接口实现创建线程
		Runnable r = new MyRunnable();
		Thread thread = new Thread(r,"subthread");
				
		thread.start();
		
		//join将当前线程与子线程合并，先执行子线程，子线程执行完成再执行当前线程。
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<50;i++) {
			System.out.println("===主线程===" + i);
		}
	}

}
