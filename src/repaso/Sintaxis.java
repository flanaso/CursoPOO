package repaso;

public class Sintaxis {
	public static void main(String[] args) {
		// Variables
		
		int edadJose = 18;
		int edadLuis = 21;
		
		//Operador ternario
		int mayor = edadLuis > edadJose || 5 > 3 ? 2 : 1;
		if (edadLuis > edadJose) {
			System.out.println("Luis es mayor");
		} else {
			System.out.println("Jose es mayor");
		}
		
		
		// For
		for (int i = 1; i <= 10; i--) {
			
		}
		
		int[][] enteros = new int[3][3];
		
		enteros[0][0] = 10;
		enteros[0][1] = 20;
		enteros[0][2] = 30;
		enteros[1][0] = 40;
		enteros[1][1] = 50;
		enteros[1][2] = 50;
		enteros[2][0] = 50;
		enteros[2][1] = 50;
		enteros[2][2] = 50;
		
		for (int j = 0; j < enteros.length; j++) {
			System.out.println("La posición " + j);
			System.out.println(enteros[j]);
		}
		
		/*for (int entero : enteros) {
			System.out.println(entero);
		}*/
		
	}
}
