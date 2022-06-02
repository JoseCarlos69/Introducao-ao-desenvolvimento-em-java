import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário do funcionário: ");
		double funcSalario = sc.nextInt();
		
		System.out.println("Digite o percentual de reajuste do salário: ");
		double perCenReaj = sc.nextInt();
		
		double salarioFinal = funcSalario + funcSalario * (perCenReaj/100);
		
		System.out.printf("O novo salário é de R$ " + salarioFinal);
	}

}
