import java.util.Scanner;

public class DesafioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		int valor2 = sc.nextInt();
		
		System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2));

	}

}
