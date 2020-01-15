package introduccion.repaso;

public class Sumatoria {
	public static void main(String[] args) {
		int n = 5;
		
		int sumatoria = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sumatoria = sumatoria + i;
			}
		}
		System.out.println("La sumatoria de " + n + " es: " + sumatoria);
	}
}
