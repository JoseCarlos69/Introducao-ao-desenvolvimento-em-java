import java.util.Scanner;

public class DesafioM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tabuada quer usar? ");
		int tabuada = sc.nextInt();
		
		for(int i = 1; i <= 10; ++i) {
			System.out.println(i + " x " + tabuada + " = " + i * tabuada);
		}
	}

}
