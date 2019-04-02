package TestDealLock;

//线程死锁
public class TestDealLock {

	//哲学家的两根筷子
	Object o1 = new Object();
	Object o2 = new Object();
	
	public static void main(String[] arg) {
		TestDealLock lock = new TestDealLock();
		//哲学家t1
		Thread t1 = new Thread(new MyRunnable1(lock.o1,lock.o2),"t1");
		//哲学家t2
		Thread t2 = new Thread(new MyRunnable2(lock.o1,lock.o2),"t2");
		t1.start();
		t2.start();
	}
	
}

class MyRunnable1 implements Runnable{
	
	private Object o1;
	private Object o2;
	
	public MyRunnable1() {}
	
	//通过构造方法把对象传进来，保证操作的是同一个对象
	public MyRunnable1(Object o1,Object o2) {
		
		this.o1 = o1;
		this.o2 = o2;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//锁住o1
		synchronized(o1) {
			System.out.println(Thread.currentThread().getName() + "已经锁住o1,还需要o2的锁。");
			
			try {
				//休眠1秒
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//再锁住o2
			synchronized(o2) {
				System.out.println(Thread.currentThread().getName()+"已经锁住o2。");
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
		
		//锁住o2
		synchronized(o2) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"已经锁住o2,还需要o1的锁。");
			//再锁住o1
			synchronized(o1) {
				System.out.println(Thread.currentThread().getName()+"已经锁住o1。");
				
			}
		}
		
	}
	
}
