package revisaoProva1;

public class ListaOnibus<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaOnibus() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
        	Celula nova = new Celula(elemento);
            inicio = fim = nova;
            nova.setProximo(nova);
            nova.setAnterior(nova);
            this.tamanho += 1;
        } else {
        	Celula nova = new Celula(this.inicio, elemento);
        	fim.setProximo(nova);
            inicio.setAnterior(nova);
            nova.setProximo(inicio);
            nova.setAnterior(fim);
            inicio = nova;
            this.tamanho += 1;
        }
    }

    public void removeFim() {
    	
    	if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {  
        	Celula penultima = this.fim.getAnterior();
        	penultima.setProximo(inicio);
        	inicio.setAnterior(penultima);
            fim = penultima;
            this.tamanho -= 1;
        }
    }
    
    public void removeDuplicado() {
    	
    	Celula atual = inicio;
    	
    	for (int i = 0; i < tamanho - 1; i++) {
			
    		if (atual.getElemento().equals(atual.getProximo())) {
    			
    			/*cabeca doendo muito*/
			}
			
			atual = atual.getProximo();
		}
    }

    
	@Override
	public String toString() {
		
		if (tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = inicio;
		
		for (int i = 0; i < tamanho - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		
		builder.append(atual.getElemento());
		builder.append("]" + " - " + tamanho);
		
		return builder.toString();
	}


}
