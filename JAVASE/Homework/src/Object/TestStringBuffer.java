package Object;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����StringBuffer����new����
		String s1 = "aabbcc";
		StringBuffer buffer = new StringBuffer(s1);
		
		//���ַ�����β����׷���ַ���
		buffer.append("abc");
		System.out.println(buffer);
		
		//ɾ��
		buffer.delete(0, 2);
		System.out.println(buffer);
		
		//����
		buffer.insert(0, "c");
		System.out.println(buffer);
		
		//��ת
		buffer.reverse();
		System.out.println(buffer);
		
	}

}
