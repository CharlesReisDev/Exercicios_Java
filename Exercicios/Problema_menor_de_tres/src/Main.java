import java.util.Scanner;

public class Main {
	/*Problema "menor_de_tres"
	Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
	números lidos. Em caso de empate, mostrar apenas uma vez. 
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a, b, c;
		
		System.out.print("Primeiro valor: ");
		a = scan.nextInt();
		System.out.print("Segundo valor: ");
		b = scan.nextInt();
		System.out.print("Terceiro valor: ");
		c = scan.nextInt();
		
		if(a < b && a < c) {
			System.out.println("MENOR = " + a);
		}else if(b < c) {
			System.out.println("MENOR = " + b);
		}else {
			System.out.println("MENOR = " + c);
		}
	}

}
