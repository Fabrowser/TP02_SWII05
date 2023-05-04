/*
  Matéria:SWII5 – ADS 571 - TP02
  Érica Barbosa Pereira Lobo CB3012701
  
 */

package CrudProduto;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet 
	{	
	private static final long serialVersionUID = 1L;
	
	
			protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException
					{
					
					System.out.println("Cadastrando Nova Empresa");
					
					String nomeProduto = request.getParameter("nome");
					int unidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
					String descricao = request.getParameter("descricao");
					int qtPrevistoMes = Integer.parseInt(request.getParameter("qtPrevistoMes"));
					double precoMaxComprado = Double.parseDouble( request.getParameter("precoMaxComprado"));

					Produto produto = new Produto();
					produto.setNome(nomeProduto);
					produto.setUnidadeCompra(unidadeCompra);
					produto.setDescricao(descricao);
					produto.setQtPrevistoMes(qtPrevistoMes);
					produto.setPrecoMaxComprado(precoMaxComprado);
							
					
					
					Banco banco = new Banco();
					banco.adiciona(produto);
					
					request.setAttribute("produto",produto.getNome());
					response.sendRedirect("listaProdutos");
				

				
			}	
		
	}