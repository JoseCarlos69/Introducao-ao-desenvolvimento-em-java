import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Lados polígonos: ");
		double lad = sc.nextDouble();
		
		System.out.println("Medida dos lados (em cm): ");
		double medLad = sc.nextDouble();
		
		if (lad == 3) {
			System.out.println("TRIÂNGULO");
			
			System.out.println("Medida da base: ");
			double base = sc.nextDouble();
			
			System.out.println("Medida da altura: ");
			double alt = sc.nextDouble();
			
			System.out.println("A área do triângulo é " + (base * alt) / 2);
		} else if (lad == 4) {
			System.out.println("QUADRADO");
			
			System.out.println("A área do quadrado é " + (medLad * medLad));
		} else if (lad == 5) {
			System.out.println("PENTAGONO");
			
			System.out.println("Medida do apótema: ");
			double apot = sc.nextDouble();
			
			System.out.println("A área do pentagono é " + (medLad * apot) / 2);
		}
	}

}
