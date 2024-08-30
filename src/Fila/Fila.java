package Fila;

import java.util.LinkedList;
import Pilha.Pilha;

public class Fila<T> {
    private LinkedList<T> listaFila = new LinkedList<T>();
    private Pilha<T> pil = new Pilha<T>();

    public void adicionar(T elemento) {
        this.listaFila.addLast(elemento);
    }

    public T remover() {
        return this.listaFila.removeFirst();
    }

    public boolean verificarVazia() {
        return this.listaFila.isEmpty();
    }

    public void imprimir() {
        System.out.println(this.listaFila.toString());
    }

    public void inverterFila() {
        while (this.listaFila.size() > 0) {
            pil.empilhar(this.listaFila.removeFirst());
        }
        while (this.pil.tamanho() > 0) {
            this.listaFila.addLast(this.pil.desempilhar());
        }
    }
}
