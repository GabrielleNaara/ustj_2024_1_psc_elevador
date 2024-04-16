/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.elevador;

/**
 *
 * @author 824118152
 */
public class TelaElevador extends javax.swing.JFrame {
    private final Elevador elevador;

    /**
     * Creates new form semana7
     */
    public TelaElevador() {
        elevador = new Elevador();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ElevadorSubirBotao = new javax.swing.JButton();
        ElevadorDescerbotao = new javax.swing.JButton();
        EntrarGentebotao = new javax.swing.JButton();
        SubirPessoabotao = new javax.swing.JButton();
        DescerPessoabotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        QtdPessoasLabel = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        SentidoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ElevadorSubirBotao.setText("Subir");
        ElevadorSubirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevadorSubirBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(ElevadorSubirBotao);
        ElevadorSubirBotao.setBounds(122, 224, 72, 20);

        ElevadorDescerbotao.setText("Descer");
        ElevadorDescerbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevadorDescerbotaoActionPerformed(evt);
            }
        });
        getContentPane().add(ElevadorDescerbotao);
        ElevadorDescerbotao.setBounds(206, 224, 72, 23);

        EntrarGentebotao.setText("Entrar Gente...");
        getContentPane().add(EntrarGentebotao);
        EntrarGentebotao.setBounds(32, 265, 104, 23);

        SubirPessoabotao.setText("Subir Pessoa");
        getContentPane().add(SubirPessoabotao);
        SubirPessoabotao.setBounds(154, 265, 96, 23);

        DescerPessoabotao.setText("Descer Pessoa");
        getContentPane().add(DescerPessoabotao);
        DescerPessoabotao.setBounds(268, 265, 104, 23);

        jLabel1.setText("Quantidade de Pessoas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 15, 125, 16);

        QtdPessoasLabel.setText("0");
        getContentPane().add(QtdPessoasLabel);
        QtdPessoasLabel.setBounds(165, 15, 6, 16);

        JLabel2.setText("Sentido do Elevador:");
        getContentPane().add(JLabel2);
        JLabel2.setBounds(22, 37, 108, 16);

        SentidoLabel.setText("Subindo");
        getContentPane().add(SentidoLabel);
        SentidoLabel.setBounds(142, 37, 44, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElevadorSubirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevadorSubirBotaoActionPerformed
        // TODO add your handling code here:
        elevador.sobe();
        sentidoLabel.setText("Subindo");
    }//GEN-LAST:event_ElevadorSubirBotaoActionPerformed

    private void ElevadorDescerbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevadorDescerbotaoActionPerformed
        // TODO add your handling code here:
        elevador.desce();
        sentidoLabel.setText("descendo");
    }//GEN-LAST:event_ElevadorDescerbotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaElevador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DescerPessoabotao;
    private javax.swing.JButton ElevadorDescerbotao;
    private javax.swing.JButton ElevadorSubirBotao;
    private javax.swing.JButton EntrarGentebotao;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel QtdPessoasLabel;
    private javax.swing.JLabel SentidoLabel;
    private javax.swing.JButton SubirPessoabotao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private static class Elevador {

        public Elevador() {
        }

        private void desce() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void sobe() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
