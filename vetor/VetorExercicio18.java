/*
Fac¸a um programa que leia um vetor de 10 numeros. Leia um n ´ umero ´ x. Conte os
multiplos de um n ´ umero inteiro ´ x num vetor e mostre-os na tela.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10, xMultiplo = 0;
        double numeros[] = new double[cond];
        
        System.out.println("Digite um numero x, para contar multiplo dele: ");
        xMultiplo = scan.nextInt();
        
        System.out.println("Multiplo de "+xMultiplo+" é:");
        for (int i = 0; i < cond; i++) {
            numeros[i] = i * xMultiplo;
            System.out.println("Vetor ["+i+"] = "+numeros[i]);
        }
        
    }
}
