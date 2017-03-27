package com.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.MemberDTO;
import com.exception.LikeatException;
import com.service.MemeberService;

@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String email = request.getParameter("email");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		
		MemberDTO dto = new MemberDTO(username, userid, userpw, email, phone1, phone2, phone3);
		
		String target = "";
		
		MemeberService service = new MemeberService();
		try {
			service.join(dto);
			target = "LikeatMainController";
			request.setAttribute("Success", "가입을 축하드립니다");
		} catch (LikeatException e) {
			e.printStackTrace();
			target = "error.jsp";
			
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("LikeatMainController");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
