package trabalho;

public class exercicio3 {

	public static void main(String[] args) {
		int[][] matriz = new int [10][10];
		//j < 3 j > 6
		
		for(int linha = 0; linha < matriz.length ; linha ++ ) {	
			System.out.println("");
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(linha < 2 || linha > 7) {
					System.out.print("O ");
				}else if(coluna < 2 || coluna > 7 ) {
					System.out.print("O ");
				}else {
					System.out.print("- ");
				}
				
			}
		}

	}

}
