import java.util.Scanner;

public class DesafioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("A metade de "+ num + " é " + num / 2);
		System.out.println("O quadrado de " + num + " é " + num * num);
	}

}
