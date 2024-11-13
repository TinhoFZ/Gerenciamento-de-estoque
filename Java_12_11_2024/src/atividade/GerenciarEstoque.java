package atividade;

import java.util.Scanner;

public class GerenciarEstoque {

// selecionado P é para o produto, selecionado A é para a ação que será realizada
	
	public static void main(String[] args) {
		
	Scanner dig = new Scanner(System.in);
	
	int selecionadoP = 0; 
	int selecionadoA = 0;
	int vender = 0;
	int adicionar = 0;
		
	Produtos pao = new Produtos();
		pao.nome = "Pão de Queijo";
		pao.quantidade = 30;
		pao.codigo = 420;
		pao.preco = 0.50;
	
	Produtos mouse = new Produtos ();
		mouse.nome = "Mouse Gamer";
		mouse.quantidade = 10;
		mouse.codigo = 347;
		mouse.preco = 100;
	
	while (selecionadoA != 5) {
		while (selecionadoP != 420 && selecionadoP != 347) {
			System.out.println("Bem vindo! Escolha o código produto com qual deseja interagir: \n Pão de Queijo(420) \n Mouse Gamer(347)");
			selecionadoP = dig.nextInt();
		
			if (selecionadoP != 420 && selecionadoP != 347) {
				System.out.println("O produto inserido é invalido");
			}
		}
	
		System.out.println("O que deseja fazer? \n Digite '1' para adicionar algo ao estoque; \n Digite '2' para vender algo do estoque; \n Digite '3' para ver informações do item; \n Digite '4' para selecionar outro item; \n Digite '5' para sair do sistema.");
		selecionadoA = dig.nextInt();
		
		switch (selecionadoA) {
		case 4:
			selecionadoP = 0;
		break;
		
		// Adicionando ao estoque
		case 1:
			if (selecionadoP == 420) {
				
				System.out.println("Quanto deseja adicionar?");
				adicionar = dig.nextInt();
				pao.quantidade = pao.quantidade + adicionar;
				selecionadoP = 0;
			}
		
			if (selecionadoP == 347) {
				
				System.out.println("Quanto deseja adicionar?");
				adicionar = dig.nextInt();
				mouse.quantidade = mouse.quantidade + adicionar;
				selecionadoP = 0;
			}
		break;
		// Vendendo estoque
		case 2:
			if (selecionadoP == 420) {
		
				while (vender <= 0 || vender > pao.quantidade) {
					System.out.println("O estoque atual é: " + pao.quantidade + "\nQuanto deseja vender? (O valor vendido deve ser maior do que 0 e o estoque não pode ser menor do que 0)");
					vender = dig.nextInt();
				}
				pao.quantidade = pao.quantidade - vender;		
				
				selecionadoP = 0;
			}
			
			if (selecionadoP == 347) {
				
				while (vender <= 0 || vender > mouse.quantidade) {
					System.out.println("O estoque atual é: " + mouse.quantidade + "\nQuanto deseja vender? (O valor vendido deve ser maior do que 0 e o estoque não pode ser menor do que 0)");
					vender = dig.nextInt();
				}
				mouse.quantidade = mouse.quantidade - vender;
				
				selecionadoP = 0;
			}
		break;
		
		// Relatando detalhes
		case 3:
			if (selecionadoP == 420) {
				System.out.println("O nome do seu produto é " + pao.nome);
				System.out.println("Há " + pao.quantidade + " disponíveis");
				System.out.println("O preco do produto é R$" + pao.preco);
				System.out.println("O código do produto é " + pao.codigo);
				}
			if (selecionadoP == 347) {
				System.out.println("O nome do seu produto é " + mouse.nome);
				System.out.println("Há " + mouse.quantidade + " disponíveis");
				System.out.println("O preco do produto é R$" + mouse.preco);
				System.out.println("O código do produto é " + mouse.codigo);
				}
		break;
			}
		}
	}
}
