
public class DesafioA {

	public static void main(String[] args) {
		int mat [][] = new int [10][15];
		int num = 101, soma, l, c;
		String parOuImpar = null;
		
		System.out.println("Matriz:");
		System.out.println();
		
		for(l = 0; l < 10; l++) {
			for(c = 0; c < 15; c++) {
				
				mat[l][c] = num ++;
				
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Soma de cada Linha:");
		System.out.println();
		
		for(l = 0; l < mat.length; l++) {
			soma = 0;
			for(c = 0; c < mat[l].length; c++) {
				soma += mat[l][c];
				
				if(soma % 2 == 0) {
					parOuImpar = "Par";
				} else {
					parOuImpar = "Ímpar";
				}
			}
			System.out.println("Soma da " + (l + 1) + "° linha: " + soma + " é " + parOuImpar);
		}
		
		System.out.println();
		System.out.println("Soma de cada Coluna:");
		System.out.println();
		
		for(c = 0; c < 15; c++) {
			soma = 0;
			for(l = 0; l < 10; l++) {
				soma += mat[l][c];
				
				if(soma % 2 == 0) {
					parOuImpar = "Par";
				} else {
					parOuImpar = "Ímpar";
				}
			}
			System.out.println("Soma da " + (c + 1) + "° coluna: " + soma + " é " + parOuImpar);
		}
	}

}
