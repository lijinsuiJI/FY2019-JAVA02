package TestDealLock;

//�߳�����
public class TestDealLock {

	//��ѧ�ҵ���������
	Object o1 = new Object();
	Object o2 = new Object();
	
	public static void main(String[] arg) {
		TestDealLock lock = new TestDealLock();
		//��ѧ��t1
		Thread t1 = new Thread(new MyRunnable1(lock.o1,lock.o2),"t1");
		//��ѧ��t2
		Thread t2 = new Thread(new MyRunnable2(lock.o1,lock.o2),"t2");
		t1.start();
		t2.start();
	}
	
}

class MyRunnable1 implements Runnable{
	
	private Object o1;
	private Object o2;
	
	public MyRunnable1() {}
	
	//ͨ�����췽���Ѷ��󴫽�������֤��������ͬһ������
	public MyRunnable1(Object o1,Object o2) {
		
		this.o1 = o1;
		this.o2 = o2;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//��סo1
		synchronized(o1) {
			System.out.println(Thread.currentThread().getName() + "�Ѿ���סo1,����Ҫo2������");
			
			try {
				//����1��
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����סo2
			synchronized(o2) {
				System.out.println(Thread.currentThread().getName()+"�Ѿ���סo2��");
			}
		}
		
	}
	
}

class MyRunnable2 implements Runnable{

	private Object o1;
	private Object o2;
	
	public MyRunnable2() {
		
	}
	public MyRunnable2(Object o1,Object o2) {		
	   this.o1=o1;
	   this.o2=o2;
	}
   
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//��סo2
		synchronized(o2) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�Ѿ���סo2,����Ҫo1������");
			//����סo1
			synchronized(o1) {
				System.out.println(Thread.currentThread().getName()+"�Ѿ���סo1��");
				
			}
		}
		
	}
	
}
