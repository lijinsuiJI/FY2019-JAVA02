package TestStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestStream test = new TestStream();
		test.testOutputStream();
		test.testInputStream();
	}

	//�����
	public void testOutputStream() {
		
		String str = "hello io";
		//�����ļ�
		File file = new File("E:\\A����ѧϰ\\test1.txt");
		
		OutputStream ops = null;
		
		try {
			//�ж��Ƿ������ļ�
			if(!file.exists()) {
				file.createNewFile();
			}
			//���������
			ops= new FileOutputStream(file);
			//���ֽ����     .getBytes()���ַ���ת��Ϊ�ֽ�����
			ops.write(str.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ops != null) {
					ops.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	//������
	public void testInputStream() {
		
		File file = new File("E:\\A����ѧϰ\\test1.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int result = fis.read();
			while(result != -1) {
				System.out.print((char)result);
				result = fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
