package concurso;

public class Cola {
	private Nodo inicio, finall;
	private int tamaño;
	
	public Cola(){
		this.inicio=null;
		this.finall=null;
		this.tamaño=0;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public Nodo sacar(){
		Nodo aux=inicio;
		if(inicio!=null){
			inicio=inicio.getSiguiente();
			tamaño--;
			return aux;
		}
		return null;
	}
	
	public void meter(Nodo n){
		if(finall==null){
			inicio=n;
			finall=n;
		}else{
			finall.setSiguiente(n);
			finall=n;
		}
		tamaño++;
	}
	
	public Nodo getInicio(){
		return inicio;
	}
	
	public Nodo getFinal(){
		return finall;
	}
	
	public String toString(){
		Nodo aux=inicio;
		String salida="La cola contiene:\n";
		while(aux!=null){
			salida=salida+aux.toString()+" ";
			aux=aux.getSiguiente();
		}
		return salida+"\n\nTamaño = "+this.tamaño+"\n";
	}
	
}
