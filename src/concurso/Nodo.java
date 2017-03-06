package concurso;

public class Nodo {
	
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int d){
		dato=d;
		siguiente=null;
	}
	
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public String toString() {
		return Integer.toString(dato);
	}

	
}
