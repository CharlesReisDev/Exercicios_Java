/*
Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores ˆ
lidos na ordem inversa.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 6;
        int valores[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            do{
                System.out.print("Digite numero para posição ["+i+"]: ");
                valores[i] = scan.nextInt();
            }while(valores[i] % 2 != 0 );
        }
        
        for(int i = cond - 1; i >= 0; i--) {
            System.out.println("["+i+"] = "+valores[i]);
        }
        
    }
}
