package libreriaLista;

public class ListaSimple {
	private Nodo inicio;
	private int tamaño;
	
	public ListaSimple(){
		inicio=null;
		tamaño=0;
	}
	
	public Nodo getInicio(){
		return this.inicio;
	}
	
	public void setInicio(Nodo a){
		this.inicio=a;
	}
	
	public int getTamaño(){
		return this.tamaño;
	}
	
	public void setTamaño(int a){
		this.tamaño=a;
	}
	
	public String toString(){
		String salida = "La biblioteca tiene: \n";
		Nodo auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + "\n";
			auxiliar = auxiliar.getSiguiente();
		}
		
		salida=salida+"\nNúmero de libros: "+tamaño;
		
		
		return salida;
	}
	
	public void insertarInicio(Nodo n){
		n.setSiguiente(this.inicio);
		this.inicio=n;
		tamaño++;
	}
	
	public void insertarFinal(Nodo nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			Nodo aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamaño++;
		}
	}
	
	public boolean insertarNodo(Nodo n, int posicion){
		int i=0;
		Nodo auxiliar = this.inicio;
		
		if(this.tamaño<posicion || posicion<0) return false;
		
		if(this.tamaño==posicion){
			insertarFinal(n);
			return true;
		}
		
		if(posicion==0){
			insertarInicio(n);
			return true;
		}else{
		
			while(i<(posicion-1)){
				auxiliar=auxiliar.getSiguiente();
				i++;
			}
		
			n.setSiguiente(auxiliar.getSiguiente());
			auxiliar.setSiguiente(n);
			this.tamaño++;
		
			return true;
		}
	}
	
	public boolean borrarInicio(){
		if(inicio==null) return false;
		
		Nodo auxiliar = this.inicio;
		if(auxiliar.getSiguiente()==null) return false;
		setInicio(auxiliar.getSiguiente());
		tamaño--;
		return true;
	}
	
	public boolean borrarUltimo(){
		if(inicio==null) return false;
		
		int cont=0,cont2=0;
		Nodo auxiliar = this.inicio;
		while(auxiliar.getSiguiente()!=null){
			cont++;
			auxiliar=auxiliar.getSiguiente();
		}
		if(cont-1==1){
			borrarInicio();
			return true;
		}
		auxiliar = this.inicio;
		while(cont2!=cont-1){
			cont2++;
			auxiliar=auxiliar.getSiguiente();
		}
		
		auxiliar.setSiguiente(null);
		this.tamaño=this.tamaño-1;
		return true;
	}
	
	public boolean borrarNodo(int posicion){
		if(inicio==null) return false;
		
		int i=0;
		Nodo auxiliar = this.inicio, n=this.inicio;
		
		if(this.tamaño<posicion || posicion<0) return false;
		
		if((this.tamaño-1)==posicion){
			borrarUltimo();
			return true;
		}
		
		if(posicion==0){
			borrarInicio();
			return true;
		}
		
		do{
			auxiliar=auxiliar.getSiguiente();
			i++;
		}while(i<(posicion-1));
		i=0;
		do{
			n=n.getSiguiente();
			i++;
		}while(i!=(posicion+1));
			
		
			
		auxiliar.setSiguiente(n);
		this.tamaño--;
		
		return true;	
	}
	
	public int buscar(Nodo n){
		int posicion = 0;
		boolean encontrado = false;
		Nodo aux = inicio;
		while(aux!=null & !encontrado){
			if(aux.esIgual(n)){
				encontrado=true;
				return posicion;
			}else{
				aux = aux.getSiguiente();
				posicion++;
			}
		}
		if(encontrado)
			return posicion;
		else
			return -1;
	}
	
	public Nodo obtenerNodo(int posicion){
		Nodo auxiliar=inicio;
		posicion--;
		
		while(posicion>0){
			auxiliar=auxiliar.getSiguiente();
			posicion--;
		}
		return auxiliar;
	}
}
