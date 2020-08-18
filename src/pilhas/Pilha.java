package pilhas;

public class Pilha {

	private int valores[];
	private int topo;
	
	public Pilha() {
		valores = new int[100];
		topo = -1;
	}
	
	public void empilhar(int elemento) {
		topo++;
		valores[topo] = elemento;
	}
	
	public boolean estaVazia() {
		return (topo ==-1);
		
	}
	
	public boolean estaCheia() {
		return (topo ==9);
		
	}
	
	public int desenpilhar() {
		int elem = valores[topo];
		topo--;
		return elem;
	}
	
}
