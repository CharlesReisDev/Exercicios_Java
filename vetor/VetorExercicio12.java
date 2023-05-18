/*
Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
juntamente com o maior, o menor e a media dos valores.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 5;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        double soma = 0;
        double maior = 0;
        double menor = 999999999;
        
        double valores[] = new double[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º valor: ");
            valores[i] = scan.nextDouble();
            
            soma += valores[i];
            
            if(valores[i] > maior) {
                maior = valores[i];
                posicaoMaior += 1;
            }
            if(valores[i] < menor) {
                menor = valores[i];
                posicaoMenor += 1;
            }
        }
        
        double media = soma / cond;
        
        System.out.println("Maior valor lido foi: "+maior+" na posição ["+posicaoMaior+"].");
        System.out.println("Menor valor lido foi: "+menor+" na posição ["+posicaoMenor+"].");
        System.out.println("Media entre todos os valores é: "+media);
        
        
    }
}
