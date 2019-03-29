package HomeworkString;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ADbScc12306ADAD";
		String s2 = "ADbScc12306ADAD";
		StringClass stringClass = new StringClass(); 
		stringClass.test1(s1);
		stringClass.test2(s1);
		stringClass.test3(s1, s2);
		stringClass.test4();
		stringClass.test5();
		stringClass.test6();
		stringClass.test7();
		stringClass.test8();
		stringClass.test9();
	}
	
	//1.输出一个字符串中的大写英文字母数，小写英文字母数及非英文字母数
	 void test1(String s) {
		
		int A=0, a=0,no=0;
		//把字符串转为字符数组
		char[] s2 = s.toCharArray();
		for(int i=0;i<s2.length;i++) {
			if(s2[i]>='A' && s2[i]<='Z') {
				A++;
			}else if(s2[i]>='a' && s2[i]<='z') {
				a++;
			}else{
				no++;
			}
		}
		System.out.print("大写字母："+ A);
		System.out.print("小写字母："+ a);
		System.out.println("非字母："+ no);
		
	}
	 
	 //2.指定字符串出现的次数
	 void test2(String s) {
		 
		 int a=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入指定字符串：");
		 String m = sc.next();
		 while(s.indexOf(m)>=0) {
			 s=s.substring(s.indexOf(m) + m.length());
			 a++;
		 }
		 System.out.println("指定字符串出现的次数："+a);
	 }
	 
	 //3.比较字符串内容是否相等，不能用equals方法
	 void test3(String s1,String s2) {
		 
		 if(s1.length() != s2.length()) {
			 System.out.println("字符串不相等");
		 }
		 for(int i=0;i<s1.length();i++) {
			 char a = s1.charAt(i);
			 char b = s2.charAt(i);
			 if(a != b) {
				 System.out.println("字符串不相等");
			 }
		 }
		 System.out.println("字符串相等");
	 }
	 
	 //4.将jdk全部变为大写，并输出，再截取子串DK输出
	 void test4() {
		 String s = "jdk";
		 String s1 = s.toUpperCase();
		 System.out.println(s1.substring(1,3));
	 }
	 
	 //5.将test变为tset
	 void test5() {
		 String s = "test";
		 char[] s1 = s.toCharArray();
		 char temp = 0;
		 temp = s1[1];
		 s1[1] = s1[2];
		 s1[2] =temp;
		 System.out.println(s1);
	 }
	 
	 //6.判断一个字符串是否对称
	 void test6() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("请输入指定字符串：");
		 String m = s.next();
		 for(int i=0;i<m.length()/2;i++) {
			 if(m.charAt(i) != m.charAt(m.length()-i-1)) {
				 System.out.println("字符串不对称");
			 }else{
				 System.out.println("字符串对称");
			 }
		 }
	 }
	 
	 //7.s = "113@ ere qqq yyui",提取 113 ere qqq yyui
	 void test7() {
		 String s = "113@ ere qqq yyui";
		 String s1 = s.replace('@',' '); 
		 String[] s2 = s1.split(" ");
		 for(int i=0; i<s2.length; i++) {
				System.out.println(s2[i]);
		 }
	 }

	 //8.“To be or not to be"，将变成"oT eb ro ton ot eb."
	 void test8() {
		 String s = "To be or not to be";
		 StringBuffer buffer = new StringBuffer(s);
		 StringBuffer s1 = buffer.reverse();
		 StringBuffer s2 = buffer.append(".");
		 System.out.println(s2);
	 }
	 
	 //9. s=”name=zhangsan age=18 classNo=090728”拆成zhangsan 18 090728
	 void test9() {
		 String s = "name=zhangsan age=18 classNo=090728";
		 String[] s1 = s.split(" ");
		 String[] s2 = s1[0].split("=");
		 String[] s3 = s1[1].split("=");
		 String[] s4 = s1[2].split("=");
		 System.out.print(s2[1] + " ");
		 System.out.print(s3[1] + " ");
		 System.out.println(s4[1]);
	 }
	 
}
