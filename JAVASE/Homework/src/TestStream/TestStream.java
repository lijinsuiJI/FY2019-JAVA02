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

	//输出流
	public void testOutputStream() {
		
		String str = "hello io";
		//创建文件
		File file = new File("E:\\A东软学习\\test1.txt");
		
		OutputStream ops = null;
		
		try {
			//判断是否有新文件
			if(!file.exists()) {
				file.createNewFile();
			}
			//创建输出流
			ops= new FileOutputStream(file);
			//以字节输出     .getBytes()将字符串转化为字节数组
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
	
	//输入流
	public void testInputStream() {
		
		File file = new File("E:\\A东软学习\\test1.txt");
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
