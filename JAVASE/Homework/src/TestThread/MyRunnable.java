package TestThread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		//将自己和自己合并了，写在了run方法里面
		/*try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i=0;i<50;i++) {
			System.out.println("===子线程===" + i);
		}
		
	}

}
