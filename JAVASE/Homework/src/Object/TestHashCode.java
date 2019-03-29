package Object;

public class TestHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//两个对象相同，两个对象的哈希码一定相同
		//两个对象的哈希码相同，两个对象不一定相同
		TestHashCode user1 = new TestHashCode("a","a");
		TestHashCode user2 = new TestHashCode("a","a");
		
		System.out.println(user1.hashCode());
	}

	public String username;
	public String password;
	
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

	public TestHashCode() {
		super();
	}

	public TestHashCode(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
