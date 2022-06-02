import java.util.Scanner;

public class DesafioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1° nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("2° nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("3° nota: ");
		int nota3 = sc.nextInt();
		
		System.out.println("4° nota: ");
		int nota4 = sc.nextInt();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		int numero;
		
		if(media >= 7) {
			numero = 1;
		} else if(media >= 5 && media < 7) {
			numero = 2;
		} else {
			numero = 3;
		}

		switch(numero) {
		case 1:
			System.out.println("ALUNO APROVADO");
		break;
		case 2:
			System.out.println("ALUNO DE EXAME FINAL");
		break;
		case 3:
			System.out.println("ALUNO REPROVADO");
		break;
		default:
			System.out.println("ERRO");
		}
	}

}
