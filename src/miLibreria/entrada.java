package miLibreria;

import java.util.Scanner;

public class entrada {
	Scanner entrada = new Scanner(System.in);

	public int obtenerEntero(String msg) {
		int numero = 0;
		boolean loop = true;
		String introducido;

		do {
			try {
				System.out.println(msg);
				introducido = entrada.nextLine();
				numero = Integer.parseInt(introducido);
				loop = false;
			} catch (Exception e) {
				System.out.println("Tienes que introducir un número entero");
				entrada.next();
			}
		} while (loop == true);
		return numero;
	}

	public float obtenerFloat(String msg) {
		float numero = 0;
		boolean loop = true;

		do {
			try {
				System.out.println(msg);
				numero = entrada.nextFloat();
				loop = false;

			} catch (Exception e) {
				System.out.println("Tienes que introducir un número con decinales.");
				entrada.next();
			}
		} while (loop == true);
		return numero;
	}
	
	public String obtenerString(String msg){
		String a = null;
		boolean loop=true;
		
		do{
			try{
				System.out.println(msg);
				a=entrada.nextLine();
				loop=false;
			}catch(Exception e){
				System.out.println("Escribe un String.");
				entrada.next();
			}
		}while(loop==true);
		return a;
	}
	
	public char obtenerChar(String msg){
		boolean loop=true;
		char a = 0;
		
		do{
			try{
				System.out.println(msg);
				a=entrada.next().charAt(0);
				loop=false;
			}catch(Exception e){
				System.out.println("Tienes que introducir un char.");
				entrada.next();
			}
			
		}while(loop==true);
		return a;
	}
}
