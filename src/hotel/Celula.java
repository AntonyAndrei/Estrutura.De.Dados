package hotel;

public class Celula {

    private Celula proximo;
    private Quarto elemento;

    public Celula() {
    }

    public Celula(Quarto elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proximo, Quarto elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Quarto getElemento() {
        return elemento;
    }

    public void setElemento(Quarto elemento) {
        this.elemento = elemento;
    }

}
