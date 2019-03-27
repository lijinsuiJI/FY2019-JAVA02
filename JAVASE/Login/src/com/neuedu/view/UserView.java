package com.neuedu.view;

import com.neuedu.exception.LoginException;

public interface UserView {

	public void login() throws LoginException;
	public void register();
	
}
