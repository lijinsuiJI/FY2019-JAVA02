package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestCollection a = new TestCollection();
		//a.testList();
		//a.testSet();
		a.testSet2();
		
	}

	
	public void testSet() {
		//set接口 向下转型
		Set<String> set = new HashSet<String>();
		set.add("abcd");
		set.add("abce");
		set.add("abcf");
				
		System.out.println(set);
				
		Iterator<String> iterator = set.iterator();
				
		while(iterator.hasNext()) {
			Object o = iterator.next();
			System.out.println(o);
					
		}		
	}
	
	public void testList() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(7);
		list.add(3);
		
		System.out.println(list);
		
		/*Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}*/
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void testSet2() {
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person(1,"张三"));
		set.add(new Person(1,"张三"));
		
		System.out.println(set.size());
		
	}


}
