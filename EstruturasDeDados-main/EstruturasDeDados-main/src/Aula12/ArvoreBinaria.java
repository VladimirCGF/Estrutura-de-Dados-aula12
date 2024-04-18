package Aula12;

public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }
    
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No noAtual, int valor) {
        if (noAtual == null) {
            return new No(valor);
        }

        if (valor < noAtual.elemento) {
            noAtual.esquerda = inserirRecursivo(noAtual.esquerda, valor);
        } else if (valor > noAtual.elemento) {
            noAtual.direita = inserirRecursivo(noAtual.direita, valor);
        }

        return noAtual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(No noAtual, int valor) {
        if (noAtual == null) {
            return false;
        }

        if (valor == noAtual.elemento) {
            return true;
        }

        return valor < noAtual.elemento ? buscarRecursivo(noAtual.esquerda, valor) : buscarRecursivo(noAtual.direita, valor);
    }
    public void percorrerEmOrdem() {
        percorrerEmOrdemRecursivo(raiz);
    }
    private void percorrerEmOrdemRecursivo(No noAtual) {
        if (noAtual != null) {
            percorrerEmOrdemRecursivo(noAtual.esquerda);
            System.out.print(noAtual.elemento + " ");
            percorrerEmOrdemRecursivo(noAtual.direita);
        }
    }

    public void percorrerPreOrdem() {
        percorrerPreOrdemRecursivo(raiz);
    }

    private void percorrerPreOrdemRecursivo(No noAtual) {
        if (noAtual != null) {
            System.out.print(noAtual.elemento + " ");
            percorrerPreOrdemRecursivo(noAtual.esquerda);
            percorrerPreOrdemRecursivo(noAtual.direita);
        }
    }

    public void percorrerPosOrdem() {
        percorrerPosOrdemRecursivo(raiz);
    }

    private void percorrerPosOrdemRecursivo(No noAtual) {
        if (noAtual != null) {
            percorrerPosOrdemRecursivo(noAtual.esquerda);
            percorrerPosOrdemRecursivo(noAtual.direita);
            System.out.print(noAtual.elemento + " ");
        }
    }
    public void imprimirArvore(No no, int profundidade) {
        if (no != null) {
            imprimirArvore(no.direita, profundidade + 1);
            for (int i = 0; i < profundidade; i++) {
                System.out.print("   ");
            }
            System.out.println(no.elemento);
            imprimirArvore(no.esquerda, profundidade + 1);
        }
    }
}

