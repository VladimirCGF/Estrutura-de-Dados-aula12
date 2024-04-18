package Aula07;

public class No {
    private int elemento;
    private No proximo;

    public No(int valor){
        this.elemento = valor;
        this.proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public int getElemento() {
        return elemento;
    }
}
