import java.util.Scanner;

public class DesafioB {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um número: ");
		 int num = sc.nextInt();
		 
		 int[] tab= new int[11];
		 
		 for(int i = 1; i<tab.length;i++){
			 tab[i] = i;
			 System.out.println(num + " x " + i +  " = " + (num * tab[i]));
		 }
	 }              
}
