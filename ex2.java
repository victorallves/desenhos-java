
package trabalho;

public class exercicio2 {

	public static void main(String[] args) {
		int[][] matriz = new int [10][10];
		//j < 3 j > 6
		
		for(int i = 0; i < matriz.length ; i ++ ) {	
			System.out.println("");
			for(int j = 0; j < matriz.length; j++) {
				if((j > 2 && j < 7  ) && (i < 3 || i > 6)) {
					System.out.print("O ");
				}else {
					System.out.print("- ");
				}
				
			}
		}
				
	} 
	
}
