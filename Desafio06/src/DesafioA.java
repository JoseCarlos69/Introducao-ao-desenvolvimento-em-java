import java.util.Scanner;

public class DesafioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o 1� n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o 2� n�mero: ");
		int num2 = sc.nextInt();
		
		int multiNum = num1 * num2;
		
		System.out.println(num1 + " x " + num2 + " = " + multiNum);
	}

}
