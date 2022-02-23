package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
//		int k = Integer.parseInt(req.getParameter("k"));             in url rewritting

//		HttpSession session = req.getSession();                      in session
//		int k = (int) session.getAttribute("k");

		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				break;
			}
		}
		k = k * k;
		out.println("Square result is: " + k);
		System.out.println("sq called");
	}

}
