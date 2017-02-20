package listaSimple;
//import miLibreria.entrada;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String z;
		/*entrada entrada = new entrada();
		char y='s', n='n',decision;
		int no, p;
		boolean loop=true;*/
		
		ListaSimple lista = new ListaSimple();
		
		
		lista.setInicio(new Nodo(1));
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.getInicio().setSiguiente(new Nodo(2));
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.getInicio().getSiguiente().setSiguiente(new Nodo(3));
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.getInicio().getSiguiente().getSiguiente().setSiguiente(new Nodo(4));
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.insertarInicio(new Nodo(0));
		
		lista.insertarFinal(new Nodo (6));
		
		/*while(loop=true){
			System.out.println(lista.toString());
			decision=entrada.obtenerChar("Quieres meter otro número? s/n");
			if(y==decision){
				p=entrada.obtenerEntero("Dime su posición:");
				no=entrada.obtenerEntero("Dime su valor: ");
				lista.insertarNodo(new Nodo(no), p);
			}else if(n==decision){
				loop=false;
			}
		}*/
		
		
		lista.insertarNodo(new Nodo(9), 1);
		lista.borrarInicio();
		//System.out.println(lista.toString());
		
		
		//System.out.println("Quieres borrar el último? s");
		//z=entrada.next();
			//if(z=="s"){
				//lista.borrarUltimo();
			//}
		
		lista.borrarNodo(2);
		
		
		
		System.out.println(lista.toString());
		

	}

}
