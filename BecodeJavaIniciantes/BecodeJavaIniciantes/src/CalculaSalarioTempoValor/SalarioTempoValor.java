/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaSalarioTempoValor;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano.t.da.silva
 */
public class SalarioTempoValor extends javax.swing.JFrame {

    /**
     * Creates new form SalarioTempoValor
     */
    public SalarioTempoValor() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtSalario = new javax.swing.JTextField();
        BtnCalculaSalario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtTempo = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Salário:");

        TxtSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalarioActionPerformed(evt);
            }
        });

        BtnCalculaSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCalculaSalario.setText("Calcula Salário");
        BtnCalculaSalario.setToolTipText("");
        BtnCalculaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalculaSalarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Salário MENOR que 100 e Tempo MAIOR que 5 anos!!!");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tempo de Empresa (Anos):");

        TxtTempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(BtnCalculaSalario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)
                            .addComponent(TxtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TxtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(BtnCalculaSalario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalculaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalculaSalarioActionPerformed
        // TODO add your handling code here:
        
        // Verifica o valor recebido no campo salário
        
        double Salario;
        double Bonus;
        double Total;
        
        int Tempo;
        Tempo = Integer.parseInt(TxtTempo.getText());
        
        Salario = Double.parseDouble(TxtSalario.getText());
        
        if ((Salario <= 1000) && (Tempo > 5)) {
            
            //Bonus = 500;
            //Total = Salario + Bonus;
            //JOptionPane.showMessageDialog(null, "Seu Bônus é de: R$ " + Bonus + " O seu Salário Total é de: R$ " + Total);
            JOptionPane.showMessageDialog(null, "Você receberá o Bônus!!");
            
        }
        else {
            
            //Bonus = 800;
            //Total = Salario + Bonus;
            //JOptionPane.showMessageDialog(null, "Seu Bônus é de: R$ " + Bonus + " O seu Salário Total é de: R$ " + Total);
            JOptionPane.showMessageDialog(null, "Você não receberá o Bônus!!");
        }
        
    }//GEN-LAST:event_BtnCalculaSalarioActionPerformed

    private void TxtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalarioActionPerformed

    private void TxtTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTempoActionPerformed

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
            java.util.logging.Logger.getLogger(SalarioTempoValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalarioTempoValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalarioTempoValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalarioTempoValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalarioTempoValor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalculaSalario;
    private javax.swing.JTextField TxtSalario;
    private javax.swing.JTextField TxtTempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
