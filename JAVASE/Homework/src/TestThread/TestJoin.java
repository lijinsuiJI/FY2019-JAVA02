package TestThread;

public class TestJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ͨ��Runnable�ӿ�ʵ�ִ����߳�
		Runnable r = new MyRunnable();
		Thread thread = new Thread(r,"subthread");
				
		thread.start();
		
		//join����ǰ�߳������̺߳ϲ�����ִ�����̣߳����߳�ִ�������ִ�е�ǰ�̡߳�
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<50;i++) {
			System.out.println("===���߳�===" + i);
		}
	}

}
