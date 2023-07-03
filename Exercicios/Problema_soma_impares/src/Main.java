import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Problema "soma_impares" (adaptado de URI 1071)
		Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
		impares entre eles. 
		*/
		
		Scanner scan = new Scanner (System.in);
		
		int x, y, soma = 0;
		
		System.out.println("Escreva dois numeros:");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x > y) {
			int troca = x;
			x = y;
			y = troca;
		}
		
		for(int i = x + 1; i < y; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		scan.close();
	}

}
