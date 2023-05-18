//Criar um programa que solicite ao usuário que informe o valor do raio de uma esfera e calcule o seu volume. 

package exerciciodejoptionpane;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio07 {
    public static void main(String[] args) {
        calculoVolume();
    }
    
    public static void calculoVolume(){
        DecimalFormat df = new DecimalFormat("##.00");
        
        double raio = 0;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do raio de uma esfera: "));
        
        double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        
        JOptionPane.showMessageDialog(null, "Valor do volume ficou: " + df.format(volume));
    }
        
}
