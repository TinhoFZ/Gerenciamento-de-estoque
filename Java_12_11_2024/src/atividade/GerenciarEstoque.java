package atividade;

import java.util.Scanner;

public class GerenciarEstoque {

	public static void main(String[] args) {
	Scanner dig = new Scanner(System.in);
		
	Produtos pao = new Produtos();
	pao.nome = "Pão de Queijo";
	pao.quantidade = 30;
	pao.codigo = 420;
	pao.preco = 0.50;
	
	Produtos mouse = new Produtos();
	mouse.nome = "Mouse Gamer";
	mouse.quantidade = 10;
	mouse.codigo = 347;
	mouse.preco = 100;
	
	System.out.println("O nome do seu produto é " + pao.nome);
	System.out.println("Há " + pao.quantidade + " disponíveis");
	System.out.println("O preco do produto é R$" + pao.preco);
	System.out.println("O código do produto é " + pao.codigo);
	}
}