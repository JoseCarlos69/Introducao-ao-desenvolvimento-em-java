import java.util.Scanner;

public class DesafioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva true ou false: ");
		boolean info1 = sc.nextBoolean();
		
		System.out.println("Escreva true ou false: ");
		boolean info2 = sc.nextBoolean();
		
		if (info1 && info2 == true) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
	}

}