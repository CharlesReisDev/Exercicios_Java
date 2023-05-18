/*
Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        int contadorPar = 0;
        
        int array[] = new int[cond];
        int pares[] = new int[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º numero: ");
            array[i] = scan.nextInt();
            if(array[i] % 2 == 0 ) {
                pares[i] = array[i];
                contadorPar += 1;
            }
        }
        
        System.out.println("Você digitou "+contadorPar+" valores pares sendo eles: ");
        for(int i = 0; i < cond; i++){
            if(pares[i] > 0) {
                System.out.print(pares[i]+" ");
            }
            
        }
    }
}
