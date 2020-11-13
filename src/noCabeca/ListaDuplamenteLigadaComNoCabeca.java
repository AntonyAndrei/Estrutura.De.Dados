package noCabeca;

public class ListaDuplamenteLigadaComNoCabeca<T> {

    private Celula inicio, fim, cabeca;
    private int tamanho;

    public ListaDuplamenteLigadaComNoCabeca() {
        this.inicio = null;
        this.fim = null;  
        this.cabeca = new Celula(null); 
        this.tamanho = 0;      
    }
    
    private boolean existeDado (int posicao) {
    	return posicao >= 0 && posicao < this.tamanho;
    }

    public void adicionaInicio(T elemento) {
    	
        if (this.tamanho == 0) {
        	Celula nova = new Celula(elemento); 
            cabeca.setProximo(nova);
            cabeca.setAnterior(nova);
            nova.setAnterior(cabeca);
            nova.setProximo(cabeca);
        } else {
        	Celula primeira = cabeca.getProximo();
        	Celula nova = new Celula(elemento);
        	nova.setAnterior(cabeca);
        	cabeca.setProximo(nova);
        	nova.setProximo(primeira);
        	primeira.setAnterior(nova);
        }
        this.tamanho += 1;
    }
    
    public void adicionaFim(T elemento) {
    	
    	if (tamanho == 0) {
			this.adicionaInicio(elemento);
		} else {
			Celula nova = new Celula(elemento);
			Celula ultima = cabeca.getAnterior();
			nova.setProximo(cabeca);
			cabeca.setAnterior(nova);
			nova.setAnterior(ultima);
			ultima.setProximo(nova);
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

    public T RecuperaAluno(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(cabeca.getProximo());
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
            
            Iterador it = new Iterador(cabeca.getProximo());
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
            
        } else if (tamanho == 1) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            Celula primeira = cabeca.getProximo();
            Celula proximo = primeira.getProximo();
            cabeca.setProximo(proximo);
            proximo.setAnterior(cabeca);
            this.tamanho -= 1;
        }
    }

    public void removeFim() {
    	
    	if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (tamanho == 1) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
        	Celula ultima = cabeca.getAnterior();
        	Celula penultima = ultima.getAnterior();
        	cabeca.setAnterior(penultima);
        	penultima.setProximo(cabeca);
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
		Celula atual = cabeca.getProximo();
		
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
