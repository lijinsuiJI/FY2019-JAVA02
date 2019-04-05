package com.neuedu.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import com.neuedu.exception.LoginException;
import com.neuedu.pojo.Admin;
import com.neuedu.service.AdminBiz;

public class AdminBizImpl implements AdminBiz {

	//��������Ա����
	public List<Admin> AdminList = new LinkedList<Admin>();
	
	//����ģʽ
	private static AdminBizImpl adminBizImpl;
	
	//�����ṩ��ȡʵ����ʽ    �̰߳�ȫ
	public static synchronized AdminBizImpl getIntance() {
		
		if(adminBizImpl == null) {
			adminBizImpl = new AdminBizImpl();
		}
		return adminBizImpl;
	}
	
	//��ʼ������
	private AdminBizImpl() {
		
		AdminList.add(new Admin("admin","admin"));
		
	}
	
	//����Ա��¼�߼�
	public void login(String adminName, String password, String yzm, String yzm1) throws LoginException {
		
		//Ĭ�Ϲ���Ա������
		boolean adminNameExists = false;
		for(int i=0;i<AdminList.size();i++) {
			if(AdminList == null) {
				continue;
			}
			
			String _adminName = AdminList.get(i).getAdminName();
			String _password = AdminList.get(i).getPassword();
			
			if(adminName.equals(_adminName)) {
				adminNameExists = true;
				if(password.equals(_password) && yzm.equals(yzm1)) {
					System.out.println("��¼�ɹ�");
					System.out.println("��ӭ��  "+ adminName);
				}else {
					throw new LoginException("����Ա�����벻ƥ��,�����µ�¼"); 
				}
			}
			
		}
		//����Ա������
		if(!adminNameExists) {
			throw new LoginException("����Ա�����ڣ�����������");
		}
		
	}
	
	//�жϹ���Ա�û��Ƿ����
	public boolean isAdminNameExists(String adminName) throws LoginException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<AdminList.size();i++) {
			if(AdminList == null) {
				continue;
			}
			//�жϹ���Ա�Ƿ����
			String _adminName = AdminList.get(i).getAdminName();
			//�û�������
			if(adminName.equals(_adminName)) {
				return true;
			}
		}
		throw new LoginException("����Ա�����ڣ�����������");
	}

	//ת������Ա�û����еĴ�Сд
	public String change(String adminName) {
			
		StringBuffer st = new StringBuffer();
			
		for(int i = 0; i<adminName.length(); i++) {
			char temp=adminName.charAt(i);
			if(temp >= 'A' && temp <= 'Z') {
				temp = (char)(temp+32);
			}else if(temp >= 'a' && temp <= 'z') {
				temp= (char) temp;
			}else if(temp >= '1' && temp <= '9') {
				temp= temp;
			}
			st.append(temp);
		}
		return st.toString();
	}
	
	//��֤���¼
	public String generateCodeAndPic() {
		
		//��֤���ַ�����
		int codeCount = 4;
		
		char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		//����һ���������������
		Random random = new Random();
		//���ڱ��������������֤�룬�Ա��û���¼����֤
		StringBuffer randomCode = new StringBuffer();
		//�������codeCount���ֵ���֤��
		for(int i=0;i<codeCount; i++) {
			//�õ������������֤������
			String strRand = String.valueOf(codeSequence[random.nextInt(36)]);
			//���������ĸ�����������һ��
			randomCode.append(strRand);
		}
		
		return randomCode.toString();
		
	}
	
}
