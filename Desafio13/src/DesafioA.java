import java.util.Scanner;

public class DesafioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de valores que vão ser lidos: ");
		int n = sc.nextInt();
		
		int v[] = new int[n];
		
		int i;
		for(i = 0; i < n; i++) {
			
			System.out.println("Digite o " + (v[i] = i + 1) + "° número: ");
			int x = sc.nextInt();
			
			if(x == 0) {
				System.out.println("NULO");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x % 2 == 0 && x < 0) { 
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			}
		}
	}

}
