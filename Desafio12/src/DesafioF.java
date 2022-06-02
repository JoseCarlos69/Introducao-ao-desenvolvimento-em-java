import java.util.Scanner;

public class DesafioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char sexo = 0, sexoMenorSalario = 0;
		int idade = 0, maior = 0, menor = 200, idadeMenorSalario = 0, qtdMulheres = 0, qtdDeHabitantes = 0;
		double salario = 0, menorSalario = 9999, somaSalario = 0;
		
		while(idade >= 0) {
			System.out.println("Informe a idade do entevistado: ");
			idade = sc.nextInt();
			
			if(idade < 0) {
				break;
			}
			System.out.println("Sexo M ou F: ");
			sexo = sc.next().charAt(0);
			
			System.out.println("Informe o salário: ");
			salario = sc.nextDouble();
			
			if(sexo == 'F') {
				qtdMulheres = qtdMulheres + 1;
			}
			if(salario >= 0) {
				somaSalario = somaSalario + salario;
				qtdDeHabitantes = qtdDeHabitantes + 1;
			}
			if(idade > maior) {
				maior = idade;
			}
			if(idade < menor) {
				menor = idade;
			}
			if(salario < menorSalario) {
		         menorSalario = salario;
		         idadeMenorSalario = idade;
		         sexoMenorSalario = sexo;
			}
		}
		
		System.out.println("Media dos salários do grupo: R$" + somaSalario / qtdDeHabitantes);
		
		System.out.println("Menor idade: " + menor + " anos");
		
		System.out.println("Maior idade: " + maior + " anos");
		
		System.out.println("A quantidade de mulheres na região = " + qtdMulheres);
		
		System.out.println("A idade da pessoa e o sexo do que possui o menor salário, foi " + idadeMenorSalario + " anos, do sexo " + sexoMenorSalario);

	}

}

