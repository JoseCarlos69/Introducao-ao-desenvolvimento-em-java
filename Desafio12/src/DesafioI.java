import java.util.Scanner;

public class DesafioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, somaPar = 0;
		char encerrar;
		
		do {
			
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero < 0) {
				break;
			}
			if(numero % 2 == 0) {
				somaPar += numero;
			}
			
			System.out.println("Deseja encerrar o programa?");
			encerrar = sc.next().charAt(0);
			
		} while(encerrar == 'N');
		
		System.out.println("Soma dos números pares: " + somaPar);
	}

}
