import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ma��s compradas: ");
		int macas = sc.nextInt();
		
		if (macas < 12 ) {
			System.out.println("O valor da compra � R$ " + (macas * 0.30) + " reais");
		} else {
			System.out.println("O valor da compra � R$ " + (macas * 0.25) + " reais");
		}
	}

}
