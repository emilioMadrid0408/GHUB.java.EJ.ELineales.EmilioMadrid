package miPrincipal;

public class Pila<T> {

    private Nodo<T> cabeza;
    private int tamanio;

    public Pila() {
        cabeza = null;
        tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean esVacia() {
        return (cabeza == null);
    }

    public void apilar(T valor) {
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        tamanio++;
    }

    public void retirar() {
        if (!esVacia()) {
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }

    public T cima() {
        if (!esVacia()) {
            return cabeza.getValor();
        } else {
            return null;
        }
    }
}