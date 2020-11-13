package pilhas;

public class Application {

	public static void main(String[] args) {

		/*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Aluno*/
		Pilha<Aluno> pilhaAlunos = new Pilha<Aluno>(4);
		
		//Instanciando um aluno
		Aluno a = new Aluno("ANA", 30);
		Aluno a2 = new Aluno("MARIA", 35);
		Aluno a3 = new Aluno("ANTONY", 21);
		Aluno a4 = new Aluno("JAALA", 21);
		Aluno a5 = new Aluno("FULANO", 21);
		Aluno a6 = new Aluno("CICLANO", 25);
		
		//Adicionando o aluno no vetor
		pilhaAlunos.Push(a);
		pilhaAlunos.Push(a2);
		pilhaAlunos.Push(a3);
		pilhaAlunos.Push(a4);
		
		pilhaAlunos.listarDados();

		pilhaAlunos.Pop();
		
		pilhaAlunos.listarDados();
		
		pilhaAlunos.Limpar();
		
		pilhaAlunos.listarDados();
		
	}

}
