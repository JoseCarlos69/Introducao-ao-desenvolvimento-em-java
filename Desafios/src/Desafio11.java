import java.util.Scanner;

public class Desafio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N�mero de carros vendidos: ");
		double carVen = sc.nextInt();
		
		System.out.println("Sal�rio do funcion�rio: ");
		double funcSala = sc.nextInt();
		
		System.out.println("Comiss�o por cada carro vendido: ");
		double comiVen = sc.nextInt();
		
		System.out.println("Valor total das vendas efetuadas: ");
		double vendEfe = sc.nextInt();
		
		double salarioFinal = funcSala + ((comiVen/100 * carVen) * vendEfe) + 0.05 * vendEfe;
		
		System.out.println("O sal�rio total do funcion�rio � de R$ " + salarioFinal);
	}

}