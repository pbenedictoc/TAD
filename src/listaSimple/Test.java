package listaSimple;
import miLibreria.entrada;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Scanner entrada = new Scanner(System.in);
		entrada entrada = new entrada();
		String z;
		int ca, returned=0;
		
		
		ListaSimple lista=new ListaSimple();
		
		lista.insertarInicio(new Nodo (1));
		lista.insertarFinal(new Nodo (2));
		lista.insertarFinal(new Nodo (1));
		lista.insertarFinal(new Nodo (23));
		lista.insertarFinal(new Nodo (1));
		lista.insertarFinal(new Nodo (23));
		lista.insertarFinal(new Nodo (1));
		
			
		//System.out.println(lista.toString());
		
		
		System.out.println(lista.buscarTodos(new Nodo(23)));
		
		
		
		
		
		

	}

}
