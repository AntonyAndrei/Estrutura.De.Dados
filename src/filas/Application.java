package filas;

public class Application {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Antony",21);
		Aluno a5 = new Aluno("Jaala", 21);
		Aluno a6 = new Aluno("Trocado", 21);

		Fila fila = new Fila();
        
		fila.enfileirar(a1);  //funcionando
		fila.enfileirar(a2);  //funcionando
		fila.enfileirar(a3);  //funcionando 
		fila.enfileirar(a4);
		fila.enfileirar(a5);

        System.out.println("Imprimir a Fila completa: ");
        System.out.println(fila);
        System.out.println();
        
        System.out.println("Atender: ");
        fila.atender();
        System.out.println(fila);
        System.out.println();
        
        System.out.print("O primeiro da Fila agora é: ");
        System.out.println(fila.Recupera());
        System.out.println();
        
        System.out.println("Ana está no inicio da fila? ");
        System.out.println(fila.existeDado(a2));
        System.out.println();
        
        System.out.println("A fila está vazia? ");
        System.out.println(fila.isEmpty());
        System.out.println();
        
        /*
        System.out.println("Trocar o primeiro da fila: ");
        fila.alterar(a6);
        System.out.println(fila);
        System.out.println(); */
        // nao consigo fazer rodar, ta dando erro

        System.out.println("limpar a Fila totalmente!");
        fila.limpar();
        System.out.println(fila);
        System.out.println("A fila está vazia? ");
        System.out.println(fila.isEmpty());
        System.out.println();
        
        

		
		
	}

}
