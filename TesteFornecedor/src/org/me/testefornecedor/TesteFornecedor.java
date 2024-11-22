/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.me.testefornecedor;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.me.exerciciofornecedor.Fornecedores;
import org.me.exerciciofornecedor.FornecedoresConecta;

/**
 *
 * @author diogo
 */
public class TesteFornecedor extends javax.swing.JFrame {
        private FornecedoresConecta fornecedorCon;
        private Fornecedores indiceEntrada;
        private int numero = 0;
        private int indice;
        private List<Fornecedores> resultado;
        public TesteFornecedor() throws ClassNotFoundException {
        fornecedorCon = new FornecedoresConecta(); 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLIMPAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCONSULTAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFORNECEDOR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCADASTRAR = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNOME = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtEMAIL = new javax.swing.JTextField();
        txtESTADO = new javax.swing.JTextField();
        txtCIDADE = new javax.swing.JTextField();
        txtENDERECO = new javax.swing.JTextField();
        btnEXCLUIR = new javax.swing.JButton();
        txtTELEFONE = new javax.swing.JTextField();
        btnALTERAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedores"));

        jLabel1.setText("Codigo");

        btnLIMPAR.setText("Limpar");
        btnLIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPARActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        btnCONSULTAR.setText("Consultar");
        btnCONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCONSULTARActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ");

        jLabel4.setText("Email");

        jLabel9.setText("Digite o Fornecedor");

        jLabel5.setText("Endereço");

        jLabel6.setText("Cidade");

        jLabel7.setText("Estado");

        jLabel8.setText("Telefone");

        btnCADASTRAR.setText("Cadastrar");
        btnCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRARActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMEActionPerformed(evt);
            }
        });

        txtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJActionPerformed(evt);
            }
        });

        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });

        btnALTERAR.setText("Alterar");
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtNOME)
                            .addComponent(txtCNPJ)
                            .addComponent(txtEMAIL)
                            .addComponent(txtENDERECO)
                            .addComponent(txtCIDADE)
                            .addComponent(txtESTADO)
                            .addComponent(txtTELEFONE, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnCADASTRAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnALTERAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnEXCLUIR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLIMPAR))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtFORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCONSULTAR)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCADASTRAR)
                    .addComponent(btnEXCLUIR)
                    .addComponent(btnALTERAR)
                    .addComponent(btnLIMPAR))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCONSULTAR)
                    .addComponent(txtFORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPARActionPerformed
        txtID.setText("");
        txtNOME.setText("");
        txtCNPJ.setText("");
        txtEMAIL.setText("");
        txtENDERECO.setText("");
        txtCIDADE.setText("");
        txtESTADO.setText("");
        txtTELEFONE.setText("");
        txtFORNECEDOR.setText("");
    }//GEN-LAST:event_btnLIMPARActionPerformed

    private void btnCONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCONSULTARActionPerformed
        resultado = fornecedorCon.getNomeFornecedor(txtFORNECEDOR.getText());
        numero = resultado.size();
        if (numero != 0)
        {
            indice = 0;
            indiceEntrada = resultado.get(indice);
            txtID.setText(" " + indiceEntrada.getID());
            txtNOME.setText(indiceEntrada.getNome());
            txtCNPJ.setText(indiceEntrada.getCNPJ());
            txtEMAIL.setText(indiceEntrada.getEmail());
            txtENDERECO.setText(indiceEntrada.getEndereco());
            txtCIDADE.setText(indiceEntrada.getCidade());
            txtESTADO.setText(indiceEntrada.getEstado());
            txtTELEFONE.setText(indiceEntrada.getTelefone());
        }
    }//GEN-LAST:event_btnCONSULTARActionPerformed

    private void btnCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRARActionPerformed
        int result = fornecedorCon.adicionaFornecedor(txtNOME.getText(), txtCNPJ.getText(),
            txtEMAIL.getText(), txtENDERECO.getText(), txtCIDADE.getText(), txtESTADO.getText(), txtTELEFONE.getText());
        if (result ==1)
        JOptionPane.showMessageDialog(this, "Pessoa inserida", "Pessoainserida", JOptionPane.PLAIN_MESSAGE);
        else
        JOptionPane.showMessageDialog(this, "Pessoa não inserida",
            "Erro", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnCADASTRARActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMEActionPerformed

    }//GEN-LAST:event_txtNOMEActionPerformed

    private void txtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJActionPerformed

    }//GEN-LAST:event_txtCNPJActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        boolean result = fornecedorCon.deletaFornecedor(Integer.parseInt(txtID.getText().trim()));
        if (result == true)
        JOptionPane.showMessageDialog(this, "Pessoa excluida", "Pessoa excluida", JOptionPane.PLAIN_MESSAGE);
        else
        JOptionPane.showMessageDialog(this, "Pessoa não excluida", "Erro",
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        int result = fornecedorCon.atualizaFornecedor(txtNOME.getText(), txtCNPJ.getText(),
            txtEMAIL.getText(), txtENDERECO.getText(), txtCIDADE.getText(), txtESTADO.getText(), txtTELEFONE.getText(),
            Integer.parseInt(txtID.getText().trim()));
        if (result ==1)
        JOptionPane.showMessageDialog(this, "Registro alterado", "Registro alterado", JOptionPane.PLAIN_MESSAGE);
        else
        JOptionPane.showMessageDialog(this, "Registro não alterado", "Erro",
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnALTERARActionPerformed

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
            java.util.logging.Logger.getLogger(TesteFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TesteFornecedor().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TesteFornecedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnCADASTRAR;
    private javax.swing.JButton btnCONSULTAR;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnLIMPAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCIDADE;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtENDERECO;
    private javax.swing.JTextField txtESTADO;
    private javax.swing.JTextField txtFORNECEDOR;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNOME;
    private javax.swing.JTextField txtTELEFONE;
    // End of variables declaration//GEN-END:variables
}
