import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Problema "crescente" (adaptado de URI 1113)
		Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
		mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
		programa deve finalizar quando forem digitados dois valores iguais. */
		
		Scanner scan = new Scanner(System.in);
		
		int X, Y;
		
		System.out.println("Digite dois numeros:");
		X = scan.nextInt();
		Y = scan.nextInt();
		
		while(X != Y) {
			
			if(X < Y) {
				System.out.println("CRESCENTE!");
			}else {
				System.out.println("DECRESCENTE!");
			}
			System.out.println("Digite outros dois numeros:");
			X = scan.nextInt();
			Y = scan.nextInt();
			
		}
		scan.close();
	}

}
