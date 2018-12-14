package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegDAO;
import vo.CountryVO;
import vo.LoginVO;
import vo.RegVO;
import vo.StateVO;

/**
 * Servlet implementation class cont
 */
@WebServlet("/cont")
public class cont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession s = request.getSession();
		String a = request.getParameter("flag");
		if(a.equals("state"))
		{
			CountryVO s1 = new CountryVO();
			s1.setCountry("");
			
			RegDAO d = new RegDAO();
			List ls = d.search(s1);
			
			s.setAttribute("List", ls);
			
			response.sendRedirect("4.jsp");
		}
		if(a.equals("displaytable"))
		{
			CountryVO s1 = new CountryVO();
			s1.setCountry("");
			
			StateVO v = new StateVO();
			v.setState("");
			
			RegDAO d = new RegDAO();
			List ls1 = d.searcha(v);
			
			s.setAttribute("List1", ls1);
			
			response.sendRedirect("5.jsp");
		}
		if(a.equals("edit"))
		{
			String m = request.getParameter("state");
			String n = request.getParameter("country");
			int id = Integer.parseInt(request.getParameter("id"));
			s.setAttribute("id",id);
			s.setAttribute("state", m);
			s.setAttribute("country", n);
			
			CountryVO s1 = new CountryVO();
			s1.setCountry("");

			StateVO v = new StateVO();
			v.setState("");
			
			RegDAO d = new RegDAO();
			List ls1 = d.searcha(v);
			List ls = d.search(s1);
			
			s.setAttribute("List", ls);
			
			s.setAttribute("List1", ls1);
			
			response.sendRedirect("6.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession();
		String a = request.getParameter("flag");
		if(a.equals("insert"))
		{
		String firstname = request.getParameter("fn");
		String lastname = request.getParameter("ln");
		String username = request.getParameter("un");
		String password = request.getParameter("pw");
		
		LoginVO v = new LoginVO();
		v.setUsername(username);
		v.setPassword(password);
		
		RegVO v1 = new RegVO();
		v1.setFirstname(firstname);
		v1.setLastname(lastname);
		v1.setLvo(v);
		
		RegDAO d = new RegDAO();
		d.insert1(v);
		d.insert(v1);
		
		response.sendRedirect("1.jsp");
		}
		
		if(a.equals("insert1"))
		{
			String country = request.getParameter("country");
			
			CountryVO v = new CountryVO();
			v.setCountry(country);
			
			RegDAO d = new RegDAO();
			d.insert2(v);
			
			response.sendRedirect("2.jsp");
		}
		
		if(a.equals("insertstate"))
		{
			
			String state = request.getParameter("state");
			int sss = Integer.parseInt(request.getParameter("sss"));
			
			CountryVO c = new CountryVO();
			c.setId(sss);
			
			StateVO v = new StateVO();
			v.setState(state);
			v.setCvo(c);
			
			RegDAO d = new RegDAO();
			d.insert3(v);
			
			response.sendRedirect("2.jsp");
		}
		
		if(a.equals("update"))
		{
			String st = request.getParameter("state");
			String cn = (String)s.getAttribute("country");
			int sss = Integer.parseInt(request.getParameter("aaa"));
			int id = (Integer)s.getAttribute("id");

			CountryVO c = new CountryVO();
			StateVO v = new StateVO();
			c.setId(sss);
			c.setCountry(null);
			v.setSid(id);
			v.setState(st);
			v.setCvo(c);
			
			RegDAO d = new RegDAO();
			//d.update1(c);
			d.update(v);
			
			response.sendRedirect("2.jsp");
		}
		
	}

}
