import java.util.Scanner;

public class DesafioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, variavelControle = 1;
		
		System.out.println("Digite um número entre 12 e 20: ");
		
		while(variavelControle <= 7) {
			numero = sc.nextInt();
			
			if(numero >= 12 && numero <= 20) {
				System.out.println("Número digitado: " + numero);
				break;
			} else {
				System.out.println("Entrada inválida");
				System.out.println("Digite um número novamente: ");
				variavelControle++;
			}
		}
	}
}
