package TestThread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		//���Լ����Լ��ϲ��ˣ�д����run��������
		/*try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i=0;i<50;i++) {
			System.out.println("===���߳�===" + i);
		}
		
	}

}
