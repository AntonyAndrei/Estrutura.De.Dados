package filas;

public class Fila {

	private int[]valores;
	private int inicio;
	private int fim;
	private int total;
	
	public Fila() {
		valores = new int[10];
		inicio = 0;
		fim = 0;
		total = 0;
	}
	
	public void inserirElemento(int elemento) {
		valores[fim] = elemento;
		fim++;
		if (fim == valores.length) {
			fim = 0;
		}
		total++;
		System.out.println("A fila Agora tem " + total + " Pessoas.");
	}
	
	public int retirarElemento() {
		int elemento = valores[inicio];
		if (inicio == valores.length) {
			inicio = 0;
		}
		total--;
		for (int i = 0; i < valores.length-1; i++) {
			valores[i] = valores[i+1];
		}
		
		System.out.println("A fila Agora tem " + total + " Pessoas.");
		return elemento;
	}
	
	public boolean estaVazio() {
		return total == 0;
	}
	
	public boolean estaCheio() {
		return total == 10;
	}
}
