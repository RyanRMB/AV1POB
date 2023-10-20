package carrinho;

import java.util.ArrayList;
import java.util.List;

public class listaCarrinho {
	public int idProduto;
	public int quant;
	private List<listaCarrinho> compras;
		public listaCarrinho(int idProduto, int quant){
			this.idProduto = idProduto;
			this.quant=quant;
			this.compras = new ArrayList<>();
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
		public void adicionarCompra(listaCarrinho compra) {
	        this.compras.add(compra);
	    }

	    public List<listaCarrinho> getCompras() {
	        return compras;
	    }
		public double getValor() {
			return 0;
		}
}
