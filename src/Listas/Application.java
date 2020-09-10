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
		
		//Adicionando o aluno no vetor
		listaAlunos.Adicionar(a);
		listaAlunos.Adicionar(a2);
		listaAlunos.Adicionar(a3);
		listaAlunos.Adicionar(a4);
		
		
		//imprimindo os dados do aluno
		listaAlunos.listarDados();
		
		listaAlunos.Remover(1);
		
		listaAlunos.listarDados();
		



		
	}

}
