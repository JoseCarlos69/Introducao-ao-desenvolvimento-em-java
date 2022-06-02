import java.util.Scanner;

public class DesafioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b;
		
		System.out.println("Digite um número: ");
		int a = sc.nextInt();

		if(a % 2 == 0) {
		b = a + 1;
		} else {
		b = a + 2;
		System.out.println(" X = " + a);
		}


		for(int i = 0; i < 6; i++) {
		System.out.println((i + 1)+ "°" + " = " + (b + i*2));
		}


		}

	}