/*
  Matéria:SWII5 – ADS 571 - TP02
  Érica Barbosa Pereira Lobo CB3012701
  
 */

package CrudProduto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {

		Produto produto = new Produto();
		produto.setId(chaveSequencial++);
		produto.setNome("IPHONE 14 PROMAX");
		produto.setUnidadeCompra(2);
		produto.setDescricao("128 GB MEMORIA");
		produto.setQtPrevistoMes(1);
		produto.setPrecoMaxComprado(80.0);
						
		
		Produto produto2 = new Produto();
		produto2.setId(chaveSequencial++);
		produto2.setNome("SAMSUMG GALAXY 10");
		produto2.setUnidadeCompra(1);
		produto2.setDescricao("256 GB MEMORIA");
		produto2.setQtPrevistoMes(5);
		produto2.setPrecoMaxComprado(13.0);
		
		Produto produto3= new Produto();
		produto3.setId(chaveSequencial++);
		produto3.setNome("MOTO G5");
		produto3.setUnidadeCompra(4);
		produto3.setDescricao("64 GB MEMORIA");
		produto3.setQtPrevistoMes(2);
		produto3.setPrecoMaxComprado(15.0);
			
		lista.add(produto);
		lista.add(produto2);
		lista.add(produto3);

	}

	public void adiciona(Produto produto) {
		produto.setId(Banco.chaveSequencial++);
		Banco.lista.add(produto);
	}

	public List<Produto> getProdutos() {

		return Banco.lista;
	}

	public void removeProduto(Integer id) {

		Iterator<Produto> it = lista.iterator();

		while (it.hasNext()) {
			Produto prod = it.next();

			if (prod.getId() == id) {

				it.remove();

			}

		}

	}
	
	public Produto buscaProdutoPelaId(Integer id) {
		
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
		
	}
	
	
}
