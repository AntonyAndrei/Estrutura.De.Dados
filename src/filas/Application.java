package filas;

public class Application {
	
	public static void main(String[] args) {

		int senha;
		Fila fila = new Fila();
		
		fila.inserirElemento(10);
		fila.inserirElemento(200);
		fila.inserirElemento(220);
		fila.inserirElemento(300);
		fila.inserirElemento(350);
		
		System.out.println("\nBem vindos ao MCdonalds");
		System.out.println("Amo Muito tudo Isso!");
		System.out.println("Fila de atendimento--------------------------\n");
		
		 while (!fila.estaVazio()) {
			 senha = fila.retirarElemento();        // remove da fila e vai para o guiche
			 System.out.println("Senha a ser atendida no guiche: " + senha + "\n");
		 }
		
	}

}
