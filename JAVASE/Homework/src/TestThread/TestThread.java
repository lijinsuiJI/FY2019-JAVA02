package TestThread;

public class TestThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//�������߳�
			Thread thread = new TestThread();
			thread.start();
	}
	
	public TestThread() {
		
	}

	//�߳��巽��
	public void run() {
		
		for(int i=0; i<50;i++) {
			
			if(i%5 == 0) {
				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("===run()===" + i);
		}
		
	}
}
