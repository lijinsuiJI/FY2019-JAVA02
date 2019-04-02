package TestStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileCopy test = new FileCopy();
		test.fileCopy();
		
	}

	public void fileCopy() {
		
		//创建输入流对象
		FileInputStream fis = null;
		//创建输出流对象
		FileOutputStream fos = null;
		
		try {
			//创建输入流
			fis = new FileInputStream("E:\\A东软学习\\test1.txt");
			//创建文件
			File file = new File("E:\\A东软学习\\test2.txt");
			//判断文件是否存在
			if(!file.exists()) {
				file.createNewFile();
			}
			//创建输出流   true代表在后面追加
			fos = new FileOutputStream(file,true);
			
			int result = 0;
			//判断是否读完文件    读取完毕返回值为-1
			while((result=(fis.read())) != -1) {
				//写入文件
				fos.write(result);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
