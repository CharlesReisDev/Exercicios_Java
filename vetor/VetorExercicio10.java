/*
Fac¸a um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
e imprima a media geral.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 15;
        double soma = 0;
        
        double notas[] = new double[cond];
        
        for(int i = 0; i < cond; i++) {
            System.out.print("Digite "+(i+1)+"º nota: ");
            notas[i] = scan.nextDouble();
            soma = soma + notas[i];
        }
        
        double media = soma / cond;
        
        System.out.println("A media geral das notas foi: "+media);
        
    }
}
