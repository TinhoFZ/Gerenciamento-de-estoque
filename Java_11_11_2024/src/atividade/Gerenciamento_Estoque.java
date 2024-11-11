package atividade;

import java.util.Scanner;

public class Gerenciamento_Estoque {
	
public static Scanner teclado = new Scanner (System.in);
public static String produto1, produto2;
// O numero ao lado de "preco" e "quantidade" representa o produto ao qual está se referindo.
public static double preco1, preco2;
// O "codigo" é como um identificador para cada produto, por este motivo 2 produtos não podem ter o mesmo.
public static int codigo1, codigo2, quantidade1, quantidade2, escolhaProduto;


	static void adicionarEstoque(){
	int valorAdicionado;
	
	switch (escolhaProduto) {
	// Dependendo do código escolhido para o produto, a ação será realizada em um produto diferente.
	case 420:
		System.out.println("Quanto deseja adicionar?");
		valorAdicionado = teclado.nextInt();
		if (valorAdicionado <= 0) {
			System.out.println("O valor inserido é menor ou igual a zero, por favor insira um valor novo.");
			adicionarEstoque();
		}
		quantidade1 = quantidade1 + valorAdicionado;
		interagir();
	break;
	case 342:
		 System.out.println("Quanto deseja adicionar?");
		 valorAdicionado = teclado.nextInt();
		 if (valorAdicionado <= 0) {
			 System.out.println("O valor inserido é menor ou igual a zero, por favor insira um valor novo.");
			 adicionarEstoque();
		 }
		 quantidade2 = quantidade2 + valorAdicionado;
		 interagir();
	}
	}
	

	static void vender() {
	int valorVendido;
		
	System.out.println("Quanto estoque deseja vender?");
	valorVendido = teclado.nextInt();
	if (valorVendido <= 0) {
		System.out.println("O valor inserido é menor ou igual a zero, por favor insira um valor novo.");
		vender();
	}
	
	quantidade1 = quantidade1 - valorVendido;
	switch (escolhaProduto) {
	case 420:
		if (quantidade1 > 0) {
			System.out.println("A quantidade foi vendida com sucesso");
			interagir();
		} else {
			quantidade1 = quantidade1 + valorVendido;
			System.out.println("O valor inserido é maior do que a quantidade disponível em estoque");
			vender();
			}
	break;
	case 342:
		if (quantidade2 > 0) {
		System.out.println("A quantidade foi vendida com sucesso");
		interagir();
	} else {
		quantidade2 = quantidade2 + valorVendido;
		System.out.println("O valor inserido é maior do que a quantidade disponível em estoque");
		vender();
	break;
		}
		
		}
	}
	
	
	static void relatorio() {
		switch (escolhaProduto) {
		case 420:
			System.out.println("O nome deste produto é: " + produto1);
			System.out.println("O codigo deste protudo é: " + codigo1);
			System.out.println("O preco deste produto é: " + preco1);
			System.out.println("A quantidade em estoque deste produto é: " + quantidade1);
			interagir();
		break;
		case 342:
			System.out.println("O nome deste produto é: " + produto2);
			System.out.println("O codigo deste protudo é: " + codigo2);
			System.out.println("O preco deste produto é: " + preco2);
			System.out.println("A quantidade em estoque deste produto é: " + quantidade2);
			interagir();
		}
		
	}
	
	
	static void interagir() {
		int escolhaProduto;
		String escolhaAcao;
		System.out.println("\n Insira o código do produto que deseja escolher. \n '420' \n '342'");
		escolhaProduto = teclado.nextInt();

		System.out.println("\n O que deseja realizar? \n Digite 'a' para adicionar um produto; \n Digite 'v' para vender um produto; \n Digite 'r' para ver o relatorio.");
		escolhaAcao = teclado.nextLine();
		switch (escolhaAcao) {
		case "a": adicionarEstoque();
		break;
		case "v": vender();
		break;
		case "r": relatorio();
		break;
		
		default: System.out.println("Você inseriu um valor não válido.");
		interagir();
		break;
		}
	}
	
	
	public static void main(String[] args) {
		
		produto1 = "Pão de Queijo";
		codigo1 = 420;
		preco1 = 0.5;
		quantidade1 = 31;
		
		produto2 = "Mouse gamer";
		codigo2 = 342;
		preco2 = 100;
		quantidade2 = 10;
		
		interagir();
	}

}
