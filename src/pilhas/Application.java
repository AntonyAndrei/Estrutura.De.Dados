package pilhas;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero em Decimal para ser convertido em Binario: ");
		int numero = ler.nextInt();
		
		Pilha pilha = new Pilha();
		
		int resto;
		
		while(numero != 0) {
			resto = numero % 2; 		//pego o resto da divisao deste numero por 2 (0 ou 1)
			pilha.empilhar(resto);		//armazeno na pilha
			numero = numero/2;			// gero um novo numero, resultado da divisao dele por2
			
		}
		
		System.out.println("O Numero Digitado Em Binario eh: ");
		
		while(!pilha.estaVazia()) {
			resto = pilha.desenpilhar(); //remove da pilha (Sempre quem esta no topo)
			System.out.print(resto); 	 //joga na tela quem foi removido da pilha
		}
		
		System.out.println("\n\nFim do programa");
	
		ler.close();
	}

	
}
