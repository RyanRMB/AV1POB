package carrinho;

import java.util.ArrayList;

public class listaProduto {
	private ArrayList<listaProduto> produto;
	private String nome;
	private int id;
	private int valor;
	
	public listaProduto(){
		this.produto = new ArrayList<>(); // inicializa a lista de produto
	}

	public listaProduto(ArrayList<listaProduto> produto){
		this.produto = produto;
	}
	
	public listaProduto(String nome, int id, int valor) {
		this.nome = nome;
		this.id = id;
		this.valor = valor;
	}

	public ArrayList<listaProduto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<listaProduto> produto) {
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
