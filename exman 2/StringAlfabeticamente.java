
/**
 * Write a description of class StringAlfabeticamente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringAlfabeticamente
{
    NodoLista nodoRaiz;
    public StringAlfabeticamente(){
        nodoRaiz = null;
    }
    
    public void agregar(String valor) {
        NodoLista nodoIngresado = new NodoLista(valor);
        if (this.nodoRaiz == null) {
            this.nodoRaiz = nodoIngresado;
        } else {
            NodoLista actual = this.nodoRaiz;
            while (actual != null) {
                // Si el valor ya está en la lista, incrementar la frecuencia
                if (actual.getNombre().equals(valor)) {
                    actual.getFrecuencia();
                    return;
                }
                // Si no está, recorrer al siguiente nodo
                if (actual.nodoSiguiente == null) {
                    break;
                }
                actual = actual.nodoSiguiente;
            }
            // Crear un nuevo nodo al final de la lista
            NodoLista nuevoNodo = new NodoLista(valor);
            actual.nodoSiguiente = nuevoNodo;
        }
        // Ordenar la lista después de agregar un nuevo elemento
    }
    
    public void cortarFrecuencia(String valor) {
        NodoLista actual = this.nodoRaiz;
        while (actual != null) {
            if (actual.getNombre().equals(valor)) {
                if (actual.frecuencia > 1) {
                    actual.frecuencia--;
                } else {
                    // Si la frecuencia llega a 1, eliminar el nodo de la lista
                    eliminarNodo(valor);
                }
                return;
            }
            actual = actual.nodoSiguiente;
        }
        System.out.println("La cadena no está en la lista.");
    }

    private void eliminarNodo(String valor) {
        if (this.nodoRaiz == null) {
            return;
        }

        // Si el nodo a eliminar es el primero
        if (this.nodoRaiz.getNombre().equals(valor)) {
            this.nodoRaiz= this.nodoRaiz.getNodoSiguiente();
            return;
        }

        // Buscar el nodo a eliminar
        NodoLista actual = this.nodoRaiz;
        while (actual.getNodoSiguiente() != null) {
            if (actual.getNodoSiguiente().getNombre().equals(valor)) {
                actual.setNodoSiguiente(actual.getNodoSiguiente().getNodoSiguiente());
                return;
            }
            actual = actual.getNodoSiguiente();
        }
    }
    
    public int getFrecuencia(String valor) {
        NodoLista actual = this.nodoRaiz;
        while (actual != null) {
            if (actual.getNombre().equals(valor)) {
                return actual.frecuencia;
            }
            actual = actual.getNodoSiguiente();
        }
        return 0;  // Si no se encuentra el valor, la frecuencia es 0
    }
}