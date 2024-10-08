package FilaQueue;

import java.util.LinkedList;
import java.util.Queue;

import Pilha.Pilha;

public class Fila<T> {
    private Queue<T> listaFila = new LinkedList<T>();
    private Pilha<T> pil = new Pilha<T>();

    public void adicionar(T elemento) {
        this.listaFila.add(elemento);
    }

    public T remover() {
        return this.listaFila.remove();
    }

    public boolean verificarVazia() {
        return this.listaFila.isEmpty();
    }

    public void imprimir() {
        System.out.println(this.listaFila.toString());
    }

    public void inverterFila() {
        while (!this.verificarVazia()) 
            this.pil.empilhar(this.remover());
        
        while (!this.pil.verificarVazia()) 
            this.adicionar(this.pil.desempilhar());
    }
}
