package TestDanLi;

public class TestDanLi {

	private static TestDanLi testDanLi;
	
	//����Ϊprivate�������಻����new TestDanLi����
	private TestDanLi() { }
	
	//�����ṩһ�����е��ܷ���TestDanLi����ʵ���ķ���  ͨ��synchronized��ס��ʵ���̰߳�ȫ
	public synchronized static TestDanLi getInstance() {
		//���Ϊ�գ���newһ��TestDanLi����
		if(testDanLi == null) {
			testDanLi = new TestDanLi();
		}
		//�����Ϊ�վ�ֱ�ӷ���TestDanLi����
		return testDanLi;
		
	}
	
}

class TestDanLi1 {
	
	//���TestDanLi����
	TestDanLi testDanLi = TestDanLi.getInstance();
	
}
