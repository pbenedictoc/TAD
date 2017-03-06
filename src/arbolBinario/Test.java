package arbolBinario;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArbolBinario arbol;
		Nodo a1, a2, a;
		PilaVector pila = new PilaVector();
		
		a1=ArbolBinario.nuevoArbol(null,"Maria",null);
		a2=ArbolBinario.nuevoArbol(null,"Rodrigo",null);
		a=ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
		pila.insertar(a);
		
		a1=ArbolBinario.nuevoArbol(null,"Anyora",null);
		a2=ArbolBinario.nuevoArbol(null,"Abel",null);
		a=ArbolBinario.nuevoArbol(a1,"M Jesus",a2);
		pila.insertar(a);
		
		a2=(Nodo)pila.quitar();
		a1=(Nodo)pila.quitar();
		a=ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
		arbol=new ArbolBinario(a);
		
		// Diferentes recorridos
		System.out.println("Recorrido PreOrden");
		preorden(arbol.raiz);
		System.out.println();
		System.out.println("Recorrido InOrden");
		inorden(arbol.raiz);
		System.out.println();
		System.out.println("Recorrido PostOrden");
		postorden(arbol.raiz);
		System.out.println();
	}

	public static void preorden(Nodo r) {
		if (r != null) {
			r.visitar();
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en inorden
	public static void inorden(Nodo r) {
		if (r != null) {
			inorden(r.subarbolIzdo());
			r.visitar();
			inorden(r.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en postorden
	public static void postorden(Nodo r) {
		if (r != null) {
			postorden(r.subarbolIzdo());
			postorden(r.subarbolDcho());
			r.visitar();
		}
	}

}