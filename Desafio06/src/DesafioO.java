import java.util.Scanner;

public class DesafioO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio: ");
		double raio = sc.nextInt();
		
		double pi = 3.14159;
		
		double calcArea = pi * (raio * raio);
		
		System.out.println("A área da circunferência é " + calcArea);
	}

}