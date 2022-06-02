
public class DesafioC {

	public static void main(String args[]){
	    int matriz[][] = {{3, 5, 7}, {1, 2, 9}};
	     
	    System.out.println("Elementos da matriz: ");
	    System.out.println();
	    
	    for(int l = 0; l < matriz.length; l++){
	      for(int c = 0; c < matriz[0].length; c++){
	        System.out.print(matriz[l][c] + " ");
	      }
	      System.out.println();
	    }
	    
	    int linhas = matriz.length;
	    int colunas = matriz[0].length;
	    int transposta[][] = new int[colunas][linhas];
	    
	    for(int l = 0; l < matriz.length; l++){
	      for(int c = 0; c < matriz[0].length; c++){
	        transposta[c][l] = matriz[l][c];
	      }
	    }
	    
	    System.out.println();
	    System.out.println("Elementos da matriz transposta: ");
	    System.out.println();
	    
	    for(int l = 0; l < transposta.length; l++){
	      for(int c = 0; c < transposta[0].length; c++){
	        System.out.print(transposta[l][c] + " ");
	      }
	      System.out.println();
	    }
	  }
}
