package hotel;

public class Application {

	public static void main(String[] args) {
		Quarto a1 = new Quarto(1, 1);
		Quarto a2 = new Quarto(1, 3);
		Quarto a3 = new Quarto(2, 1);
		Quarto a4 = new Quarto(2, 4);
		Quarto a5 = new Quarto(3, 1);
		Quarto a6 = new Quarto(1, 4);
		Quarto a7 = new Quarto(2, 2);
		
		Lista lista = new Lista();
        
        lista.adicionaInicio(a1);  
        lista.adicionaInicio(a2);  
        lista.adicionaInicio(a3);   
        lista.adicionaInicio(a4);
        lista.adicionaInicio(a5);
        lista.adicionaInicio(a6);
        lista.adicionaInicio(a7);

        System.out.println("Imprimir a lista completa: ");
        System.out.println(lista);
        System.out.println();
        lista.organizarQuartos();
        System.out.println("Imprimir a lista completa Ordenada: ");
        System.out.println(lista);
        System.out.println();

	}

}
