import java.util.Scanner;

public class DesafioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da matriz quadrada: ");
		int quad = sc.nextInt();
		
		System.out.println();
		System.out.println("Matriz: ");
		System.out.println();
		
		int num = 101;
		int mat[][] = new int [quad][quad];
		int vet[] = new int [quad];
		
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = num ++;
				
				if(l == c) {
					mat [l][c] = 100;
					System.out.print(mat[l][c] + " ");
					vet[c] = mat[l][c];
				} else {
					System.out.print(mat[l][c] + " ");

				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Posição do Vetor: ");
		System.out.println();
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

}
