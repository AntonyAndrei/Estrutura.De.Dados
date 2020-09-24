package listasDuplamenteLigadas;

public class ListaDuplamenteLigada<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    private boolean existeDado (int posicao) {
    	return posicao >= 0 && posicao < this.tamanho;
    }

    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
        	Celula nova = new Celula(elemento);
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
        	Celula nova = new Celula(this.inicio, elemento);
            inicio.setAnterior(nova);
            inicio = nova;
            this.tamanho += 1;
        }
    }
    
    public void adicionaFim(T elemento) {
    	
    	if (tamanho == 0) {
			this.adicionaInicio(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.fim.setProximo(nova);
			nova.setAnterior(fim);
			this.fim = nova;
			this.tamanho++;
		}

	}
    
	public void adiciona(int posicao, T elemento) {

		if (posicao == 0) {
			this.adicionaInicio(elemento);
		} else {
			if (posicao == this.tamanho) {
				this.adicionaFim(elemento);
			} else {
				Celula anterior = (Celula) this.RecuperaCelula(posicao - 1);
				Celula proxima = anterior.getProximo();
				Celula nova = new Celula(anterior.getProximo(), elemento);
				nova.setAnterior(proxima.getAnterior());
				anterior.setProximo(nova);
				proxima.setAnterior(nova);
				this.tamanho++;
			}

		}

	}
    
    public Celula pega (int posicao) {
	 Celula atual = this.inicio;
	 for (int i = 0; i < posicao; i++) {
		atual = atual.getProximo();
	}
	 return atual;
	   
   }

    public T RecuperaAluno(int posicao) {
        
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
            
            return (T) it.getAtual().getElemento();
        }
    }
    
    private T RecuperaCelula(int posicao) {
        
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
            
            return (T) it.getAtual();
        }
    }

    public void removeInicio() {
        
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

    public void removeFim() {
    	
    	if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
        	Celula penultima = this.fim.getAnterior();
        	penultima.setProximo(null);
            fim = penultima;
            this.tamanho -= 1;
        }
    }

    public void remove (int posicao) {
    	
    	if (!this.existeDado(posicao)) {
			System.out.println("Não há elementos Na posição indicada");
		}
    	
    	if (posicao == 0) {
			this.removeInicio();
		} else {
			if (posicao == tamanho) {
				this.removeFim();
			} else {
				Celula anterior = (Celula) this.RecuperaCelula(posicao - 1);
				Celula atual = anterior.getProximo();
				Celula proxima = atual.getProximo();
				anterior.setProximo(proxima);
				proxima.setAnterior(anterior);
				atual.setAnterior(null);
				atual.setProximo(null);
				this.tamanho--;
			}
		}
    }
    
    public int tamanho() {
		return this.tamanho;
    }
    
    public void limpaLista () {
    	this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
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
