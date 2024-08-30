package Pilha;

import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> listaPilha = new LinkedList<T>();

    public void empilhar(T elemento) {
        this.listaPilha.addLast(elemento);
    }

    public T desempilhar() {
        return this.listaPilha.removeLast();
    }

    public T verificarTopo() {
        return this.listaPilha.getLast();
    }

    public void imprimir() {
        System.out.println(this.listaPilha.toString());
    }

    public int tamanho() {
        return this.listaPilha.size();
    }
}
