package listaDoblementeEnlazada;


public class ListaDoblementeEnlazada {
		private Nodo cabeza, cola;
		private int tamaño;
		
		public ListaDoblementeEnlazada(){
			cabeza = null;
			cola = null;
			tamaño=0;
		}
		
		public void insertarInicio(Nodo n){
			if(tamaño==0){
				this.cabeza=n;
				this.cola=n;
				tamaño++;
			}else{
				n.setDerecha(this.cabeza);
				this.cabeza.setIzquierda(n);
				this.cabeza=n;
				tamaño++;
			}
		}
		
		public void insertarFinal(Nodo n){
			if(tamaño==0){
				this.cabeza=n;
				this.cola=n;
				tamaño++;
			}else{
				n.setIzquierda(this.cola);
				this.cola.setDerecha(n);
				this.cola=n;
				tamaño++;
			}
		}
		
		public void insertaNodo(Nodo n, int posicion){
			Nodo aux=this.cabeza, auxAnt=this.cabeza;
			int cont=0;
			
			if(posicion==0){
				insertarInicio(n);
			}else if(posicion==1){
				insertarInicio(n);
			}else if(posicion==tamaño){
				insertarFinal(n);
			}else{
				while(cont!=posicion-1){
					cont++;
					aux=aux.getDerecha();
					auxAnt=auxAnt.getDerecha();
				}
				auxAnt=auxAnt.getIzquierda();
				n.setDerecha(aux);
				n.setIzquierda(auxAnt);
				aux.setIzquierda(n);
				auxAnt.setDerecha(n);
				tamaño++;
				
			}
		}
		
//----------------------------------------------		
		public Nodo getCabeza() {
			return cabeza;
		}
		public void setCabeza(Nodo cabeza) {
			this.cabeza = cabeza;
		}
		public Nodo getCola() {
			return cola;
		}
		public void setCola(Nodo cola) {
			this.cola = cola;
		}
		public int getTamaño() {
			return tamaño;
		}
		public void setTamaño(int tamaño) {
			this.tamaño = tamaño;
		}
		
		public String toString(){
			String salida = "La lista contiene: \n";
			Nodo auxiliar = cabeza;
			
			while(auxiliar!=null){
				salida = salida + auxiliar.toString() + " ";
				auxiliar = auxiliar.getDerecha();
			}
			
			salida=salida+"\nLa lista contiene "+tamaño+" elementos, la cabeza es "+this.cabeza+" y la cola "+this.cola;
			
			
			return salida;
		}
		
	}
