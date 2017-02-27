package libreriaLista;

import miLibreria.entrada;

public class Ejercicio3 {
	public static void main(String[] args) {
		entrada entrada = new entrada();
		
		Libro[] libro = new Libro[6];
		for(int i=0;i<libro.length;i++){
			libro[i]=new Libro();
		}
		
		boolean loop=true;
		int eleccion;
		
		
					do{
						menu();
						eleccion = entrada.obtenerEntero("Elija una opción (1-8)");
						
						switch(eleccion){
						
						case 1:
							menuLibro(libro);
							eleccion = entrada.obtenerEntero("Elija una opción (1-6)");
							if(eleccion>=1 && eleccion<=6){
								String teclado = entrada.obtenerString("Dame el titulo para el libro eleccion:");
								libro[eleccion].setTitulo(teclado);
								teclado = entrada.obtenerString("Dame el autor para el libro "+libro[eleccion].getTitulo());
								libro[eleccion].setAutor(teclado);
								int tecladoN = entrada.obtenerEntero("Cuantos ejemplares hay para el libro "+libro[eleccion].getTitulo());
								libro[eleccion].setEjemplares(tecladoN);
							}else{
								System.out.println("No has seleccionado ningún libro, volviendo al menú principal...\n");
								entrada.obtenerString("Pulsa [Intro] para continuar");
							}
							break;
						
						case 2:
							
							break;
						
						case 3:
							
							break;
							
						case 4:
							
							break;
							
						case 5:
							
							break;
							
						case 6:
							
							break;
							
						case 7:
							
							break;
							
						case 8:
							//entrada.obtenerString("Pulsa [Intro] para continuar");
							menuLibro(libro);
							break;
							
							
						case 0:
							loop=false;
							break;
							
							
							
							
						
						
						
						}
					}while(loop==true);
	}
	
	//Metodos
	
	public static void menu(){
		clear();
		System.out.println("\tIntroducir Libro\n"
				+ "-------------------------------------\n"
				+ "1- Introducir libro\n"
				+ "2- Cambiar título de libro\n"
				+ "3- Cambiar autor de libro\n"
				+ "4- Cambiar cantidad de ejemplares\n"
				+ "5- Prestar libros\n"
				+ "6- Devolver libros\n"
				+ "7 Consultar libro\n"
				+ "8- Listar todos los libros\n"
				+ "-------------------------------------\n"
				+ "0- Salir\n"
				+ "-------------------------------------\n");
	}
	
	public static void menuLibro(Libro[] libro){
		clear();
		System.out.println("\tMenú de la biblioteca\n"
				+ "-----------------------------------------\n"
				+ "1- "+libro[0].getTitulo()+"\n"
				+ "2- "+libro[1].getTitulo()+"\n"
				+ "3- "+libro[2].getTitulo()+"\n"
				+ "4- "+libro[3].getTitulo()+"\n"
				+ "5- "+libro[4].getTitulo()+"\n"
				+ "6- "+libro[5].getTitulo()+"\n"
				+ "-----------------------------------------\n"
				+ "0- Salir"
				+ "Que libro quieres modificar?");
	}
	
	public static void clear(){
		//System.out.print("\033[H\033[2J");
		//System.out.flush();
		
		for(int i=0;i<100;i++){
			System.out.println("");
		}
	}
}
