
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pedrapapeltesoura.PedraPapelTesoura;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author 927182
 */
public class MeuIniciar extends javax.swing.JFrame {

    /**
     * Creates new form MeuIniciar
     */
    public MeuIniciar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jbComboBox = new javax.swing.JButton();
        jbCalculadora = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbPedraPapelTesoura = new javax.swing.JButton();
        jbDesafio1 = new javax.swing.JButton();
        jbDesafio3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMFormularioCalculadora = new javax.swing.JMenuItem();
        jMFormularioComboBox = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbComboBox.setText("Formulario ComboBox");
        jbComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComboBoxActionPerformed(evt);
            }
        });

        jbCalculadora.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbCalculadora.setText("Formulario calculadora");
        jbCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculadoraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("MENU");

        jbPedraPapelTesoura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbPedraPapelTesoura.setText("Pedra, Papel e Tesoura");
        jbPedraPapelTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedraPapelTesouraActionPerformed(evt);
            }
        });

        jbDesafio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbDesafio1.setText("Formulario Desafio 1");
        jbDesafio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesafio1ActionPerformed(evt);
            }
        });

        jbDesafio3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbDesafio3.setText("Formulario Desafio 2");
        jbDesafio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesafio3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPedraPapelTesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbDesafio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbDesafio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jbCalculadora)
                .addGap(18, 18, 18)
                .addComponent(jbComboBox)
                .addGap(18, 18, 18)
                .addComponent(jbDesafio1)
                .addGap(18, 18, 18)
                .addComponent(jbDesafio3)
                .addGap(18, 18, 18)
                .addComponent(jbPedraPapelTesoura)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenu1.setText("Formularios");

        jMFormularioCalculadora.setText("Formulario Calculadora");
        jMFormularioCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioCalculadoraActionPerformed(evt);
            }
        });
        jMenu1.add(jMFormularioCalculadora);

        jMFormularioComboBox.setText("Formulario ComboBox");
        jMFormularioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioComboBoxActionPerformed(evt);
            }
        });
        jMenu1.add(jMFormularioComboBox);

        jMenuItem3.setText("Formulario Desafio1");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Formulario Desafio 2");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Pedra, Papel e Tesoura");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem1.setText("Informações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Meme");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComboBoxActionPerformed
        ExemploComboBox combo1 = new ExemploComboBox();
        combo1.setVisible(true);
    }//GEN-LAST:event_jbComboBoxActionPerformed

    private void jbCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalculadoraActionPerformed
        Calculadora calcu = new Calculadora();
        calcu.setVisible(true);
    }//GEN-LAST:event_jbCalculadoraActionPerformed

    private void jMFormularioCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioCalculadoraActionPerformed
        ExemploComboBox combo1 = new ExemploComboBox();
        combo1.setVisible(true);
    }//GEN-LAST:event_jMFormularioCalculadoraActionPerformed

    private void jMFormularioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioComboBoxActionPerformed
        Calculadora calcu = new Calculadora();
        calcu.setVisible(true);
    }//GEN-LAST:event_jMFormularioComboBoxActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Sistema criado pelo aluno Charles com professor Diego");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
     
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "WELCOME TO THE MATO");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jbPedraPapelTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedraPapelTesouraActionPerformed
        PedraPapelTesoura pedra1 = new PedraPapelTesoura();
        pedra1.setVisible(true);
    }//GEN-LAST:event_jbPedraPapelTesouraActionPerformed

    private void jbDesafio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesafio1ActionPerformed
        Desafio1 desa1 = new Desafio1();
        desa1.setVisible(true);
    }//GEN-LAST:event_jbDesafio1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Desafio1 desa1 = new Desafio1();
        desa1.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Desafio2 desa2 = new Desafio2();
        desa2.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jbDesafio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesafio3ActionPerformed
        Desafio2 desa2 = new Desafio2();
        desa2.setVisible(true);
    }//GEN-LAST:event_jbDesafio3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        PedraPapelTesoura pedra1 = new PedraPapelTesoura();
        pedra1.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MeuIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeuIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeuIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeuIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeuIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMFormularioCalculadora;
    private javax.swing.JMenuItem jMFormularioComboBox;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton jbCalculadora;
    private javax.swing.JButton jbComboBox;
    private javax.swing.JButton jbDesafio1;
    private javax.swing.JButton jbDesafio3;
    private javax.swing.JButton jbPedraPapelTesoura;
    // End of variables declaration//GEN-END:variables
}
