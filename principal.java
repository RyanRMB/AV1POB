package carrinho;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 3;
		while(menu!=0) {
			
			System.out.println("Digite o número correspondente a opção desejada:\n1 - Adicionar itens ao carrinho.\n2 - Adicionar produtos ao catálogo.\n0 - Encerrar programa.");
			menu = sc.nextInt();
			if(menu == 1) 
			{
				comprar();
			} else if(menu == 2) {
				adicionarItem();
			}
		}
		sc.close();
	}
	
	private static listaProduto adicionarItem () {
		
		String nome = null;
		int id = 0;
		int valor = 0;
		
		listaProduto addLista = new listaProduto(nome, id, valor);
		return addLista;
	} 

}

	private static carrinho comprar() 
	{
		int idProduto;
		int quant;
		char menu = 'S';
		Scanner sc = new Scanner(System.in);
		while(menu == 's') 
		{
			System.out.println("Digite o id do produto: ");
			nome = sc.next();
		}
			sc.close();
		
		carrinho compra = new compra(idProduto, quant);
		return compra;
	}
