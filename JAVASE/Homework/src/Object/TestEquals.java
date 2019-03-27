package Object;

public class TestEquals {

	public static void main(String[] arg) {
		TestEquals user1 = new TestEquals("a","a");
		TestEquals user2 = new TestEquals("a","a");
		
		//equals比较两个对象是否相等，根据两个对象的内存地址进行比较  子类可重写equals方法
		if(user1.equals(user2)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		// ==如果比较的是引用类型，比较的是内存地址，如果比较的是基本数据类型，比较的是数值
		if(user1 ==user2) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}
	
	public String username;
	public String password;
	
	//判断两个对象是否相等
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		//向下转型
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
