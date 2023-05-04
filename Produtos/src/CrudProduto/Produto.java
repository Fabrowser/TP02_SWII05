
/*
  Matéria:SWII5 – ADS 571 - TP02
  Érica Barbosa Pereira Lobo CB3012701
  
 */

package CrudProduto;

import java.util.Date;

public class Produto {
	
	private Integer id; 
	private String nome;
	private Integer unidadeCompra;
	private String descricao; 
	private Integer qtPrevistoMes; 
	private Double precoMaxComprado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getUnidadeCompra() {
		return unidadeCompra;
	}
	public String getDescricao() {
		return descricao;
	}
	public Integer getQtPrevistoMes() {
		return qtPrevistoMes;
	}
	public Double getprecoMaxComprado() {
		return precoMaxComprado;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setUnidadeCompra(Integer unidadecompra) {
		this.unidadeCompra = unidadecompra;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setQtPrevistoMes(Integer qtprevistomes) {
		this.qtPrevistoMes = qtprevistomes;
	}
	
	public void setPrecoMaxComprado(Double precomaxcomprado) {
		this.precoMaxComprado = precomaxcomprado;
	}
	

}