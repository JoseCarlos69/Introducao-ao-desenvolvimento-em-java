import java.util.Scanner;

public class Desafio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int num = sc.nextInt();
		
		if(num % 10 == 0) {
			System.out.println("O n�mero " + num + " � divis�vel por 10");
		} else if(num % 5 == 0) {
			System.out.println("O n�mero " + num + " � divis�vel por 5");
		} else if(num % 2 == 0) {
			System.out.println("O n�mero " + num + " � divis�vel por 2");
		} else {
			System.out.println("O n�mero " + num + " n�o � divis�vel por 10, por 5 e por 2");
		}
		
	}

}
