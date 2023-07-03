import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Problema "soma_vetor"
		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor */
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		int N;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = scan.nextInt();
		
		double[] vetor = new double[N];
		
		for(int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scan.nextDouble();		
		}
		
		System.out.println();
		System.out.print("Valores = ");
		for(int i = 0; i < N; i++) {
			System.out.print(String.format("%.1f ", vetor[i]));
			soma += vetor[i];
		}
		
		System.out.println();
		System.out.println("SOMA = " + String.format("%.1f", soma));
		
		double media = soma / N;
		
		System.out.println("MEDIA = " + media);
		
		scan.close();

	}

}
