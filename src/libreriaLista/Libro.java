package libreriaLista;

public class Libro {
		private String titulo, autor;
		private int numeroEjemplares, prestados;
		
		public Libro(){
			titulo="";
			autor="";
			numeroEjemplares=0;
			prestados=0;
		}
		
		public Libro(String titulo, String autor, int ejemplares, int prestados){
			this.titulo=titulo;
			this.autor=autor;
			numeroEjemplares=ejemplares;
			this.prestados=prestados;
		}
		
		
	//Getters--------------------------------|
		public String getAutor(){
			return this.autor;
		}
		
		public String getTitulo(){
			return this.titulo;
		}
		
		public int getEjemplares(){
			return this.numeroEjemplares;
		}
		
		public int getPrestados(){
			return this.prestados;
		}
	//----------------------------------------|
		
		
		
	//Setters---------------------------------|	
		public void setAutor(String autor){
			this.autor=autor;
		}
		
		public void setTitulo(String titulo){
			this.titulo=titulo;
		}
		
		public void setEjemplares(int ejemplares){
			numeroEjemplares=ejemplares;
		}
		
		public void setprestados(int prestados){
			this.prestados=prestados;
		}
	//-----------------------------------------|
	
	//Interacciones----------------------------|
		public boolean prestamo(){
			if(this.prestados<this.numeroEjemplares){
				this.prestados++;
				return true;
			}else{
				return false;
			}
		}
		
		
		public boolean devolucion(){
			if(this.prestados>0){
				prestados--;
				return true;
			}else{
				return false;
			}
		}
		
		
		public String toString(){
			return "Título: "+this.titulo+
					"%nAutor:"+this.autor+
					"%Disponibles: "+this.numeroEjemplares+
					"%Prestados: "+this.prestados;
		}
}
