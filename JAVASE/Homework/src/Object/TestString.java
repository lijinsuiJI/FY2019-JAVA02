package Object;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte[] b = {1,2,3};
		//将字节数组转字符串
		String ss = new String(b);
		System.out.println(ss);
		
		//创建新的字符串对象
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);   //false 比较的是内存地址
		System.out.println(s1.equals(s2)); //true
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);   //true 比较的是字符串序列
		System.out.println(s3.equals(s4));  //true
		
		String s5 = "abcdefb";
		//字符串拼接
		System.out.println(s3.concat(s5));
		//截取第几个字符
		System.out.println(s5.charAt(0));
		//字节
		System.out.println(s5.getBytes());
		//索引  查询不到返回值为-1
		System.out.println(s5.indexOf('b'));
		System.out.println(s5.indexOf("ab"));
		System.out.println(s5.lastIndexOf('b'));
		//字符串长度
		System.out.println(s5.length());
		//字符替换
		System.out.println(s5.replace('c','1'));
		
		//把字符串拆分成数组  按照一个规则
		String s6 = "a-b-c-d-e";
		String[] s7 = s6.split("-");
		for(int i=0; i<s7.length; i++) {
			System.out.print(" " + s7[i]);
		}
		
		System.out.println(" ");
		
		//截取字符串
		String s8 = "ABCDE";
		System.out.println(s8.substring(1,3));
		
		//去字符串前后的空格 字符串里面的空格不会被去除
		String s9 = "  A B C DEF   ";
		System.out.println(s9.trim());
		
	}

}
