package revisaoProva1;

public class Onibus {
    private String nome;
    private int placa;

    public Onibus(){
        this.nome =" ";
        this.placa=0;
    }

    public Onibus(String nome, int idade){
        this.nome = nome;
        this.placa= idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.placa = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.placa;
    }

	@Override
	public String toString() {
		return nome + "(" + placa + ")";
	}
    
    
}
