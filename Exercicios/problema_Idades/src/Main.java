import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Problema "idades"
		Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
		nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		name1 = sc.nextLine();
		System.out.print("idade: ");
		age1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		name2 = sc.nextLine();
		System.out.print("idade: ");
		age2 = sc.nextInt();
		
		double media = ((double)age1 + age2) / 2;
		
		
		System.out.println("A idade média de " + name1 + " e " + name2 + " é de " + String.format("%.1f", media) + " anos");
		

	}

}
