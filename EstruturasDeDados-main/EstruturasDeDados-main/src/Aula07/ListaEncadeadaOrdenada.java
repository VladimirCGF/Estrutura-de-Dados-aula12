package Aula07;

public class ListaEncadeadaOrdenada
{
    private No inicio;
    private No fim;
    private int tamanhoLista;

    public ListaEncadeadaOrdenada(){
        this.inicio = null;
        this.fim = null;
        this.tamanhoLista = 0;
    }

    private void inserirInicio(int elemento){
        No noAux = new No(elemento);
        if(listaEstaVazia()){
            this.fim = noAux;
        }
        noAux.setProximo(this.inicio);
        this.inicio = noAux;
        this.tamanhoLista ++;
    }
    private void inserirFim(int elemento){
        No noAux = new No(elemento);

        this.fim.setProximo(noAux);
        this.fim = noAux;
        this.tamanhoLista ++;
    }
    private void inserirMeio(int elemento){
        No noAux = new No(elemento);
        No noAtual = this.inicio;

        while (elemento > noAtual.getElemento() && elemento > noAtual.getProximo().getElemento()){
            noAtual = noAtual.getProximo();
        }
        noAux.setProximo(noAtual.getProximo());
        noAtual.setProximo(noAux);
        this.tamanhoLista ++;
    }
    private void removerInicio(){
        No noAux = this.inicio;
        this.inicio = noAux.getProximo();
        noAux.setProximo(null);
        this.tamanhoLista --;
    }
    private void removerFim(){

        No noAux = this.inicio;
        for(int i=1 ; i < (this.tamanhoLista - 1) ; i++){
            noAux = noAux.getProximo();
        }
        noAux.setProximo(null);
        this.fim = noAux;
        this.tamanhoLista --;
    }
    private void removerMeio(int elemento){

        No noAtual = this.inicio;

        while (elemento != noAtual.getProximo().getElemento()){
            noAtual = noAtual.getProximo();
        }
        No noAux = noAtual.getProximo().getProximo();
        noAtual.getProximo().setProximo(null);

        noAtual.setProximo(noAux);

        this.tamanhoLista --;
    }

    public void imprimirLista(){
        No noAtual = this.inicio;
        while (noAtual != null){
            System.out.print("[" + noAtual.getElemento()+"]");
            noAtual = noAtual.getProximo();
        }
        System.out.println();

    }
    public void adicionar(int elemento){
        if (listaEstaVazia() ||  elemento < this.inicio.getElemento()){
            inserirInicio(elemento);
        }
        else if(elemento > fim.getElemento()){
            inserirFim(elemento);
        }
        else{
            inserirMeio(elemento);
        }
    }
    public void remove(int elemento){
        if(elemento == this.inicio.getElemento()){
            removerInicio();
        }
        else if(elemento == this.fim.getElemento()){
            removerFim();
        }
        else {
            removerMeio(elemento);
        }
    }

    public boolean listaEstaVazia(){
        return this.inicio == null ? true : false;
    }
}
