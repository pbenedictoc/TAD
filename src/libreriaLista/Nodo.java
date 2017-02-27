package libreriaLista;

public class Nodo {
	private Libro libro;
	private Nodo siguiente;
	
	public Nodo(Libro a){
		this.libro=a;
		this.siguiente=null;
	}
	
	public Libro getLibro(){
		return this.libro;
	}
	
	public void setLibro(Libro a){
		this.libro=a;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}
	
	public void setSiguiente(Nodo a){
		this.siguiente=a;
	}
	
	public String toString(){
		return libro.toString();
	}
	
	public boolean esIgual(Nodo n){
		return (this.libro==n.getLibro())? true:false;
	}
}
