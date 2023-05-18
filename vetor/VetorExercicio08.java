/*
Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos ˆ
na ordem inversa
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 6;
        int valores [] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite valor para posição ["+i+"]: ");
            valores[i] = scan.nextInt();
        }
        
        System.out.println("Valores lidos na ordem inversa:");
        for(int i = cond - 1; i >= 0; i--) {
            System.out.println(valores[i]+" posição ["+i+"].");
        }
        
    }
}
