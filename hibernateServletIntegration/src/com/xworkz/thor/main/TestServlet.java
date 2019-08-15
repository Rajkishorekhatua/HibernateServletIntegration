package com.xworkz.thor.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.thor.dao.SportsDAO;
import com.xworkz.thor.dto.SportsDTO;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("this is servlet");

		//int spId = Integer.parseInt(request.getParameter("sportsid").trim());
		String sportsName = request.getParameter("sportsname").trim();
		String sportsType = request.getParameter("sporttype").trim();
		int noOfplayers = Integer.parseInt(request.getParameter("noofplayers").trim());
		String location = request.getParameter("location").trim();
		boolean international = Boolean.parseBoolean(request.getParameter("i18n").trim());
		
		SportsDTO dto = new SportsDTO();
		
		dto.setSportsName(sportsName);
		dto.setSportsType(sportsType);
		dto.setNoOfplayers(noOfplayers);
		dto.setLocation(location);
		dto.setInternational(international);

		SportsDAO dao = new SportsDAO();
		boolean b = dao.saveDetails(dto);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (b == true) {
			out.println("<h1>Sport details sucessfully saved.</h1>");

		} else {
			out.println("<h1>Sport details already existed.</h1>");
		}
		out.println("");
		out.close();
	}

}
