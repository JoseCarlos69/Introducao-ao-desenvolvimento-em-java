import java.util.Scanner;

public class DesafioQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a 1° nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Informe a 2° nota: ");
		float nota2 = sc.nextFloat();
		
		double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
		
		System.out.println("A média do aluno é " + media);
		
	}

}