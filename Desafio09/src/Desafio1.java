import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� valor: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o 2� valor: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " � maior que " + num2);
		} else {
			System.out.println(num2 + " � maior que " + num1);
		}
	}

}
