public class DesafioD{
  public static void main(String[] args){
	  int mat1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	  int mat2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	  int mat3[][] = new int [3][3];
	  
	  int i, acumula;
	  
	  System.out.println("1° matriz");
	  System.out.println();
	  
	  for(int l = 0; l < mat1.length; l++){
		  for(int c = 0; c < mat1[0].length; c++){
			  System.out.print(mat1[l][c] + " ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println();
	  System.out.println("2° matriz");
	  System.out.println();
	  
	  for(int l = 0; l < mat2.length; l++){
		  for(int c = 0; c < mat2[0].length; c++){
			  System.out.print(mat2[l][c] + " ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println();
	  System.out.println("3° matriz");
	  
	  for(int l = 0; l < mat1.length; l++) {
		  for(int c = 0; c < mat2[0].length; c++) {
			  acumula = 0;
			  for(i = 0; i < mat1[0].length; i++) {
				  acumula = acumula + mat1[l][i] * mat2[i][c];
			  }
			  mat3[l][c] = acumula;
		  }
	  }
	  
	  System.out.println();
	  
	  for(int l = 0; l < mat3.length; l++){
		  for(int c = 0; c < mat3[0].length; c++){
			  System.out.print(mat3[l][c] + " ");
		  }
		  System.out.println();
	  }
	  
  }
}