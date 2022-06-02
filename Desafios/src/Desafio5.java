import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();
		
		System.out.println("O antecessor de " + valor + " é " + (valor - 1));
		
	}

}
