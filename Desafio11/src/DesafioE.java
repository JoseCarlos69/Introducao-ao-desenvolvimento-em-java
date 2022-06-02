import java.util.Scanner;

public class DesafioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, par = 0, i;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				par = par + 1;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + (10-par));
	}

}