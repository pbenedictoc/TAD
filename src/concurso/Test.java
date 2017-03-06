package concurso;

import miLibreria.entrada;

public class Test {

	public static void main(String[] args) {
		entrada entrada = new entrada();
		
		Cola cola = new Cola();
		
		int min=0,c=0,caj;
		boolean loop=true;
		caj=entrada.obtenerEntero("¿Cuantas cajas hay?");
		
		int[] caja = new int[caj];
		int gente=entrada.obtenerEntero("¿Cuanta gente hay?");
		
		
		//Meter productos
		for(int a=0;a<gente;a++){
			cola.meter(new Nodo(entrada.obtenerEntero("¿Cuantos productos tiene la "+(a+1)+" persona?")));
		}
		
		//Calculo

			caja[c]=cola.sacar().getDato();
			min=caja[c];
			c++;
			for(int contador=1;contador<=caja.length;contador++){
				caja[c]=cola.sacar().getDato();
				if(min>=caja[c]){
					min=caja[c];
				}
				c++;
			}
			
			while(cola.getTamaño()!=0){
				c=0;
				loop=true;
				
				while(loop==true){
					if(caja[c]<=min){
						min=min+cola.sacar().getDato();
						caja[c]=min;
						loop=false;
					}
					c++;
				}
			}
		
		
		
		System.out.println("Tienes que entrar en la caja "+c);

	}

}
