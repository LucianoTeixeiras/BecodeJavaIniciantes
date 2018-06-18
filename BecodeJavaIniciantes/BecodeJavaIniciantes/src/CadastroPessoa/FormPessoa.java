/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroPessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano.t.da.silva
 */
public class FormPessoa extends javax.swing.JFrame {
    
    Pessoa objPessoa = new Pessoa();
        
    /**
     * Creates new form FormPessoa
     */
    public FormPessoa() {
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

        jLabel1 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtPeso = new javax.swing.JTextField();
        BtnGet = new javax.swing.JButton();
        BtnSet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        TxtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Peso:");

        BtnGet.setText("GET");
        BtnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGetActionPerformed(evt);
            }
        });

        BtnSet.setText("SET");
        BtnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtPeso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtIdade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnGet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnSet)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGet)
                    .addComponent(BtnSet))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdadeActionPerformed

    private void BtnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSetActionPerformed
        // TODO add your handling code here:
        
        String strNome;
        int intIdade;
        double douPeso;
    
        strNome = objPessoa.ObterNome();
        intIdade = objPessoa.ObterIdade();
        douPeso = objPessoa.ObterPeso();
        
        JOptionPane.showMessageDialog(null, "Nome: " + strNome + ", Idade: " + intIdade + ", Peso: " + douPeso);
        
    }//GEN-LAST:event_BtnSetActionPerformed

    private void BtnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGetActionPerformed
        // TODO add your handling code here:
        
        objPessoa.DefineNome(TxtNome.getText());
        objPessoa.DefineIdade(Integer.parseInt(TxtIdade.getText()));
        objPessoa.DefinePeso(Double.parseDouble(TxtPeso.getText()));
        
        //Limpa Campos
        
        TxtNome.setText(null);
        TxtIdade.setText(null);
        TxtPeso.setText(null);
        
    }//GEN-LAST:event_BtnGetActionPerformed

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
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGet;
    private javax.swing.JButton BtnSet;
    private javax.swing.JTextField TxtIdade;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}