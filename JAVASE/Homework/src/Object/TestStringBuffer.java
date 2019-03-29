package Object;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//调用StringBuffer必须new对象
		String s1 = "aabbcc";
		StringBuffer buffer = new StringBuffer(s1);
		
		//往字符串结尾处里追加字符串
		buffer.append("abc");
		System.out.println(buffer);
		
		//删除
		buffer.delete(0, 2);
		System.out.println(buffer);
		
		//增加
		buffer.insert(0, "c");
		System.out.println(buffer);
		
		//翻转
		buffer.reverse();
		System.out.println(buffer);
		
	}

}
