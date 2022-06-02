import java.util.Scanner;

public class DesafioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Informe o valor de C: ");
		int c = sc.nextInt();
		
		System.out.println("Valores: " + a + ", " + b + ", " + c);
		
			if(a > b && a > c && b > c) {
				System.out.println("Ordem decrescente: " + a + ", " + b + ", " + c);
				System.out.println("Ordem crescente: " + c + ", " + b + ", " + a);
			} else if(a > b && a > c && c > b) {
				System.out.println("Ordem decrescente: " + a + ", " + c + ", " + b);
				System.out.println("Ordem crescente: " + b + ", " + c + ", " + a);
			} else if(b > a && b > c && a > c) {
				System.out.println("Ordem decrescente: " + b + ", " + a + ", " + c);
				System.out.println("Ordem crescente: " + c + ", " + a + ", " + b);
			} else if(b > a && b > c && c >  a) {
				System.out.println("Ordem decrescente: " + b + ", " + c + ", " + a);
				System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);
			} else if(c > a && c > b && a > b) {
				System.out.println("Ordem decrescente: " + c + ", " + a + ", " + b);
				System.out.println("Ordem crescente: " + b + ", " + a + ", " + c);
			} else if(c > a && c > b && b > a) {
				System.out.println("Ordem decrescente: " + c + ", " + b + ", " + a);
				System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
			}
	}

}
