/*
Fac¸a um programa que leia dez conjuntos de dois valores, o primeiro representando o
numero do aluno e o segundo representando a sua altura em metros. Encontre o aluno ´
mais baixo e o mais alto. Mostre o numero do aluno mais baixo e do mais alto, juntamente ´
com suas alturas.
 */
package vetor;

import java.util.Scanner;

public class VetorExercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 1, numeroalto = 0, numerobaixo = 0;
        double maior = 0, menor = 999999999;
        
        int numeroAluno[] = new int[cond];
        double alturas[] = new double[cond];
        
        System.out.println("Digite numero do aluno e informe sua altura:");
        for (int i = 0; i < cond; i++) {
            System.out.print("\nInforme número do "+(i+1)+"º aluno: ");
            numeroAluno[i] = scan.nextInt();
            System.out.print("Informe a altura do "+(i+1)+"º aluno em metros: ");
            alturas[i] = scan.nextDouble();
            if (alturas[i] > maior) {
                maior = alturas[i];
                numeroalto = numeroAluno[i];
            }if(alturas[i] < menor) {
                menor = alturas[i];
                numerobaixo = numeroAluno[i];
            }
        }
        
        System.out.println("Numero do aluno mais alto: "+numeroalto+"\nSua altura: "+maior);
        System.out.println("Numero do aluno mais baixo: "+numerobaixo+"\nSua altura: "+menor);
    }
}
