import java.util.Scanner;

public class Desafio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		
		if(num % 10 == 0) {
			System.out.println("O número " + num + " é divisível por 10");
		} else if(num % 5 == 0) {
			System.out.println("O número " + num + " é divisível por 5");
		} else if(num % 2 == 0) {
			System.out.println("O número " + num + " é divisível por 2");
		} else {
			System.out.println("O número " + num + " não é divisível por 10, por 5 e por 2");
		}
		
	}

}
