package Listas;

public class Vetor {

	private Aluno[] alunos = new Aluno[10];
	
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) {

	}

	public Aluno pega(int posicao) {
		return null;

	}

	public void remove(int posicao) {

	}


	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		/* Solucao Linear (Lenta)
		int quantidadeTotal = 0;
		for (int i = 0; i < alunos.length; i++) {
			if (this.alunos[i] != null) {
				quantidadeTotal++;
			}
		}
		return quantidadeTotal; */
		//solucao constante(rápida)
		return totalDeAlunos;
	}
	
	@Override
	public String toString() {
		
		if (totalDeAlunos == 0) {
			return "[Lista vazia!]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < totalDeAlunos; i++) {
			builder.append(this.alunos[i]);
			if (i < totalDeAlunos - 1) {
				builder.append(", ");
			}
		}
		
		builder.append("]");
		return builder.toString();
	}
	
	
}
