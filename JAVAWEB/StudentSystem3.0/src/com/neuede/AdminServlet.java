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
 * �������Ա����    �൱����֮ǰ����ͼ�㣬ʵ�����ǿ��Ʋ�
 * 
 * ��Ӧ�����ݸ�ʽjson: int status ״̬          String msg ����         Object data ���ص�����
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
		
		//���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		//operation��1��¼   2ע��
		String operation = request.getParameter("operation");
		if(operation == null) {
			//���ؿͻ��ˣ�operation�Ĳ�����������   ����json����
			//{"status":3,"msg":"operation�Ĳ�����������"}
			String responseText = "{\"status\":3,\"msg\":\"operation�Ĳ�����������\"}";
			pw.write(responseText);
			pw.close();
			
		}
		
		try {
			int _operation = Integer.parseInt(operation);
			
			if(_operation == Operation.ADMIN_LOGIN.getOperation_type()) {
				//��¼
				
				//��ȡ�û���
				String username = request.getParameter("username");
				//��ȡ����
				String password = request.getParameter("password");
				
				//new����
				IadminServer adminServer = new AdminImpl();
				boolean issucc = adminServer.login(username, password);
				
				if(issucc) {
					//���ؿͻ��ˣ���¼�ɹ�
					//{"status":0,"msg":"��¼�ɹ�",data:{}}
					String responseText = "{\"status\":0,\"msg\":\"��¼�ɹ�\",data:{}}";
					pw.write(responseText);
					pw.close();
					
				}else {
					//���ؿͻ��ˣ���¼ʧ��
					//{"status":1,"msg":"��¼ʧ��"}
					String responseText = "{\"status\":1,\"msg\":\"��¼ʧ��\"}";
					pw.write(responseText);
					pw.close();
				}
				
			}
			if(_operation == Operation.ADMIN_REGISTER.getOperation_type()) {
				//ע��
				
			}
			
		}catch(NumberFormatException e) {
			//���ؿͻ��ˣ�operation����Ϊ����
			//{"status":4,"msg":"operation�Ĳ�������Ϊ����"}
			String responseText = "{\"status\":4,\"msg\":\"operation�Ĳ�������Ϊ����\"}";
			pw.write(responseText);
			pw.close();
		}
		
	}

}
