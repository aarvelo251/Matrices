package Repaso;

public class Bidimensional {
	public static void main(String[] args) {
		
		int [][] ejemplo = new int [2][3];
		
		/**
		 * Este bloque de código es para llenar el arreglo
		 */
		
		System.out.println(ejemplo.length);
		
		for (int i =0; i < 2; i++ ){
		
		for (int j = 0; j < 3; j++){
			
			ejemplo[i][j] = (i * j);
		}
		}
		/**
		 * Este bloque de código es para imprimir el arreglo
		 */
		for (int i =0; i < 2; i++ ){
			
			for (int j = 0; j < 3; j++){
			 System.out.println( ejemplo [i][j] + "Este es el valor contenido en la posición " + i + "---" + j);
			}
		
	}
}
}

