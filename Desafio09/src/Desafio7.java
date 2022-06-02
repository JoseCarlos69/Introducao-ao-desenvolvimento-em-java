import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Lados pol�gonos: ");
		double lad = sc.nextDouble();
		
		System.out.println("Medida dos lados (em cm): ");
		double medLad = sc.nextDouble();
		
		if (lad == 3) {
			System.out.println("TRI�NGULO");
			
			System.out.println("Medida da base: ");
			double base = sc.nextDouble();
			
			System.out.println("Medida da altura: ");
			double alt = sc.nextDouble();
			
			System.out.println("A �rea do tri�ngulo � " + (base * alt) / 2);
		} else if (lad == 4) {
			System.out.println("QUADRADO");
			
			System.out.println("A �rea do quadrado � " + (medLad * medLad));
		} else if (lad == 5) {
			System.out.println("PENTAGONO");
			
			System.out.println("Medida do ap�tema: ");
			double apot = sc.nextDouble();
			
			System.out.println("A �rea do pentagono � " + (medLad * apot) / 2);
		}
	}

}
