package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String X=request.getParameter("x");
		int n=Integer.parseInt(X);
		if(n>=60)
		{
			response.sendRedirect("a.jsp");
		}
		else
		{
			response.sendRedirect("b.jsp");
		}
	}

}
