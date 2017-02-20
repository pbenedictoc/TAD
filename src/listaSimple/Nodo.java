package listaSimple;

public class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int a){
		this.dato=a;
		this.siguiente=null;
	}
	
	public int getDato(){
		return this.dato;
	}
	
	public void setDato(int a){
		this.dato=a;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}
	
	public void setSiguiente(Nodo a){
		this.siguiente=a;
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
	
	public boolean esIgual(Nodo n){
		return (this.dato==n.getDato())? true:false;
	}
}
