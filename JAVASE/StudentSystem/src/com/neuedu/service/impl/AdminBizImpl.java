package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.Admin;
import com.neuedu.service.AdminBiz;

public class AdminBizImpl implements AdminBiz {
	
	//����Admin����
	private Admin[] admins = new Admin[3];
	
	public AdminBizImpl() {
		
		Admin admin1 = new Admin("admin","admin");
		this.admins[0] = admin1;
		
	}

	//����Ա��¼�߼�
	@Override
	public void login(String adminName, String password) throws LoginException {
		// TODO Auto-generated method stub
		//Ĭ�Ϲ���Ա������
		boolean adminNameExists = false;
		for(int i=0;i<admins.length;i++) {
			Admin admin = admins[i];
			if(admin == null) {
				continue;
			}
			
			String _adminName = admin.getAdminName();
			String _password = admin.getPassword();
			
			if(adminName.equals(_adminName)) {
				adminNameExists = true;
				if(password.equals(_password)) {
					System.out.println("��¼�ɹ�");
					System.out.println("��ӭ��  "+ adminName);
				}else {
					throw new LoginException("����Ա�����벻ƥ��"); 
				}
			}
		}
		//����Ա������
		if(!adminNameExists) {
			throw new LoginException("����Ա������");
		}
	}

	@Override
	public boolean isAdminNameExists(String adminName) throws LoginException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<admins.length;i++) {
			Admin admin = admins[i];
			
			if(admin == null) {
				continue;
			}
			
			//�жϹ���Ա�Ƿ����
			String _adminName = admin.getAdminName();
			//�û�������
			if(adminName.equals(_adminName)) {
				return true;
			}
		}
		throw new LoginException("�û���������");
	}

}
