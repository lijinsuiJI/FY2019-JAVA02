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
		
		//��������������
		FileInputStream fis = null;
		//�������������
		FileOutputStream fos = null;
		
		try {
			//����������
			fis = new FileInputStream("E:\\A����ѧϰ\\test1.txt");
			//�����ļ�
			File file = new File("E:\\A����ѧϰ\\test2.txt");
			//�ж��ļ��Ƿ����
			if(!file.exists()) {
				file.createNewFile();
			}
			//���������   true�����ں���׷��
			fos = new FileOutputStream(file,true);
			
			int result = 0;
			//�ж��Ƿ�����ļ�    ��ȡ��Ϸ���ֵΪ-1
			while((result=(fis.read())) != -1) {
				//д���ļ�
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
