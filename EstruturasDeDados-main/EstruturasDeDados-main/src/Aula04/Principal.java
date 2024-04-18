package Aula04;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        PilhaEstatica p = new PilhaEstatica(3);
        p.push(20);
        p.push(30);
        p.push(40);

        p.pop();
        p.pop();
        p.imprimir();

        FilaEstatica  f = new FilaEstatica(3);
        f.inserir(20);
        f.inserir(30);
        f.inserir(40);


    }
}
