package testedetela;

import javax.swing.JOptionPane;

public class TesteDeTela {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Entre com seu lindo(a) nome:");
        
        JOptionPane.showMessageDialog(null, name);
    }
    
}
