package Listas;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		Aluno a1 = new Aluno("Antony");
		Aluno a2 = new Aluno("Jaala");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(new Aluno("Fulano"));
		
		System.out.println(lista);
		System.out.println("O Tamanho do vetor é: " + lista.tamanho());
		System.out.print("Digite o nome de um Aluno para pesquisar se ele está na lista: ");
		String nome = ler.nextLine();
		if (lista.contem(nome) == true) {
			System.out.println("O Aluno(a)" + nome + " Está na lista!");
		}
		
		
	}

}
