package listaDoblementeEnlazada;

public class Test {

	public static void main(String[] args) {
		ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
		
		System.out.println("TEST");
		lista.insertarInicio(new Nodo(1));
		lista.insertarFinal(new Nodo(2));
		lista.insertarFinal(new Nodo(3));
		lista.insertarFinal(new Nodo(4));
		lista.insertarFinal(new Nodo(5));
		lista.insertarFinal(new Nodo(6));
		lista.insertarFinal(new Nodo(7));
		lista.insertarFinal(new Nodo(8));
		
		System.out.println(lista.toString());
		
		
		lista.insertaNodo(new Nodo(32), 2);
		
		System.out.println(lista.toString());

	}

}
