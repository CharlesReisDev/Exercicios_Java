/*
Fazer um programa para ler 5 valores e, em seguida, mostrar a posic¸ao onde se encon- ˜
tram o maior e o menor valor.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 5;
        int valores[] = new int[cond];
        int maior = 0;
        int menor = 999999999;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º valor: ");
            valores[i] = scan.nextInt();
            if(valores[i] > maior) {
                maior = valores[i];
                posicaoMaior += 1;
            }
            if(valores[i] < menor) {
                menor = valores[i];
                posicaoMenor += 1;
            }
        }
        
        System.out.println("Maior se encontra na posição ["+posicaoMaior+"] = "+maior);
        System.out.println("Menor se encontra na posição ["+posicaoMenor+"] = "+menor);
        
    }
}
