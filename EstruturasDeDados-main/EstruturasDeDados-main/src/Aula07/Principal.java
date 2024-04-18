package Aula07;

public class Principal {
    public static void main(String[] args) {
        ListaEncadeadaOrdenada lista = new ListaEncadeadaOrdenada();

        lista.adicionar(1);
        lista.adicionar(5);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(2);
        lista.imprimirLista();
        lista.remove(3);
        lista.imprimirLista();
    }
}
