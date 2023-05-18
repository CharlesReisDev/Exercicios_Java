//Criar um programa que leia o nome e a idade de três pessoas e exiba o nome da pessoa;
//mais velha

package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        pessoaMaisVelha();
    }
    
    public static void pessoaMaisVelha(){
        int idadeMaior = 0;
        String nomeVelho = "a";
        
        int qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantidade pessoas que ira ler: "));
        String nomes[] = new String[qtdPessoas];
        int idades[] = new int[qtdPessoas];
        
        for(int i = 0; i < qtdPessoas; i++){
            nomes[i] = JOptionPane.showInputDialog(null, "Qual é seu nome? ");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
            
            if(idades[i] > idadeMaior){
                idadeMaior = idades[i];
                nomeVelho = nomes[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Pessoa mais velha se chama: " + nomeVelho);
    }
}
