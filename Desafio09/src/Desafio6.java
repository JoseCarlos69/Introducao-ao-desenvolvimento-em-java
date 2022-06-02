import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double alt = sc.nextDouble();
		
		System.out.println("Digite seu sexo, sendo 1 para Feminino e 2 para Masculino: ");
		int sexo = sc.nextInt();
		
		if (sexo == 1) {
			System.out.println("Seu peso ideal é " + ((62.1 * alt) - 44.7));
		} else if (sexo == 2){
			System.out.println("Seu peso ideal é " + ((72.7 * alt) - 58));
		}
	}
}
