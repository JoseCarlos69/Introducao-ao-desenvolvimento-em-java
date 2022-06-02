import java.util.Scanner;

public class DesafioP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA de " + a + " + " + b + " é " + soma);
		
	}

}