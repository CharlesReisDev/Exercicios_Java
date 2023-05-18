/*
Fac¸a um programa que receba do usuario dois vetores, ´ A e B, com 10 numeros inteiros ´
cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados
do vetor C.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        int a[] = new int[cond];
        int b[] = new int[cond];
        int c[] = new int[cond];
        
        for (int i = 0; i < cond; i++) {
            System.out.print("Digite valor para vetor A["+i+"]: ");
            a[i] = scan.nextInt();
        }
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < cond; i++) {
            System.out.print("Digite valor para vetor B["+i+"]: ");
            b[i] = scan.nextInt();
            c[i] = a[i] + b[i];
        }
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado foram:");
        for (int i = 0; i < cond; i++) {
            System.out.println("Vetor C["+i+"] = "+c[i]);
        }
        
    }
}
