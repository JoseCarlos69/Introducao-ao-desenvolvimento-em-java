import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("Informe a altura: "); 
		double altura = sc.nextDouble();
		
		System.out.println("Informe a largura: ");
		double largura = sc.nextDouble();
		
		System.out.println("A área é igual a: " + altura * largura);

	}
}
