package Object;

public class TestTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestTostring user1 = new TestTostring("a","a");
		TestTostring user2 = new TestTostring("a","a");
		
		//��ӡ����Ĭ�ϵ���toString()����
		System.out.println(user1);
	}

	public String username;
	public String password;
	
	public String toString() {
		return "�û�����" + this.username + " ���룺" + this.password;
	} 
	
	public TestTostring() {
		super();
	}

	public TestTostring(String username, String password) {
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
