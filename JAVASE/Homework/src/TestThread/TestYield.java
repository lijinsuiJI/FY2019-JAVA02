package TestThread;

public class TestYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ͨ��Runnable�ӿ�ʵ�ִ����߳�
		Runnable r = new MyRunnable();
		Thread thread = new Thread(r,"subthread");
		
		thread.start();
		for(int i=0;i<50;i++) {
			
			if(i%5 == 0) {
				Thread.yield();
			}
			
			System.out.println("===���߳�===" + i);
		}
	}

}
