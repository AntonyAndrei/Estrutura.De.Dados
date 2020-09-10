package Listas;

public class Vetor<T> {

    private T[] vetor;

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

    //Método que retorna o valor de uma posição do vetor
    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        return vetor[pos];
    }

    //Método que verifica se o vetor está vazio
    public boolean vazio() {
        return Tamanho() == 0;
    }

    public void Adicionar(T elemento) {

        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        //Passamos o vetor como parâmetro para o iterador
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
			System.out.println("Lista Vazia! Não ha nada pra Mostrar!");
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

   //Método que remove do vetor em uma determinada posição
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
			System.out.println("Posição para remoção Inválida!");
		}
    	
    }

    
 
    //Método que remove do início do vetor
    public void RemoverInicio() {

    }

    //Método que remove do fim do vetor
    public void RemoverFim() {

    }

    
    //Método que retorna o tamanho atual do vetor
    public int Tamanho() {
        return qntElementos;
    }

    //Método que limpa/apaga todas as posições do vetor
    public void Limpar() {

    }

    //Método que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar(){

    }
    
    
}