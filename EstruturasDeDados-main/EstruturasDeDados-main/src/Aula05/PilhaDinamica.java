package Aula05;

public class PilhaDinamica {
    private No topo;
    public PilhaDinamica(){
        this.topo = null;
    }
    public void push(int elemento){
       No noAux = new No(elemento);
       noAux.setProximo(this.topo);
       this.topo = noAux;
    }
    public void pop(){
        No noAux = this.topo;
        this.topo = noAux.getProximo();
        noAux.setProximo(null);
    }
}
