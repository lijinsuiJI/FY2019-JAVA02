package Object;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte[] b = {1,2,3};
		//���ֽ�����ת�ַ���
		String ss = new String(b);
		System.out.println(ss);
		
		//�����µ��ַ�������
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);   //false �Ƚϵ����ڴ��ַ
		System.out.println(s1.equals(s2)); //true
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);   //true �Ƚϵ����ַ�������
		System.out.println(s3.equals(s4));  //true
		
		String s5 = "abcdefb";
		//�ַ���ƴ��
		System.out.println(s3.concat(s5));
		//��ȡ�ڼ����ַ�
		System.out.println(s5.charAt(0));
		//�ֽ�
		System.out.println(s5.getBytes());
		//����  ��ѯ��������ֵΪ-1
		System.out.println(s5.indexOf('b'));
		System.out.println(s5.indexOf("ab"));
		System.out.println(s5.lastIndexOf('b'));
		//�ַ�������
		System.out.println(s5.length());
		//�ַ��滻
		System.out.println(s5.replace('c','1'));
		
		//���ַ�����ֳ�����  ����һ������
		String s6 = "a-b-c-d-e";
		String[] s7 = s6.split("-");
		for(int i=0; i<s7.length; i++) {
			System.out.print(" " + s7[i]);
		}
		
		System.out.println(" ");
		
		//��ȡ�ַ���
		String s8 = "ABCDE";
		System.out.println(s8.substring(1,3));
		
		//ȥ�ַ���ǰ��Ŀո� �ַ�������Ŀո񲻻ᱻȥ��
		String s9 = "  A B C DEF   ";
		System.out.println(s9.trim());
		
	}

}
