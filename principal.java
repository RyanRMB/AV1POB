package carrinho;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int menu = 3;
		 listaProduto lista = new listaProduto();
		 lista.getProduto().add(new listaProduto("Shampoo Loreal", 001, 15));
		 lista.getProduto().add(new listaProduto("Pasta de Dente Colgate", 002, 5));
		 lista.getProduto().add(new listaProduto("Cheetos", 003, 6));
		carrinho carrinho = new carrinho();
		Scanner sc = new Scanner(System.in);
		while(menu>0) {
			System.out.println("Digite o número correspondente a opção desejada:\n1 - Adicionar itens ao carrinho.\n2 - Adicionar produtos ao catálogo.\n3 - Ver a lista de produtos.\n4 - Ver o carrinho.\n0 - Encerrar programa.");
			menu = sc.nextInt();
			switch (menu)
			{
				case 1: 
					comprar(carrinho, lista);
					break;
				case 2:
					adicionarItem();
					break;
				case 3:
					listarProduto(lista);
					break;
				case 4:
					listarCarrinho(carrinho);
					break;
				default:
					System.out.println("Sessão encerrada.");
			}
		}
		sc.close();
	}

	private static listaCarrinho comprar(carrinho carrinho, listaProduto lista) {
		int idProduto = 0;
	    int quant = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o id do produto\n>> ");
	    idProduto = sc.nextInt();
	    System.out.println("Digite quantas unidades do produto você deseja comprar\n>> ");
	    quant=sc.nextInt();
	    listaProduto produto = null;
	    for (listaProduto p : lista.getProduto()) {
	        if (p.getId() == idProduto) {
	            produto = p;
	            break;
	        }
	    }
	    if (produto != null) {
	        double valor = produto.getValor() * quant;
	        listaCarrinho compra = new listaCarrinho(idProduto, quant);
	        carrinho.adicionarCompra(produto, quant, valor);
	        return compra;
	    } else {
	    	System.out.println("Produto não encontrado.");
	    }
		return null;
	}


	private static listaProduto adicionarItem () {
		
		String nome = null;
		int id = 0;
		int valor = 0;
		System.out.println("lista produto percorrida");
		listaProduto addLista = new listaProduto(nome, id, valor);
		return addLista;
	} 
	
	private static void listarProduto(listaProduto lista) {
		System.out.println("Lista de produtos:\n");
        for (listaProduto p : lista.getProduto())
        {
            System.out.printf("Produto: %s\nId: %d\nValor: %d R$\n\n", p.getNome(), p.getId(), p.getValor());
        }
		
	}
	
	private static listaCarrinho listarCarrinho(carrinho carrinho) 
	{
		return null;
		
	}
}
