package FilaQueue;

import Basica.Processo;

public class Main {
    public static void main(String[] args) {
        Processo pro1 = new Processo(1, "Primeiro");
        Processo pro2 = new Processo(2, "Segundo");
        Processo pro3 = new Processo(3, "Terceiro");
        Processo pro4 = new Processo(4, "Quarto");

        Fila<Processo> fila = new Fila<Processo>();

        fila.adicionar(pro1);
        fila.adicionar(pro2);
        fila.adicionar(pro3);
        fila.adicionar(pro4);

        if (fila.verificarVazia()) {
            System.out.println("Fila vazia!");
        } else {
            fila.imprimir();
        }

        System.out.println();
        System.out.println("Elemento removido: " + fila.remover());
        fila.inverterFila();
        System.out.println();

        fila.imprimir();
    }
}
