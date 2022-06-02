import java.util.Scanner;

public class DesafioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int [4][4];
		
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				System.out.println("Digite o número da matriz quadrada mat[" + l + "][" + c + "]");
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz: ");
		System.out.println();
		
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
	}

}
