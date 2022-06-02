import java.util.Scanner;

public class DesafioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int atual, anterior, resto;
		
		System.out.println("Digite n: ");
		int n = sc.nextInt();
		
		System.out.println("Digite m: ");
		int m = sc.nextInt();
		
		anterior = n;
		atual = m;
		
		resto = atual % anterior;
		
		while(resto != 0) {
			resto = anterior % atual;
			anterior = atual;
			atual = resto;
		}
		System.out.println("mdc(" + n + "," + m + ") = " + anterior);

	}

}