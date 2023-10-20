package carrinho;

import java.util.ArrayList;
import java.util.List;

public class carrinho {
    private List<listaCarrinho> compras;
    private double valorTotal;

    public class listaCarrinho {
    	public int idProduto;
    	public int quant;
    	public double valor;
    	private List<listaProduto> compras;
		private double valorTotal;
    		public listaCarrinho(int idProduto, int quant, double valor){
    			this.idProduto = idProduto;
    			this.quant=quant;
    			this.valor = valor;
    			this.compras = new ArrayList<>();
    		    this.valorTotal = 0.0;
    		}
    		public int getIdProduto() {
    			return idProduto;
    		}
    		public void setIdProduto(int idProduto) {
    			this.idProduto = idProduto;
    		}
    		public int getQuant() {
    			return quant;
    		}
    		public void setQuant(int quant) {
    			this.quant = quant;
    		}
    		public double getValor() {
    			return valor;
    		}
    		public void setValor(double valor) {
    			this.valor = valor;
    		}

	public List<listaProduto> getCompras() {
		return compras;
	}

	public void setCompras(List<listaProduto> compras) {
		this.compras = compras;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	
    }

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void adicionarCompra(listaProduto produto, int quant, double valor) {
		listaCarrinho compra = new listaCarrinho(produto.getId(), quant, produto.getValor() * quant);
	    this.compras.add(compra);
	    this.setValorTotal(this.getValorTotal() + compra.getValor());
	}
}
