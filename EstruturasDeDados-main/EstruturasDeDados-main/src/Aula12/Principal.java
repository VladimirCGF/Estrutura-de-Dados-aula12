package Aula12;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(15);
        arvore.inserir(12);
        arvore.inserir(25);
        arvore.inserir(35);

        System.out.println("Busca 3: " + arvore.buscar(3));
        System.out.println("Busca 12: " + arvore.buscar(12));

        System.out.print("Em Ordem: ");
        arvore.percorrerEmOrdem();

        System.out.print("\nPré Ordem: ");
        arvore.percorrerPreOrdem();

        System.out.print("\nPós Ordem: ");
        arvore.percorrerPosOrdem();
        System.out.println("\n");
        arvore.imprimirArvore(arvore.raiz, 0);

    }
}
