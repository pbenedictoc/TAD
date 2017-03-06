package arbolBinario;

public class PilaVector {
	private static final int TAMAÑO_VECTOR=100;
	
	private Object[] pila;
	private int tamaño;
	
	public PilaVector(){
		tamaño=0;
		pila = new Nodo[TAMAÑO_VECTOR];
	}
	
	public void insertar(Nodo n){
		if(pila[this.tamaño]==null){
			pila[this.tamaño]=n;
		}else{
			this.tamaño++;
			pila[this.tamaño]=n;
		}
	}
	
	public Object quitar(){
		if(pila[this.tamaño]==null){
			return null;
		}else{
			if(this.tamaño==0){
				Object aux;
				aux=pila[0];
				pila[0]=null;
				return aux;
			}else{
				Object aux;
				aux=pila[this.tamaño];
				pila[this.tamaño]=null;
				this.tamaño--;
				return aux;
			}
		}
	}
	
	
}
