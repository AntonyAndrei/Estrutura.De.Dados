package pilhas;


public class Pilha<T> {

    private T[] vetor;
    private T[] vetor2;

    private int qntElementos = 0;
    private int tamanhoTotalVetor = 0;

    @SuppressWarnings("unchecked")
	public Pilha(int tam) {
        
        vetor = (T[]) new Object[tam]; 
        
        this.tamanhoTotalVetor = tam;
        
    }
    
    public boolean existeDado() {
        return (vetor[this.qntElementos] != null);
    }
    
    public boolean verificaDado(int pos) {
        return vetor[pos] != null;
    }

    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!verificaDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        return vetor[pos];
    }
    
    public T Top() {
        return vetor[vetor.length];
    }

    public boolean vazio() {
        return Tamanho() == 0;
    }

    //Adiciona na Pilha
    public void Push(T elemento) {

        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        Iterador <T> it = new Iterador<>(vetor);

        int i=0;
        while (it.hasNext()){
        
            if (it.next() == null) {
                vetor[i] =  elemento;
                qntElementos++;
                break;
            }
            i++;
        }
    }
    
	public void listarDados() {

		if (vazio()) {
			System.out.println("Pilha Vazia! Não ha nada pra Mostrar!");
		} else {

			Iterador<T> it = new Iterador<>(vetor);
			int i = 0;

			System.out.print("[");

			while (it.hasNext()) {
				if (it.next() != null) {
					System.out.print(Recuperar(i));
					i++;
					if (i < qntElementos) {
						System.out.print(", ");
					}
				}
			}
			System.out.println("] = " + this.qntElementos + "\n");
		}
	}
	
	//Remove do topo da pilha
	public void Pop() {

		if (this.qntElementos == 0) {
			System.out.println("A Pilha já está vazio! \n");

		} else {
			this.qntElementos--;
			vetor[qntElementos] = null;
		}
	}

    public int Tamanho() {
        return qntElementos;
    }

    public void Limpar() {
    	
    	if (this.qntElementos == 0) {
			System.out.println("O Vetor já está Limpo! \n");

		} else {

			Iterador<T> it = new Iterador<>(vetor);
			int i = 0;

			while (it.hasNext() && this.qntElementos - 1 > i) {

				if (it.next() != null) {
					vetor[i] = null;
					i++;
				}
			}
			this.qntElementos = 0;
		}
    } 
    
    public int getQntElementos() {
		return qntElementos;
	}

    public void redimensionar(){
    	
    	vetor2 =  (T[]) new Object[this.vetor.length * 2];
    	
    	Iterador<T> it = new Iterador<>(vetor2);
		int i = 0;

		while (it.hasNext() && i < this.tamanhoTotalVetor) {

			if (it.next() == null) {
				vetor2[i] = vetor[i];
				i++;
			}
			
		}

		vetor = vetor2;
		
    }
    
    
}