/*
  Matéria:SWII5 – ADS 571 - TP02
  Érica Barbosa Pereira Lobo CB3012701
  
 */
package CrudProduto;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@WebServlet("/listaProdutos")
public class ListaProdutosServlet extends HttpServlet 
	{
	private static final long serialVersionUID = 1L;
	
	
			protected void service(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException
			{
								
				Banco banco = new Banco();
				List<Produto> lista = banco.getProdutos();
				
				request.setAttribute("produtos", lista);	
				
				RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos.jsp");
				rd.forward(request, response);
			
			}	
		
	}