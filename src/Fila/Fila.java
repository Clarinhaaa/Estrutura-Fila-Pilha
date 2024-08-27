package Fila;
import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> listaFila = new LinkedList<T>();

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
        
    }
}
