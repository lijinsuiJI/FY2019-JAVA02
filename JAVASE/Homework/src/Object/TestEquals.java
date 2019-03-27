package Object;

public class TestEquals {

	public static void main(String[] arg) {
		TestEquals user1 = new TestEquals("a","a");
		TestEquals user2 = new TestEquals("a","a");
		
		//equals�Ƚ����������Ƿ���ȣ���������������ڴ��ַ���бȽ�  �������дequals����
		if(user1.equals(user2)) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
		
		// ==����Ƚϵ����������ͣ��Ƚϵ����ڴ��ַ������Ƚϵ��ǻ����������ͣ��Ƚϵ�����ֵ
		if(user1 ==user2) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
	}
	
	public String username;
	public String password;
	
	//�ж����������Ƿ����
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		//����ת��
		TestEquals user = (TestEquals)obj;
		
		if(user.getUsername().equals(this.username) && user.getPassword().equals(this.password)) {
			return true;
		}
		return false;
	}
	
	public TestEquals() {
		super();
	}

	public TestEquals(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
