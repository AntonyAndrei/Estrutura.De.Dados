package hotel;

public class Lista<T> {

    private Celula inicio, fim;
    private int tamanho;

    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    private boolean existeDado (int posicao) {
    	return posicao >= 0 && posicao < this.tamanho;
    }
    
    public void organizarQuartos() {  
        Celula atual = inicio, index = null;  
        Quarto temp;    
        if (inicio == null) {  
            return;  
        }  
        else {  
            while (atual != null) {  
                index = atual.getProximo();  
                  
                while (index != null) {   
                    if (atual.getElemento().compareTo(index.getElemento()) > 0) {  
                        temp = atual.getElemento();  
                        atual.setElemento(index.getElemento());  
                        index.setElemento(temp);  
                    }  
                    index = index.getProximo();  
                }  
                atual = atual.getProximo();  
            }      
        }  
    }  
    
    
    public void adicionaInicio(T elemento) {
        Celula nova = new Celula((Quarto) elemento);
        if (this.tamanho == 0) {
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
            this.tamanho += 1;
        }
    }
    
    public void adicionaFim(Quarto elemento) {
    	
    	if (tamanho == 0) {
			this.adicionaInicio((T) elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.fim.setProximo(nova);
			this.fim = nova;
			this.tamanho++;
		}

	}
    
    private Celula RecuperaCelula(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (Celula) it.getAtual();
        }
    }
    
    public int tamanho() {
		return this.tamanho;
    }
    
    
	@Override
	public String toString() {
		
		if (tamanho == 0) {
			return "lista vazia";
		}
		
		StringBuilder builder = new StringBuilder("\n");
		Celula atual = inicio;
		
		for (int i = 0; i < tamanho - 1; i++) {
			builder.append(atual.getElemento());
			builder.append("\n");
			atual = atual.getProximo();
		}
		
		builder.append(atual.getElemento());
		builder.append("\n");
		
		return builder.toString();
	}
    
    

}

