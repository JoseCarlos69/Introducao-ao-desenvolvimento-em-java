import java.util.Scanner;

public class DesafioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 5, pos = 0, neg = 0, par = 0, im = 0;
		
		int v[] = new int[n];
		
		int i;
		for(i = 0; i < n; i++) {
			
			System.out.println("Digite o " + (v[i] = i + 1) + "� n�mero: ");
			int x = sc.nextInt();
			
			if(x > 0) {
				pos++;
			} else {
				if(x != 0) {
					neg++;
				}
			}
			
			if(x % 2 == 0) {
				par++;
			} else {
				im++;
			}
		}
		
		System.out.println("Quantidade de n�meros positivos: " + pos);
		System.out.println("Quantidade de n�meros negativos: " + neg);
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpare: " + im);
	}
}

