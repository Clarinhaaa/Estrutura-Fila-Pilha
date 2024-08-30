package Pilha;

import Basica.Processo;

public class Main {
    public static void main(String[] args) {
        Processo pro1 = new Processo(1, "Primeiro");
        Processo pro2 = new Processo(2, "Segundo");
        Processo pro3 = new Processo(3, "Terceiro");
        Processo pro4 = new Processo(4, "Quarto");

        Pilha<Processo> pilha = new Pilha<Processo>();

        pilha.empilhar(pro1);
        pilha.empilhar(pro2);
        pilha.empilhar(pro3);
        pilha.empilhar(pro4);

        pilha.imprimir();
        System.out.println("Elemento no topo: " + pilha.verificarTopo());

        System.out.println();
        System.out.println("Elemento removido: " + pilha.desempilhar());
        System.out.println();

        pilha.imprimir();
        System.out.println("Elemento no topo: " + pilha.verificarTopo());
    }
}
