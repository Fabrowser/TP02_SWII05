/*
  Matéria:SWII5 – ADS 571 - TP02
  Érica Barbosa Pereira Lobo CB3012701
  
 */

package CrudProduto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeProduto")
public class RemoveProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeProduto(id);
		
		
		response.sendRedirect("listaProdutos");
		
	}


}
