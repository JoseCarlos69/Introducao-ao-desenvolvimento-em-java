import java.util.Scanner;

public class DesafioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o 1� n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o 2� n�mero: ");
		int num2 = sc.nextInt();
		
		int divNum = num1 / num2;
		
		System.out.println(num1 + " � " + num2 + " = " + divNum);
	}

}
