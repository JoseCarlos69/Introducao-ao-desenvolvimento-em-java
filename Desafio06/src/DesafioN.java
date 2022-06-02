import java.util.Scanner;

public class DesafioN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int b = sc.nextInt();
		
		int x = a + b;
		
		System.out.println("A soma de A + B é = " + x);
	}

}