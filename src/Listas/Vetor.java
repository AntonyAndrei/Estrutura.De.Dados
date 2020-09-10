package Listas;

public class Vetor<T> {

    private T[] vetor;

    private int qntElementos = 0;
    private int tamanhoTotalVetor = 0;

    @SuppressWarnings("unchecked")
	public Vetor(int tam) {
        
        //Criando um novo vetor gen�rico
        vetor = (T[]) new Object[tam]; 
        
        this.tamanhoTotalVetor = tam;
        
    }

    public boolean existeDado(int pos) {
        return vetor[pos] != null;
    }

    //M�todo que retorna o valor de uma posi��o do vetor
    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posi��o Inv�lida");
        }
        return vetor[pos];
    }

    //M�todo que verifica se o vetor est� vazio
    public boolean vazio() {
        return Tamanho() == 0;
    }

    public void Adicionar(T elemento) {

        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        //Passamos o vetor como par�metro para o iterador
        Iterador <T> it = new Iterador<>(vetor);

        int i=0;
        while (it.hasNext()){ //percorrendo o vetor usando iterador
        
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
			System.out.println("Lista Vazia! N�o ha nada pra Mostrar!");
		}

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
		System.out.println("]\n");
	}

   //M�todo que remove do vetor em uma determinada posi��o
    public void Remover(int posicao) throws ArrayIndexOutOfBoundsException {

    	try {
        	Iterador<T> it = new Iterador<>(vetor);
    		int i = posicao;

    		while (it.hasNext() && this.qntElementos - 1 > i) {
				if (it.next() != null) {
					vetor[i] = vetor[i+1];
					i++;
					
				}
			}
    		this.qntElementos--;
			vetor[qntElementos] = null;
        	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o para remo��o Inv�lida!");
		}
    	
    }

    
 
    //M�todo que remove do in�cio do vetor
    public void RemoverInicio() {

    }

    //M�todo que remove do fim do vetor
    public void RemoverFim() {

    }

    
    //M�todo que retorna o tamanho atual do vetor
    public int Tamanho() {
        return qntElementos;
    }

    //M�todo que limpa/apaga todas as posi��es do vetor
    public void Limpar() {

    }

    //M�todo que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar(){

    }
    
    
}