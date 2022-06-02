import java.util.Scanner;

public class DesafioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número de 1 a 10: ");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= 10; ++i) {
			System.out.println(i + " x " + numero + " = " + i * numero);
		}
	}

}
