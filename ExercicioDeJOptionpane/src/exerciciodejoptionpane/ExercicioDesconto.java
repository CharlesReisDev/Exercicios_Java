package exerciciodejoptionpane;

import javax.swing.JOptionPane;

public class ExercicioDesconto {
    
    public static void main(String[] args) {
        calculoDesconto();
    }
    
    public static void calculoDesconto(){;
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite preço do produto: "));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor da porcentagem: "));
        
        double valorDoDesconto = preco * (desconto / 100);
        
        JOptionPane.showMessageDialog(null, "Valor do desconto R$ " + valorDoDesconto + "\nValor total do produto com desconto R$ " + (preco - valorDoDesconto));
    }
    
}
