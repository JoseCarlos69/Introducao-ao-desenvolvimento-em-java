import java.util.Scanner;

public class DesafioL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defina o salário de cada funcionário maior ou igual a R$ 2.000,00 reais");
		System.out.println("");
		
		System.out.println("Salário do 1° funcionário: ");
		int func1 = sc.nextInt();
		
		System.out.println("Salário do 2° funcionário: ");
		int func2 = sc.nextInt();
		
		System.out.println("Salário do 3° funcionário: ");
		int func3 = sc.nextInt();
		
		System.out.println("Salário do 4° funcionário: ");
		int func4 = sc.nextInt();
		
		System.out.println("Salário do 5° funcionário: ");
		int func5 = sc.nextInt();
		
		System.out.println("Salário do 6° funcionário: ");
		int func6 = sc.nextInt();
		
		System.out.println("Salário do 7° funcionário: ");
		int func7 = sc.nextInt();
		
		System.out.println("Salário do 8° funcionário: ");
		int func8 = sc.nextInt();
		
		System.out.println("Salário do 9° funcionário: ");
		int func9 = sc.nextInt();
		
		System.out.println("Salário do 10° funcionário: ");
		int func10 = sc.nextInt();
		
		System.out.println("Salário do 11° funcionário: ");
		int func11 = sc.nextInt();
		
		System.out.println("Salário do 12° funcionário: ");
		int func12 = sc.nextInt();
		
		System.out.println("Salário do 13° funcionário: ");
		int func13 = sc.nextInt();
		
		System.out.println("Salário do 14° funcionário: ");
		int func14 = sc.nextInt();
		
		System.out.println("Salário do 15° funcionário: ");
		int func15 = sc.nextInt();
		
		int mediaSalario = (func1 + func2 + func3 + func4 + func5 + func6 + func7 + func8 + func9 + func10 + func11 + func12 + func13 + func14 + func15) / 15;
		
		System.out.println("A média dos salários dos 15 funcionários é de R$ " + mediaSalario + ",00 reais");
		
	}

}