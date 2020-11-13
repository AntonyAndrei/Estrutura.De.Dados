package noCabeca;

public class Application {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Antony",21);
		Aluno a5 = new Aluno("Jaala", 21);
		Aluno a6 = new Aluno("Fulano", 21);

		ListaDuplamenteLigadaComNoCabeca lista = new ListaDuplamenteLigadaComNoCabeca();
        
        lista.adicionaInicio(a1); 
        System.out.println(lista);
        System.out.println();
        lista.adicionaInicio(a2); 
        System.out.println(lista);
        System.out.println();
        lista.adicionaInicio(a3); 
        System.out.println(lista);
        System.out.println();
        lista.adicionaInicio(a6); 
        System.out.println(lista);
        System.out.println();
        lista.adicionaInicio(a4);
        System.out.println(lista);
        System.out.println();
        lista.adicionaFim(a5);
        System.out.println(lista);
        System.out.println();

        System.out.println("Imprimir a lista completa: ");
        System.out.println(lista);
        System.out.println();
        
        System.out.print("Pegar Aluno na posição 2: ");
        System.out.println(lista.RecuperaAluno(2));
        System.out.println();
        
        System.out.println("Remover do Inicio: ");
        lista.removeInicio();
        System.out.println(lista);
        System.out.println();
        
        System.out.println("Remover Do Final: ");
        lista.removeFim();
        System.out.println(lista);
        System.out.println();
        
        System.out.println("Remover Da posição 1: ");
        lista.remove(1);
        System.out.println(lista);
        
        System.out.println();
        System.out.println("limpar a lista totalmente!");
        lista.limpaLista();
        System.out.println(lista);
       
        
        

		
		
	}

}
