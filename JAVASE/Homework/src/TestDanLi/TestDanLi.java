package TestDanLi;

public class TestDanLi {

	private static TestDanLi testDanLi;
	
	//定义为private，其他类不能再new TestDanLi对象
	private TestDanLi() { }
	
	//对外提供一个公有的能访问TestDanLi返回实例的方法  通过synchronized锁住，实现线程安全
	public synchronized static TestDanLi getInstance() {
		//如果为空，就new一个TestDanLi对象
		if(testDanLi == null) {
			testDanLi = new TestDanLi();
		}
		//如果不为空就直接返回TestDanLi对象
		return testDanLi;
		
	}
	
}

class TestDanLi1 {
	
	//获得TestDanLi对象
	TestDanLi testDanLi = TestDanLi.getInstance();
	
}
