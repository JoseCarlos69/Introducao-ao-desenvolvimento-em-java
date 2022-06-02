import java.util.Scanner;

public class DesafioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, fazParte = 0, naoFazParte = 0, i;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				fazParte = fazParte + 1;
			} else {
				naoFazParte = naoFazParte + 1;
			}
		}
		System.out.println("Faz parte do intervalo [10, 20]: " + fazParte);
		System.out.println("Não faz parte do intervalo [10, 20]: " + naoFazParte);
	}

}