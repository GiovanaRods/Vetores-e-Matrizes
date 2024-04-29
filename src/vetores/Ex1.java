package vetores;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 *  Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
		 *  construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 *  irá digitar um número e o programa deve exibir na tela a posição deste número 
		 *  no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” 
		 *  deve ser exibida na tela
		 */
		
		int numeros[] = new int [10];
		int numeroDescobrir;
		int indice;
		Scanner leia = new Scanner (System.in);
		
		for (int contador = 0; contador < numeros.length; contador++){
			System.out.printf("Digite o %dº numero: ", contador+1);
			numeros[contador] = leia.nextInt();
		}
		
		System.out.printf("Digite um numero que você deseja encontrar: ");
		numeroDescobrir = leia.nextInt();
		
		indice = -1;
		for (int contador = 0; contador < numeros.length; contador++){
			
			
			if (numeros[contador] == numeroDescobrir){
			indice = contador;		
			}
					
	}
		if (indice != -1) {
			System.out.println("O número " + numeroDescobrir +" está localizado na posição: "+indice);
			
		} else {
			System.out.printf("O número %d não foi encontrado!", numeroDescobrir);
		}
	}
	
}
