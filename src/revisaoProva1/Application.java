package revisaoProva1;

public class Application {

	public static void main(String[] args) {

		Onibus a1 = new Onibus("Atalaia", 99);
		Onibus a2 = new Onibus("Bugio", 500);
		Onibus a3 = new Onibus("SaoJose", 706);
		Onibus a4 = new Onibus("CasteloBranco", 707);
		Onibus a5 = new Onibus("AugustoFranco", 30);

		ListaOnibus<Onibus> lista = new ListaOnibus<Onibus>();
        
        lista.adicionaInicio(a1);  
        lista.adicionaInicio(a2);  
        lista.adicionaInicio(a3);  
        lista.adicionaInicio(a4);
        lista.adicionaInicio(a5);
        lista.adicionaInicio(a3);

        System.out.println("Imprimir Intinerario: ");
        System.out.println(lista);
        System.out.println();
            
        System.out.println("Remover Ultimo Onibus: ");
        lista.removeFim();
        System.out.println(lista);
        System.out.println();
        
        
        
        

        

		
		
	}

}
