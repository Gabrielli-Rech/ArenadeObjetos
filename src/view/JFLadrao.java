/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import servico.ServicosFactory;
import servico.LadraoServicos;
import javax.swing.JOptionPane;
import model.Ladrao;

/**
 *
 * @author 182310018
 */
public class JFLadrao extends javax.swing.JFrame {

    int idedit;

    /**
     * Creates new form JFGuerreiro
     */
    public JFLadrao() {
        initComponents();
        addRowToTable();
        jEditarLadrao.setVisible(false);
        jDeletarLadrao.setVisible(false);
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jTableLadrao.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        //cria vetor de 5 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[6];
        LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
        //percorer lista e popula vetor e add vetor e tabela
        for (Ladrao ladrao : ladraoS.listaLadrao()) {
            rowData[0] = ladrao.getId();
            rowData[1] = ladrao.getNome();
            rowData[2] = ladrao.getOlho();
            rowData[3] = ladrao.isSexo() == false ? "Feminino" : "Masculino";
            rowData[4] = ladrao.getPontosDeVida();
            rowData[5] = ladrao.getPlanoDeFuga();
            model.addRow(rowData);

        }
    }

    private void limpaCampo() {
        jtfNomeLadrao.setText("");
        jtfCabeloLadrao.setText("");
        jtfOlhoLadrao.setText("");
        jtfPeleLadrao.setText("");
        jtfPlanodeFugaLadrao.setText("");
        bgSexoLadrao.clearSelection();
        jtfPlanodeFugaLadrao.requestFocus();
    }

    private boolean validainputs() {
        if (jtfPlanodeFugaLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "nome");
            jtfPlanodeFugaLadrao.requestFocus();
            return false;
        }

        if (jtfOlhoLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "olho");
            jtfOlhoLadrao.requestFocus();
            return false;
        }

        if (jtfCabeloLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "cabelo");
            jtfCabeloLadrao.requestFocus();
            return false;
        }

        if (jtfPeleLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pele");
            jtfPeleLadrao.requestFocus();
            return false;
        }

        if (!jtfFemininoLadrao.isSelected() && !jtfMasculinoLadrao.isSelected()) {
            JOptionPane.showMessageDialog(this, "selecionar sexo");
            return false;

        }

        if (jtfPlanodeFugaLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "planoDeFuga");
            jtfPlanodeFugaLadrao.requestFocus();
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

        bgSexoLadrao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfPlanodeFugaLadrao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCabeloLadrao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfOlhoLadrao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfPeleLadrao = new javax.swing.JTextField();
        jtfFemininoLadrao = new javax.swing.JRadioButton();
        jtfMasculinoLadrao = new javax.swing.JRadioButton();
        jSexoLadrao = new javax.swing.JLabel();
        jbSalvarLadrao = new javax.swing.JButton();
        jbLimparLadrao = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLadrao = new javax.swing.JTable();
        jDeletarLadrao = new javax.swing.JButton();
        jEditarLadrao = new javax.swing.JButton();
        jtfNomeLadrao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Ladrão");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jtfPlanodeFugaLadrao.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cabelo:");

        jtfCabeloLadrao.setBackground(new java.awt.Color(204, 204, 204));
        jtfCabeloLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCabeloLadraoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Olho:");

        jtfOlhoLadrao.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pele:");

        jtfPeleLadrao.setBackground(new java.awt.Color(204, 204, 204));

        bgSexoLadrao.add(jtfFemininoLadrao);
        jtfFemininoLadrao.setForeground(new java.awt.Color(255, 255, 255));
        jtfFemininoLadrao.setText("Feminino");

        jtfMasculinoLadrao.setBackground(new java.awt.Color(0, 102, 102));
        bgSexoLadrao.add(jtfMasculinoLadrao);
        jtfMasculinoLadrao.setForeground(new java.awt.Color(255, 255, 255));
        jtfMasculinoLadrao.setText("Masculino");

        jSexoLadrao.setForeground(new java.awt.Color(255, 255, 255));
        jSexoLadrao.setText("Sexo:");

        jbSalvarLadrao.setText("Salvar");
        jbSalvarLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarLadraoActionPerformed(evt);
            }
        });

        jbLimparLadrao.setText("Limpar");
        jbLimparLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparLadraoActionPerformed(evt);
            }
        });

        jTableLadrao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Olho", "Sexo", "HP", "Plano de fuga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLadrao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLadraoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLadrao);
        if (jTableLadrao.getColumnModel().getColumnCount() > 0) {
            jTableLadrao.getColumnModel().getColumn(0).setResizable(false);
            jTableLadrao.getColumnModel().getColumn(1).setResizable(false);
            jTableLadrao.getColumnModel().getColumn(2).setResizable(false);
            jTableLadrao.getColumnModel().getColumn(3).setResizable(false);
            jTableLadrao.getColumnModel().getColumn(4).setResizable(false);
            jTableLadrao.getColumnModel().getColumn(5).setResizable(false);
        }

        jDeletarLadrao.setText("Deletar");
        jDeletarLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletarLadraoActionPerformed(evt);
            }
        });

        jEditarLadrao.setText("Editar");
        jEditarLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarLadraoActionPerformed(evt);
            }
        });

        jtfNomeLadrao.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plano: ");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNomeLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jEditarLadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvarLadrao))
                            .addComponent(jtfCabeloLadrao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeleLadrao, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSexoLadrao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfFemininoLadrao)
                                        .addGap(43, 43, 43)
                                        .addComponent(jtfMasculinoLadrao))
                                    .addComponent(jtfOlhoLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbLimparLadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDeletarLadrao)
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfPlanodeFugaLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(jtfNomeLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfOlhoLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCabeloLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPeleLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSexoLadrao)
                    .addComponent(jtfFemininoLadrao)
                    .addComponent(jtfMasculinoLadrao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfPlanodeFugaLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvarLadrao)
                    .addComponent(jDeletarLadrao)
                    .addComponent(jEditarLadrao)
                    .addComponent(jbLimparLadrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jbLimparLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparLadraoActionPerformed
        // TODO add your handling code here:
        limpaCampo();
    }//GEN-LAST:event_jbLimparLadraoActionPerformed

    private void jbSalvarLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarLadraoActionPerformed
        // TODO add your handling code here:
        if (jbSalvarLadrao.getText().equals("salvar")) {
            if (validainputs()) {
                Ladrao l = new Ladrao();
                l.setNome(jtfPlanodeFugaLadrao.getText());
                l.setOlho(jtfOlhoLadrao.getText());
                l.setCabelo(jtfCabeloLadrao.getText());
                l.setPele(jtfPeleLadrao.getText());
                l.setSexo(jtfFemininoLadrao.isSelected());
                l.setPlanoDeFuga(jtfPlanodeFugaLadrao.getText());

                if (jtfFemininoLadrao.isSelected() || jtfMasculinoLadrao.isSelected()) {
                    l.setSexo(!jtfFemininoLadrao.isSelected());
                }
                LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
                ladraoS.cadastrarLadrao(l);
                addRowToTable();
                limpaCampo();
                jbDefaut();
    }//GEN-LAST:event_jbSalvarLadraoActionPerformed
        } else {
            Ladrao lad = new Ladrao();
            lad.setId(idedit);
            lad.setNome(jtfNomeLadrao.getText());
            lad.setOlho(jtfOlhoLadrao.getText());
            lad.setCabelo(jtfCabeloLadrao.getText());
            lad.setPele(jtfPeleLadrao.getText());
            lad.setPlanoDeFuga(jtfPlanodeFugaLadrao.getText());
            LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
            ladraoS.atualizarLadrao(lad);
            addRowToTable();
            jbDefaut();
            JOptionPane.showMessageDialog(this, "Ladrão atualizada com sucesso");

        }

    }

    private void jbDefaut() {
        jbSalvarLadrao.setText("Atualizar");
        jtfMasculinoLadrao.setVisible(true);
        jtfFemininoLadrao.setVisible(true);
        jbLimparLadrao.setEnabled(true);
        jSexoLadrao.setVisible(true);
        jDeletarLadrao.setVisible(false);
        jDeletarLadrao.setText("Cancelar");
        jEditarLadrao.setVisible(false);
    }

    private void jtfCabeloLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCabeloLadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCabeloLadraoActionPerformed

    private void jTableLadraoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLadraoMouseClicked
        // TODO add your handling code here:
        jEditarLadrao.setVisible(true);
        jDeletarLadrao.setVisible(true);
    }//GEN-LAST:event_jTableLadraoMouseClicked

    private void jDeletarLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletarLadraoActionPerformed
        // TODO add your handling code here:
        int linha = jTableLadrao.getSelectedRow();
        int id = (int) jTableLadrao.getValueAt(linha, 0);
        String nome = (String) jTableLadrao.getValueAt(linha, 1);
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja mesmo deletar? " + nome, ".:Deletar:.", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG);
        if (resp == 0) {
            LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
            ladraoS.deletarLadrao(id);
            JOptionPane.showMessageDialog(this, "Ladrão " + nome + " deletado com sucesso");
        } else {
            JOptionPane.showMessageDialog(this, "Ok, a opção deletar foi cancelada pelo usuário com sucesso");
        }
    }//GEN-LAST:event_jDeletarLadraoActionPerformed

    private void jEditarLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarLadraoActionPerformed
        // TODO add your handling code here:
        jEditarLadrao.setEnabled(false);
        jEditarLadrao.setText("Atualizar");
        jtfFemininoLadrao.setEnabled(false);
        jtfMasculinoLadrao.setEnabled(false);
        jSexoLadrao.setVisible(false);
        jDeletarLadrao.setText("Deletar");
        // Buscar vitima e carregar nos campos
        int linha = jTableLadrao.getSelectedRow();
        idedit = (int) jTableLadrao.getValueAt(linha, 0);
        LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
        Ladrao ladrao = (Ladrao) ladraoS.getLadraoById(idedit);
        jtfNomeLadrao.setText(ladrao.getNome());
        jtfCabeloLadrao.setText(ladrao.getCabelo());
        jtfOlhoLadrao.setText(ladrao.getOlho());
        jtfPeleLadrao.setText(ladrao.getPele());
        jtfPlanodeFugaLadrao.setText(ladrao.getPlanoDeFuga());
        jtfFemininoLadrao.setVisible(false);
        jtfMasculinoLadrao.setVisible(false);
    }//GEN-LAST:event_jEditarLadraoActionPerformed

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
            java.util.logging.Logger.getLogger(JFLadrao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLadrao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLadrao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLadrao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexoLadrao;
    private javax.swing.JButton jDeletarLadrao;
    private javax.swing.JButton jEditarLadrao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jSexoLadrao;
    private javax.swing.JTable jTableLadrao;
    private javax.swing.JButton jbLimparLadrao;
    private javax.swing.JButton jbSalvarLadrao;
    private javax.swing.JTextField jtfCabeloLadrao;
    private javax.swing.JRadioButton jtfFemininoLadrao;
    private javax.swing.JRadioButton jtfMasculinoLadrao;
    private javax.swing.JTextField jtfNomeLadrao;
    private javax.swing.JTextField jtfOlhoLadrao;
    private javax.swing.JTextField jtfPeleLadrao;
    private javax.swing.JTextField jtfPlanodeFugaLadrao;
    // End of variables declaration//GEN-END:variables
}
