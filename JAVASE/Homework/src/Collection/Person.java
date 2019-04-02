package Collection;

public class Person {

	public int id;
	public String name;
	
	public int hashCode() {
		int hash = name.hashCode();
		System.out.println("调用了hashCode" + hash);
		return hash;
		
	}
	
	public boolean equals(Object obj) {
		
		System.out.println("调用了equals");
		
		if(obj == null) {
			return false;
		}
		Person p = (Person)obj;
		if(this.id==p.getId() && this.name.equals(p.getName())) {
			return true;
		}
		
		
		return super.equals(obj);
	}
	
	public Person() {
		super();
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
