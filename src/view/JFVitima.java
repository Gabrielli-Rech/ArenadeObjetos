/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import servico.ServicosFactory;
import servico.VitimasServicos;
import javax.swing.JOptionPane;

/**
 *
 * @author 182310018
 */
public class JFVitima extends javax.swing.JFrame {

    int idedit;

    /**
     * Creates new form JFVitima
     */
    public JFVitima() {
        initComponents();
        addRowToTable();
        jEditarVitima.setVisible(false);
        jDeletarVitima.setVisible(false);
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jTableVitimas.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        //cria vetor de 5 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[5];
        VitimasServicos vitimasS = ServicosFactory.getVitimasServicos();
        //percorer lista e popula vetor e add vetor e tabela
        for (Pessoa vitima : vitimasS.listaVitimas()) {
            rowData[0] = vitima.getId();
            rowData[1] = vitima.getNome();
            rowData[2] = vitima.getOlho();
            rowData[3] = vitima.isSexo() == false ? "Feminino" : "Masculino";
            rowData[4] = vitima.getPontosDeVida();
            model.addRow(rowData);

        }
    }

    private void limpaCampo() {
        jtfNomeVitima.setText("");
        jtfCabeloVitima.setText("");
        jtfOlhoVitima.setText("");
        jtfPeleVitima.setText("");
        bgSexoVitima.clearSelection();
        jtfNomeVitima.requestFocus();
    }

    private boolean validainputs() {
        if (jtfNomeVitima.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "precnher nome");
            jtfNomeVitima.requestFocus();
            return false;
        }

        if (jtfOlhoVitima.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "precnher olho");
            jtfOlhoVitima.requestFocus();
            return false;
        }

        if (jtfCabeloVitima.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "precnher cabelo");
            jtfCabeloVitima.requestFocus();
            return false;
        }

        if (jtfPeleVitima.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "precnher pele");
            jtfPeleVitima.requestFocus();
            return false;
        }

        if (!jtfFemininoVitima.isSelected() && !jtfMasculinoVitima.isSelected()) {
            JOptionPane.showMessageDialog(this, "selecionar sexo");
            return false;

        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexoVitima = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfNomeVitima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCabeloVitima = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfOlhoVitima = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfPeleVitima = new javax.swing.JTextField();
        jtfFemininoVitima = new javax.swing.JRadioButton();
        jtfMasculinoVitima = new javax.swing.JRadioButton();
        jSexoVitima = new javax.swing.JLabel();
        jbSalvarVitima = new javax.swing.JButton();
        jbLimparVitima = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVitimas = new javax.swing.JTable();
        jDeletarVitima = new javax.swing.JButton();
        jEditarVitima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Vítima");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jtfNomeVitima.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cabelo:");

        jtfCabeloVitima.setBackground(new java.awt.Color(204, 204, 204));
        jtfCabeloVitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCabeloVitimaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Olho:");

        jtfOlhoVitima.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pele:");

        jtfPeleVitima.setBackground(new java.awt.Color(204, 204, 204));

        bgSexoVitima.add(jtfFemininoVitima);
        jtfFemininoVitima.setForeground(new java.awt.Color(255, 255, 255));
        jtfFemininoVitima.setText("Feminino");

        jtfMasculinoVitima.setBackground(new java.awt.Color(0, 102, 102));
        bgSexoVitima.add(jtfMasculinoVitima);
        jtfMasculinoVitima.setForeground(new java.awt.Color(255, 255, 255));
        jtfMasculinoVitima.setText("Masculino");

        jSexoVitima.setForeground(new java.awt.Color(255, 255, 255));
        jSexoVitima.setText("Sexo:");

        jbSalvarVitima.setText("Salvar");
        jbSalvarVitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarVitimaActionPerformed(evt);
            }
        });

        jbLimparVitima.setText("Limpar");
        jbLimparVitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparVitimaActionPerformed(evt);
            }
        });

        jTableVitimas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Olho", "Sexo", "HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVitimas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVitimasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVitimas);
        if (jTableVitimas.getColumnModel().getColumnCount() > 0) {
            jTableVitimas.getColumnModel().getColumn(0).setResizable(false);
            jTableVitimas.getColumnModel().getColumn(1).setResizable(false);
            jTableVitimas.getColumnModel().getColumn(2).setResizable(false);
            jTableVitimas.getColumnModel().getColumn(3).setResizable(false);
            jTableVitimas.getColumnModel().getColumn(4).setResizable(false);
        }

        jDeletarVitima.setText("Deletar");
        jDeletarVitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletarVitimaActionPerformed(evt);
            }
        });

        jEditarVitima.setText("Editar");
        jEditarVitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarVitimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNomeVitima, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jEditarVitima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvarVitima))
                            .addComponent(jtfCabeloVitima, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeleVitima, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSexoVitima))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfFemininoVitima)
                                        .addGap(43, 43, 43)
                                        .addComponent(jtfMasculinoVitima))
                                    .addComponent(jtfOlhoVitima, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbLimparVitima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDeletarVitima)
                                .addGap(28, 28, 28))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeVitima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfOlhoVitima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCabeloVitima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPeleVitima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSexoVitima)
                    .addComponent(jtfFemininoVitima)
                    .addComponent(jtfMasculinoVitima))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvarVitima)
                    .addComponent(jDeletarVitima)
                    .addComponent(jEditarVitima)
                    .addComponent(jbLimparVitima))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparVitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparVitimaActionPerformed
        // TODO add your handling code here:
        limpaCampo();
    }//GEN-LAST:event_jbLimparVitimaActionPerformed

    private void jbSalvarVitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarVitimaActionPerformed
        // TODO add your handling code here:
        if (jbSalvarVitima.getText().equals("salvar")) {
            if (validainputs()) {
                Pessoa v = new Pessoa();
                v.setNome(jtfNomeVitima.getText());
                v.setOlho(jtfOlhoVitima.getText());
                v.setCabelo(jtfCabeloVitima.getText());
                v.setPele(jtfPeleVitima.getText());
                v.setSexo(jtfFemininoVitima.isSelected());

                if (jtfFemininoVitima.isSelected() || jtfMasculinoVitima.isSelected()) {
                    v.setSexo(!jtfFemininoVitima.isSelected());
                }
                VitimasServicos vitimasS = ServicosFactory.getVitimasServicos();
                vitimasS.cadastrarVitima(v);
                addRowToTable();
                limpaCampo();
                jbDefaut();
    }//GEN-LAST:event_jbSalvarVitimaActionPerformed
        } else {
            Pessoa vit = new Pessoa();
            vit.setId(idedit);
            vit.setNome(jtfNomeVitima.getText());
            vit.setOlho(jtfOlhoVitima.getText());
            vit.setCabelo(jtfCabeloVitima.getText());
            vit.setPele(jtfPeleVitima.getText());
            VitimasServicos vitimaS = ServicosFactory.getVitimasServicos();
            vitimaS.atualizarVitima(vit);
            addRowToTable();
            jbDefaut();
            JOptionPane.showMessageDialog(this, "Vítima atualizada com sucesso");

        }

    }

    private void jbDefaut() {
        jbSalvarVitima.setText("Atualizar");
        jtfMasculinoVitima.setVisible(true);
        jtfFemininoVitima.setVisible(true);
        jbLimparVitima.setEnabled(true);
        jSexoVitima.setVisible(true);
        jDeletarVitima.setVisible(false);
        jDeletarVitima.setText("Cancelar");
        jEditarVitima.setVisible(false);
    }

    private void jtfCabeloVitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCabeloVitimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCabeloVitimaActionPerformed

    private void jTableVitimasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVitimasMouseClicked
        // TODO add your handling code here:
        jEditarVitima.setVisible(true);
        jDeletarVitima.setVisible(true);
    }//GEN-LAST:event_jTableVitimasMouseClicked

    private void jDeletarVitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletarVitimaActionPerformed
        // TODO add your handling code here:
        int linha = jTableVitimas.getSelectedRow();
        int id = (int) jTableVitimas.getValueAt(linha, 0);
        String nome = (String) jTableVitimas.getValueAt(linha, 1);
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja mesmo deletar?" + nome, ".:Deletar:.", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG);
        if (resp == 0) {
            VitimasServicos vitimasS = ServicosFactory.getVitimasServicos();
            vitimasS.deletarVitimas(id);
            JOptionPane.showMessageDialog(this, "Vitima " + nome + " deletada com sucesso");
        } else {
            JOptionPane.showMessageDialog(this, "Ok, a opção deletar foi cancelada pelo usuario com sucesso");
        }
    }//GEN-LAST:event_jDeletarVitimaActionPerformed

    private void jEditarVitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarVitimaActionPerformed
        // TODO add your handling code here:
        jEditarVitima.setEnabled(false);
        jEditarVitima.setText("Atualizar");
        jtfFemininoVitima.setEnabled(false);
        jtfMasculinoVitima.setEnabled(false);
        jSexoVitima.setVisible(false);
        jDeletarVitima.setText("Deletar");
        // Buscar vitima e carregar nos campos
        int linha = jTableVitimas.getSelectedRow();
        idedit = (int) jTableVitimas.getValueAt(linha, 0);
        VitimasServicos vitimaS = ServicosFactory.getVitimasServicos();
        Pessoa vitima = vitimaS.getVitimaById(idedit);
        jtfNomeVitima.setText(vitima.getNome());
        jtfCabeloVitima.setText(vitima.getCabelo());
        jtfOlhoVitima.setText(vitima.getOlho());
        jtfPeleVitima.setText(vitima.getPele());
        jtfFemininoVitima.setVisible(false);
        jtfMasculinoVitima.setVisible(false);
    }//GEN-LAST:event_jEditarVitimaActionPerformed

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
            java.util.logging.Logger.getLogger(JFVitima.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVitima.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVitima.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVitima.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVitima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexoVitima;
    private javax.swing.JButton jDeletarVitima;
    private javax.swing.JButton jEditarVitima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jSexoVitima;
    private javax.swing.JTable jTableVitimas;
    private javax.swing.JButton jbLimparVitima;
    private javax.swing.JButton jbSalvarVitima;
    private javax.swing.JTextField jtfCabeloVitima;
    private javax.swing.JRadioButton jtfFemininoVitima;
    private javax.swing.JRadioButton jtfMasculinoVitima;
    private javax.swing.JTextField jtfNomeVitima;
    private javax.swing.JTextField jtfOlhoVitima;
    private javax.swing.JTextField jtfPeleVitima;
    // End of variables declaration//GEN-END:variables
}
