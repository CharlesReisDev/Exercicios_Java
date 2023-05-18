/*
Fac¸a um programa que leia um vetor de 8 posic¸oes e, em seguida, leia tamb ˜ em dois va-
lores X e Y quaisquer correspondentes a duas posic¸oes no vetor. Ao final seu programa ˜
devera escrever a soma dos valores encontrados nas respectivas posic¸ ´ oes ˜ X e Y .

 */
package vetor;

import java.util.Scanner;

public class VetorExercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 8, x = 0, y = 0;
        double sum = 0;
       
        double array[] = new double[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Posição ["+i+"], digite um numero: ");
            array[i] = scan.nextDouble();
        }
        
        System.out.println("Digite 2 posiçoes X e Y tipo inteiro que vai de 0 a 7:");
        do{
            x = scan.nextInt(); y = scan.nextInt();
            if(x > (cond -1) && y > (cond - 1)) {
                System.out.println("Valores de X e Y excedeu valor maximo, tente novamente.");
            }else if(x > (cond - 1)) {
                System.out.println("Valor de X excedeu valor maximo, tente novamente:");
            }else if(y > (cond - 1)) {
                System.out.println("Valor de Y excedeu valor maximo, tente novamente:");
            }
        }while(x > (cond - 1) || y > (cond - 1));
        
        sum = array[x] + array[y];
        
        System.out.println("A soma das posição X ["+x+"] e a posição Y ["+y+"] = "+sum);
    }
}
