package carrinho;

public class listaProduto {
	private String[] produto = {"Shampoo Loreal","001", "15","Pasta de Dente Colgate", "002","5","Cheetos", "002", "6"};
	private String nome;
	private int id;
	private int valor;
	
	public listaProduto(String[] produto){
		this.produto = produto;
	}

	public listaProduto(String nome, int id, int valor) {
		
	}

	public String[] getProduto() {
		return produto;
	}

	public void setProduto(String[] produto) {
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
