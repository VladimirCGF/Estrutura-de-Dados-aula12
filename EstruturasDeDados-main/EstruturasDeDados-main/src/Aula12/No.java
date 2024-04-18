package Aula12;

public class No {
    public int elemento;
    public No direita;
    public No esquerda;

    public No(int elemento) {
        this.elemento = elemento;
        this.direita = null;
        this.esquerda = null;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", direita=" + direita +
                ", esquerda=" + esquerda +
                '}';
    }
}