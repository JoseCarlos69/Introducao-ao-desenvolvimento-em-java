import java.util.Scanner;

public class DesafioR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a 1° nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Informe a 2° nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Informe a 3° nota: ");
		float nota3 = sc.nextFloat();
		
		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média do aluno é " + media);
		
	}

}