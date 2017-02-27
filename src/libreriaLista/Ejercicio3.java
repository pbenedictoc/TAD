package libreriaLista;

import miLibreria.entrada;

public class Ejercicio3 {

	public static void main(String[] args) {
		int opcion;
		ListaSimple libros = new ListaSimple();
		entrada entrada = new entrada();
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarMenuPrincipal();
			opcion = entrada.obtenerEntero("Elija una opcion (1-6)");
			if (opcion > 8 || opcion < 0) {
				System.out.println("Opcion no valida!!!. \nDebe elegir una opcion entre 1 y 8.\n0 para salir");
				entrada.obtenerString("Pulse [Intro] para continuar");
			} else {
				switch (opcion) {
				case 1:
					introducirLibro(libros);
					break;
				case 2:
					cambiarTitulo(libros);
					break;
				case 3:
					cambiarAutor(libros);
					break;
				case 4:
					cambiarEjemplares(libros);
					break;
				case 5:
					prestarLibro(libros);
					break;
				case 6:
					devolverLibro(libros);
					break;
				case 7:
					listarLibro(libros);
					break;
				case 8:
					listarLibros(libros);
					break;
				case 0:
					salir = true;
					break;
				}
			}
			borrarPantalla();
		} while (!salir);
		System.out.println("That's all folks!!!. \nGood bye!!!");
	}

	public static void mostrarSubMenu(ListaSimple libros) {
		System.out.println("    Menu de la biblioteca    ");
		System.out.println("-----------------------------");
		int i = 1;
		Nodo auxiliar = libros.getInicio();
		while (auxiliar != null) {
			System.out.printf("%s- %s%n", (i), auxiliar.getLibro().getTitulo());
			auxiliar = auxiliar.getSiguiente();
			i++;
		}
		System.out.println("-----------------------------");
		System.out.println("0- Salir");
	}

	public static void mostrarMenuPrincipal() {
		System.out.println("      Introducir Libro       ");
		System.out.println("-----------------------------");
		System.out.println("1- Introducir libro");
		System.out.println("2- Cambiar titulo de libro");
		System.out.println("3- Cambiar autor de libro");
		System.out.println("4- Cambiar cantidad de ejemplares");
		System.out.println("5- Prestar libros");
		System.out.println("6- Devolver libros");
		System.out.println("7- Consultar libro");
		System.out.println("8- Listar todos los libros");
		System.out.println("-----------------------------");
		System.out.println("0- Salir");
		System.out.println("-----------------------------");
	}

	public static void borrarPantalla() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

	public static void introducirLibro(ListaSimple libros) {
		entrada entrada = new entrada();
		borrarPantalla();
		String titulo = entrada.obtenerString("Dame el titulo para el libro ");
		String autor = entrada.obtenerString("Dame el autor para el libro " + titulo);
		int ejemplares = entrada.obtenerEntero("Cuantos ejemplares hay para el libro " + titulo);
		libros.insertarFinal(new Nodo(new Libro(titulo, autor, ejemplares, 0)));
		entrada.obtenerString("Libro introducido correctamente. Pulse [Intro] para continuar");
	}

	public static void cambiarTitulo(ListaSimple libros) {
		entrada entrada = new entrada();
		int libroSeleccionado;
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quiere modificar ?");
			if (libroSeleccionado == 0)
				salir = true;
			else if (libroSeleccionado < 0 || libroSeleccionado > libros.getTamaño()) {
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.getTamaño()
						+ "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println("Libro seleccionado [" + libros.obtenerNodo(libroSeleccionado).getLibro().getTitulo() + "].");
				libros.obtenerNodo(libroSeleccionado).getLibro().setTitulo(entrada.obtenerString("Introduce el nuevo titulo para el libro seleccionado:"));
				entrada.obtenerString("Titulo del libro actualizado.\nPulsa [Intro] para continuar.");
			}
		} while (!salir);
	}

	public static void cambiarAutor(ListaSimple libros) {
		entrada entrada = new entrada();
		int libroSeleccionado;
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quiere modificar ?");
			if (libroSeleccionado == 0)
				salir = true;
			else if (libroSeleccionado < 0 || libroSeleccionado > libros.getTamaño()) {
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.getTamaño()
						+ "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println("Libro seleccionado [" + libros.obtenerNodo(libroSeleccionado).getLibro().getTitulo() + "].");
				libros.obtenerNodo(libroSeleccionado).getLibro().setAutor(entrada.obtenerString("Introduce el nuevo autor para el libro seleccionado:"));
				entrada.obtenerString("Autor del libro actualizado.\nPulsa [Intro] para continuar.");
			}
		} while (!salir);
	}

	public static void cambiarEjemplares(ListaSimple libros) {
		entrada entrada = new entrada();
		int libroSeleccionado;
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quiere modificar ?");
			if (libroSeleccionado == 0)
				salir = true;
			else if (libroSeleccionado < 0 || libroSeleccionado > libros.getTamaño()) {
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.getTamaño()
						+ "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println("Libro seleccionado [" + libros.obtenerNodo(libroSeleccionado).getLibro().getTitulo() + "].");
				libros.obtenerNodo(libroSeleccionado).getLibro().setTitulo(
						entrada.obtenerString("Introduce la cantidad de ejemplares para el libro seleccionado:"));
				entrada.obtenerString("Cantidad de ejemplares del libro actualizado.\nPulsa [Intro] para continuar.");
			}
		} while (!salir);
	}

	public static void prestarLibro(ListaSimple libros) {
		entrada entrada = new entrada();
		int libroSeleccionado;
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro se va a prestar ?");
			if (libroSeleccionado == 0)
				salir = true;
			else if (libroSeleccionado < 0 || libroSeleccionado > libros.getTamaño()) {
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.getTamaño()
						+ "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				if (libros.obtenerNodo(libroSeleccionado).getLibro().prestamo() == true)
					System.out.println("Libro prestado correctamente!.");
				else
					System.out.println("El libro no puede ser prestado. Consulte disponibilidad.");
				entrada.obtenerString("Pulsa [Intro] para continuar.");
			}
		} while (!salir);
	}

	public static void devolverLibro(ListaSimple libros) {
		entrada entrada = new entrada();
		int libroSeleccionado;
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro se va a devolver ?");
			if (libroSeleccionado == 0)
				salir = true;
			else if (libroSeleccionado < 0 || libroSeleccionado > libros.getTamaño()) {
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.getTamaño()
						+ "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				if (libros.obtenerNodo(libroSeleccionado).getLibro().devolucion() == true)
					System.out.println("Libro devuelto correctamente!.");
				else
					System.out.println("El libro no puede ser devuelto. Consulte si hay prestamos.");
				entrada.obtenerString("Pulsa [Intro] para continuar.");
			}
		} while (!salir);
	}

	public static void listarLibro(ListaSimple libros) {
		entrada entrada = new entrada();
		int libroSeleccionado;
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quieres consultar?");
			if (libroSeleccionado == 0)
				salir = true;
			else if (libroSeleccionado < 0 || libroSeleccionado > libros.getTamaño()) {
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.getTamaño()
						+ "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println(libros.obtenerNodo(libroSeleccionado).getLibro().toString());
				entrada.obtenerString("Pulsa [Intro] para continuar.");
			}
		} while (!salir);

	}

	public static void listarLibros(ListaSimple libros) {
		entrada entrada = new entrada();
		borrarPantalla();
		
		for (Nodo auxiliar = libros.getInicio();auxiliar!=null; auxiliar=auxiliar.getSiguiente()){ 
			System.out.println(auxiliar.getLibro().toString());
		}
		entrada.obtenerString("Pulsa [Intro] para continuar.");
	}
}