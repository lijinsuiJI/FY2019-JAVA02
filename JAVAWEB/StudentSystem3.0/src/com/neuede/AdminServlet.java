package com.neuede;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuede.EnumLogin.Operation;
import com.neuede.server.IadminServer;
import com.neuede.server.impl.AdminImpl;

/**
 * 处理管理员请求    相当于是之前的视图层，实际上是控制层
 * 
 * 响应的数据格式json: int status 状态          String msg 描述         Object data 返回的数据
 * 
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		//operation：1登录   2注册
		String operation = request.getParameter("operation");
		if(operation == null) {
			//返回客户端，operation的参数必须填入   返回json数据
			//{"status":3,"msg":"operation的参数必须填入"}
			String responseText = "{\"status\":3,\"msg\":\"operation的参数必须填入\"}";
			pw.write(responseText);
			pw.close();
			
		}
		
		try {
			int _operation = Integer.parseInt(operation);
			
			if(_operation == Operation.ADMIN_LOGIN.getOperation_type()) {
				//登录
				
				//获取用户名
				String username = request.getParameter("username");
				//获取密码
				String password = request.getParameter("password");
				
				//new对象
				IadminServer adminServer = new AdminImpl();
				boolean issucc = adminServer.login(username, password);
				
				if(issucc) {
					//返回客户端，登录成功
					//{"status":0,"msg":"登录成功",data:{}}
					String responseText = "{\"status\":0,\"msg\":\"登录成功\",data:{}}";
					pw.write(responseText);
					pw.close();
					
				}else {
					//返回客户端，登录失败
					//{"status":1,"msg":"登录失败"}
					String responseText = "{\"status\":1,\"msg\":\"登录失败\"}";
					pw.write(responseText);
					pw.close();
				}
				
			}
			if(_operation == Operation.ADMIN_REGISTER.getOperation_type()) {
				//注册
				
			}
			
		}catch(NumberFormatException e) {
			//返回客户端，operation必须为数字
			//{"status":4,"msg":"operation的参数必须为数字"}
			String responseText = "{\"status\":4,\"msg\":\"operation的参数必须为数字\"}";
			pw.write(responseText);
			pw.close();
		}
		
	}

}
