package br.ufc.quixada.javali.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.quixada.javali.model.Classes;

/**
 * Servlet implementation class ClassServlet
 */

@WebServlet("/addClass")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
                        
        PrintWriter out = response.getWriter();
                        
        // pegando os parâmetros do request
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        
        
      
       
        
        // monta um objeto classes
        Classes myclass = new Classes();
        myclass.setName(name);
        myclass.setDescription(description);
        
        // salva o contato
        ClassDao dao = new ClassDao();
        dao.adiciona(myclass);
        
        // imprime o nome do contato que foi adicionado
        out.println("<html>");
        out.println("<body>");
        out.println("Contato " + myclass.getName() + 
                " adicionado com sucesso");    
        out.println("</body>");
        out.println("</html>");
    }
	
	
	

}
