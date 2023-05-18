//Criar um programa que solicite ao usuário que informe a sua data de nascimento (dia, mês e ano) e calcule a sua idade em anos completos

package exerciciodejoptionpane;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

public class Exercicio09 {
    public static void main(String[] args) {
        dataNascimento();
    }
    
    public static void dataNascimento(){

        String dataNascimento = JOptionPane.showInputDialog(null, "Digite sua data de nascimento (dd/mm/aaaa): ");

        LocalDate dataNasc = LocalDate.parse(dataNascimento, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNasc, dataAtual);

        int idade = periodo.getYears();
        
        JOptionPane.showMessageDialog(null, "Sua idade em anos completos é: " + idade  + " anos.");
    }
}

