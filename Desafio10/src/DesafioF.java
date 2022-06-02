import java.util.Scanner;

public class DesafioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		double numero = sc.nextDouble();
		
		int conta;
		
		if(numero > 0) {
			conta = 1;
		} else if(numero < 0) {
			conta = 2;
		} else {
			conta = 3;
		}
        
        switch(conta) {
        case 1:
			System.out.println("Positivo");
        break;
        case 2:
        	System.out.println("Negativo");
        break;
        case 3:
			System.out.println("Igual a zero");
        break;
        default:
        	System.out.println("ERRO");
        }
    }
}