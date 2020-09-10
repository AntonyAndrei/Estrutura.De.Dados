package Listas;


public class Application {

	public static void main(String[] args) {

		/*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Aluno*/
		Vetor<Aluno> listaAlunos = new Vetor<Aluno>(4);
		
		//Instanciando um aluno
		Aluno a = new Aluno("ANA", 30);
		Aluno a2 = new Aluno("MARIA", 35);
		Aluno a3 = new Aluno("ANTONY", 21);
		Aluno a4 = new Aluno("JAALA", 21);
		Aluno a5 = new Aluno("FULANO", 21);
		Aluno a6 = new Aluno("CICLANO", 25);
		
		//Adicionando o aluno no vetor
		listaAlunos.adicionaFinal(a);
		listaAlunos.adicionaFinal(a2);
		listaAlunos.adicionaFinal(a3);
		listaAlunos.adicionaFinal(a4);
		
		listaAlunos.listarDados();
		
		listaAlunos.adicionaNaPosicao(a6, 2);
		
		listaAlunos.listarDados();
		
		listaAlunos.adicionaInicio(a5);

		listaAlunos.listarDados();
		
		listaAlunos.Remover(7);
		
		listaAlunos.listarDados();
		
		listaAlunos.RemoverInicio();
		
		listaAlunos.RemoverFim();
		
		listaAlunos.listarDados();
		
		listaAlunos.Limpar();
		
		listaAlunos.listarDados();

		
	}

}
