package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public FirstServlet() {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String stri = request.getParameter("name");  
			HttpSession session = request.getSession();
			session.setAttribute("name",stri);
			request.setAttribute("firstName",stri);
			RequestDispatcher rd =  request.getRequestDispatcher("secondServlet");	
            rd.forward(request, response);
		}

}
