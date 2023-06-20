


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AppServlet
 */
@WebServlet("/AppServlet")
public class MonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String pseudo = request.getParameter("pseudo");
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");
		String mdp2 = request.getParameter("mdp2");
		User user = new User(prenom, nom, pseudo, email, mdp, mdp2);
		response.sendRedirect("Acceuil.jsp");
		
		DbConnect connect = new DbConnect();
		String msg = connect.insert(user);
		response.getWriter().print(msg);
		
		prenom = request.getParameter("prenom");
		 nom = request.getParameter("nom");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("prenom", prenom);
		session.setAttribute("nom", nom);
		
		
	}

}
