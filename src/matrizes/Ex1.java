package matrizes;

public class Ex1 {

	public static void main(String[] args) {
	
		int numeros[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		for(int indiceLinha = 0; indiceLinha < numeros.length; indiceLinha++) {
			
			for(int indiceColuna = 0; indiceColuna < numeros.length; indiceColuna++) {
				
				System.out.print(numeros[indiceLinha][indiceColuna]);	
			}
			
			System.out.println();
		}
		
		System.out.println("Elementos da Diagonal Principal:");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print(numeros[contador][contador] + " ");
            somaDiagonalPrincipal += numeros[contador][contador];
        }
        System.out.println("\nSoma de todos os elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		
        System.out.println("Elementos da Diagonal Secundária:");
        for (int contador = 0; contador < 3; contador++) {
            System.out.print(numeros[contador][2 - contador] + " ");
            somaDiagonalSecundaria += numeros[contador][2 - contador];
        }
        System.out.println("\nSoma de todos os elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	}

}