/*
Leia um vetor com 20 numeros inteiros. Escreva os elementos do vetor eliminando ele- ´
mentos repetidos.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 3;
        int numeros[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.println("Digite os elementos do vetor posição ["+i+"].");
            numeros[i] = scan.nextInt();
        }
        
        System.out.println("Vetor com elementos repitidos serão eliminados");
        for(int i = 0; i < cond; i++) {
            for(int j = 1 + i; j < cond; j++) {
                numeros[i] = 0;
            }
            if(numeros[i] != 0){
                System.out.println("Vetor ["+i+"] valor = "+numeros[i]);
            }else if(numeros[i] == 0) {
                System.out.println("Vetor ["+i+"] valor = Null");
            }
        }
        
        
    }
}
