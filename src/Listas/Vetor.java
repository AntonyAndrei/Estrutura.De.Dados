package Listas;

public class Vetor<T> {

    private T[] vetor;
    private T[] vetor2;

    private int qntElementos = 0;
    private int tamanhoTotalVetor = 0;

    @SuppressWarnings("unchecked")
	public Vetor(int tam) {
        
        //Criando um novo vetor genérico
    	
        vetor = (T[]) new Object[tam]; 
        
        this.tamanhoTotalVetor = tam;
        
    }

    public boolean existeDado(int pos) {
        return vetor[pos] != null;
    }

    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        return vetor[pos];
    }

    public boolean vazio() {
        return Tamanho() == 0;
    }

    public void adicionaFinal(T elemento) {

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
    
	public void adicionaInicio(T elemento) {

		if (Tamanho() == vetor.length) {
			redimensionar();
		}

		Iterador<T> it = new Iterador<>(vetor);
		int i = this.qntElementos;

		while (it.hasNext() && i >= 0) {

			if (it.next() != null) {
				vetor[i + 1] = vetor[i];
				i--;
			}
		}
		this.qntElementos++;
		vetor[0] = elemento;
	}
	
	public void adicionaNaPosicao(T elemento, int posicao) {

		if (Tamanho() == vetor.length) {
			redimensionar();
		}

		Iterador<T> it = new Iterador<>(vetor);
		int i = this.qntElementos;

		while (it.hasNext() && i > 0) {

			if (it.next() != null) {
				vetor[i + 1] = vetor[i];
				i--;
			}
		}
		this.qntElementos++;
		vetor[posicao] = elemento;
	}

	public void listarDados() {

		if (vazio()) {
			System.out.println("Lista Vazia! Não ha nada pra Mostrar!");
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

	public void Remover(int posicao) throws ArrayIndexOutOfBoundsException {

		if (posicao >= this.qntElementos) {
			System.out.println("Posição Para Remoção Já está vazia \n");

		} else {

			try {
				Iterador<T> it = new Iterador<>(vetor);
				int i = posicao;

				while (it.hasNext() && this.qntElementos - 1 > i) {

					if (it.next() != null) {
						vetor[i] = vetor[i + 1];
						i++;
					}
				}
				this.qntElementos--;
				vetor[qntElementos] = null;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição para remoção Inválida!");
			}

		}
	}
 
	public void RemoverInicio() {

		if (this.qntElementos == 0) {
			System.out.println("O Vetor já está vazio! \n");

		} else {

			Iterador<T> it = new Iterador<>(vetor);
			int i = 0;

			while (it.hasNext() && this.qntElementos - 1 > i) {

				if (it.next() != null) {
					vetor[i] = vetor[i + 1];
					i++;
				}
			}
			this.qntElementos--;
			vetor[qntElementos] = null;
		}

	}

	public void RemoverFim() {

		if (this.qntElementos == 0) {
			System.out.println("O Vetor já está vazio! \n");

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


	//Método que dobra o tamanho do vetor caso ele atinja o seu tamanho maximo.
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