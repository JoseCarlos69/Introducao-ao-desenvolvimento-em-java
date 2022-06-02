import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base: ");
		double base = sc.nextInt();
		
		System.out.println("Altura: ");
		double altura = sc.nextInt();
		
		double area = base * altura;
		
		System.out.println("A área do retângulo de base " + base + " e altura " + altura + " é " + area);
	}

}
