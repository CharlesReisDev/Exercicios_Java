/*
Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
*/
package vetor;

import java.util.Scanner;

public class VetorExercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 6;
        
        int valores[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º numero inteiro: ");
            valores[i] = scan.nextInt();
        }
        
        for(int i = 0; i < cond; i++) {
            System.out.println("Array ["+i+"] = "+valores[i]);
        }
        
    }
}
