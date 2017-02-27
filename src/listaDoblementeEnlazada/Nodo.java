package listaDoblementeEnlazada;

public class Nodo {
	private int dato;
	private Nodo derecha, izquierda;
	
	public Nodo(int a){
		dato=a;
		derecha=null;
		izquierda=null;
	}
//--------------------------------------------
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
	
	
}
