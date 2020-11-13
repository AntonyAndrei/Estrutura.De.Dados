package filas;


public class Fila<T> {

    private Celula inicio, fim;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public boolean existeDado (T elemento) {
    	return elemento == this.inicio.getElemento();
    }

    public void enfileirar(T elemento) {
    	if (tamanho == 0) {
    		
    		Celula nova = new Celula(elemento);
            if (this.tamanho == 0) {
                inicio = fim = nova;
                this.tamanho += 1;
            } else {
                nova.setProximo(inicio);
                inicio = nova;
                this.tamanho += 1;
            }
    		
		} else {
			Celula nova = new Celula(elemento);
			this.fim.setProximo(nova);
			this.fim = nova;
			this.tamanho++;
		}
    }
    
    public boolean isEmpty() {
    	return this.tamanho == 0;
    }
    
    public T Recupera() {
    	Celula primeira = this.inicio;
        return (T) primeira.getElemento();
    }
    
    public T RecuperaCelula() {
		Celula primeira = this.inicio;
        return (T) primeira;
	}

    public void alterar (T elemento) {
    	Celula alterar = new Celula(elemento);
    	Celula proxima = new Celula(inicio.getProximo());
    	this.inicio = alterar;
    	this.inicio.setProximo(proxima);
    }
    
    public void atender() {
        
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
    
    public int tamanho() {
		return this.tamanho;
    }
    
    

    public void limpar () {
    	this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
	
    @Override
	public String toString() {
		
		if (tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("• ");
		Celula atual = inicio;
		
		for (int i = 0; i < tamanho - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(" <- ");
			atual = atual.getProximo();
		}
		
		builder.append(atual.getElemento());
		builder.append(" - " + tamanho);
		
		return builder.toString();
	}
    
}

