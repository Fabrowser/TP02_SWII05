/*
  Matéria:SWII5 – ADS 571 - TP02
  Érica Barbosa Pereira Lobo CB3012701
  
 */



package CrudProduto;

import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	System.out.println("Alterando o produto");
	

		int paramId = Integer.parseInt(request.getParameter("id"));
		String paramNomeProduto = request.getParameter("nome");
		int paramUnidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
		String paramDescricao = request.getParameter("descricao");
		int paramQtPrevistoMes = Integer.parseInt(request.getParameter("qtPrevistoMes"));
		double paramPrecoMaxComprado = Double.parseDouble( request.getParameter("precoMaxComprado"));

		
		System.out.println(paramId);
		Banco banco = new Banco();
		Produto produto = banco.buscaProdutoPelaId(paramId);
		produto.setNome(paramNomeProduto);
		produto.setUnidadeCompra(paramUnidadeCompra);
		produto.setDescricao(paramDescricao);
		produto.setQtPrevistoMes(paramQtPrevistoMes);
		produto.setPrecoMaxComprado(paramPrecoMaxComprado);
		
		response.sendRedirect("listaProdutos");
	
	}

}
