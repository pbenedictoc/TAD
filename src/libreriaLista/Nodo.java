package libreriaLista;

public class Nodo {
	private Libro dato;
	private Nodo siguiente;
	
	public Nodo(Libro a){
		this.dato=a;
		this.siguiente=null;
	}
	
	public Libro getDato(){
		return this.dato;
	}
	
	public void setDato(Libro a){
		this.dato=a;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}
	
	public void setSiguiente(Nodo a){
		this.siguiente=a;
	}
	
	public String toString(){
		return dato.toString();
	}
	
	public boolean esIgual(Nodo n){
		return (this.dato==n.getDato())? true:false;
	}
}
