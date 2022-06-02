import java.util.Scanner;

public class DesafioC {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 int nota1, nota2 = 0;
		 
		 System.out.println("Digite a 1° nota: ");
		 nota1 = sc.nextInt();
		 
		 if(nota1 >= v[0] && nota1 <= v[10]) {
			 System.out.println("Digite a 2° nota: ");
			 nota2 = sc.nextInt();
			 
			 if((nota1 >= v[0] && nota1 <= v[10]) && (nota2 >= v[0] && nota2 <= v[10])) {
				 System.out.println("Média = " + ((nota1 + nota2) / 2));
			 } else {
				 System.out.println("A 2° nota está inválida");
			 }
			 } else {
				 System.out.println("A 1° nota está inválida");
		}
	}
}
