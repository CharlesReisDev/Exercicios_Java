import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Problema "diagonal_negativos"
		Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
		contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
		negativos da matriz. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N, cont;
		
		System.out.print("Qual a ordem da matriz? ");
		N = scan.nextInt();
		
		int[][] matriz = new int[N][N];
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i = 0; i < N; i++) {
			System.out.println(matriz[i][i]+ " ");
		}
		
		cont = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++) {
				if(matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("QUANTIDADE DE NEGATIVOS = "+cont);
		
		scan.close();
	}

}
