//Criar um programa que leia a nota de três alunos em uma disciplina e exiba a ;
//média aritmética das notas e a situação de cada aluno (aprovado, 
//reprovado ou em recuperação). A média mínima para aprovação é 7 pontos. Se a 
//média for menor que 5 pontos, o aluno é reprovado. Se a média estiver entre 5 
//e 7 pontos, o aluno está em recuperação. 

package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        mediaAluno();
    }
    
    public static void mediaAluno(){
        int cont = 3;
        double notasAlunos[] = new double[cont];
        double soma = 0;
        
        for(int i = 0; i < cont; i++){
            notasAlunos[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite á sua " + (i+1) + "ª nota: "));
            soma +=  notasAlunos[i];
        }
        
        double mediaNotas = soma / cont; 
       
        JOptionPane.showMessageDialog(null, "Media das notas -> " + Math.round(mediaNotas));
        
        if(Math.round(mediaNotas) >= 7.0){
            JOptionPane.showMessageDialog(null, "Todos os alunos foram aprovados.");
        }else if(Math.round(mediaNotas) > 4.9 && mediaNotas <= 7.0){
            JOptionPane.showMessageDialog(null, "Todos os alunos de recuperação.");
        }else{
            JOptionPane.showMessageDialog(null, "Todos os alunos reprovados.");
        }
        
        
        
        
        
            
    }
}
