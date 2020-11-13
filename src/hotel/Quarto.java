package hotel;

public class Quarto implements Comparable<Quarto> {
    private int andar;
    private int numero;

    public Quarto(){
        this.andar = 0;
        this.numero = 0;
    }

    public Quarto(int andar, int numero){
        this.andar = andar;
        this.numero= numero;
    }

    public void setAndar(int andar){
        this.andar = andar;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAndar(){
        return this.andar;
    }

    public int getNumero(){
        return this.numero;
    }
    

	@Override
	public String toString() {
		return  "Andar " + andar + " Quarto(" + numero + ")";
	}

	@Override
	public int compareTo(Quarto o) {
		if (this.andar != o.andar) {
		    return this.andar-o.andar;
		} else {
		    return this.numero-o.numero;
		}
	}
    
    
}
