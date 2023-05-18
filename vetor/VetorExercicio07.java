/*
Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima ´
o vetor, o maior elemento e a posic¸ao que ele se encontra.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        int maiorValor = 0;
        int contador = 0;
        
        int numeros[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º valor na posição ["+i+"]: ");
            numeros[i] = scan.nextInt();
            if(numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                contador += 1;
            }
        }
        
        System.out.println("Maior elemento foi "+maiorValor+" se encontra na posição ["+contador+"].");
        
    }
}
