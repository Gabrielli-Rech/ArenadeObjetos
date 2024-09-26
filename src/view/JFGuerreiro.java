/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import servico.ServicosFactory;
import servico.GuerreiroServicos;
import javax.swing.JOptionPane;
import model.Guerreiro;

/**
 *
 * @author 182310018
 */
public class JFGuerreiro extends javax.swing.JFrame {

    int idedit;

    /**
     * Creates new form JFGuerreiro
     */
    public JFGuerreiro() {
        initComponents();
        addRowToTable();
        jEditarGuerreiro.setVisible(false);
        jDeletarGuerreiro.setVisible(false);
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jTableGuerreiro.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        //cria vetor de 5 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[6];
        GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
        //percorer lista e popula vetor e add vetor e tabela
        for (Guerreiro guerreiro : guerreiroS.listaGuerreiros()) {
            rowData[0] = guerreiro.getId();
            rowData[1] = guerreiro.getNome();
            rowData[2] = guerreiro.getOlho();
            rowData[3] = guerreiro.isSexo() == false ? "Feminino" : "Masculino";
            rowData[4] = guerreiro.getPontosDeVida();
            rowData[5] = guerreiro.getArmamento();
            model.addRow(rowData);

        }
    }

    private void limpaCampo() {
        jtfNomeGuerreiro.setText("");
        jtfCabeloGuerreiro.setText("");
        jtfOlhoGuerreiro.setText("");
        jtfPeleGuerreiro.setText("");
        jtfArmamentoGuerreiro.setText("");
        bgSexoGuerreiro.clearSelection();
        jtfNomeGuerreiro.requestFocus();
    }

    private boolean validainputs() {
        if (jtfNomeGuerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "nome");
            jtfNomeGuerreiro.requestFocus();
            return false;
        }

        if (jtfOlhoGuerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "olho");
            jtfOlhoGuerreiro.requestFocus();
            return false;
        }

        if (jtfCabeloGuerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "cabelo");
            jtfCabeloGuerreiro.requestFocus();
            return false;
        }

        if (jtfPeleGuerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pele");
            jtfPeleGuerreiro.requestFocus();
            return false;
        }

        if (!jtfFemininoGuerreiro.isSelected() && !jtfMasculinoGuerreiro.isSelected()) {
            JOptionPane.showMessageDialog(this, "selecionar sexo");
            return false;

        }

        if (jtfArmamentoGuerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "armamento");
            jtfArmamentoGuerreiro.requestFocus();
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

        bgSexoGuerreiro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfArmamentoGuerreiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCabeloGuerreiro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfOlhoGuerreiro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfPeleGuerreiro = new javax.swing.JTextField();
        jtfFemininoGuerreiro = new javax.swing.JRadioButton();
        jtfMasculinoGuerreiro = new javax.swing.JRadioButton();
        jSexoGuerreiro = new javax.swing.JLabel();
        jbSalvarGuerreiro = new javax.swing.JButton();
        jbLimparGuerreiro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGuerreiro = new javax.swing.JTable();
        jDeletarGuerreiro = new javax.swing.JButton();
        jEditarGuerreiro = new javax.swing.JButton();
        jtfNomeGuerreiro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Guerreiro");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jtfArmamentoGuerreiro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cabelo:");

        jtfCabeloGuerreiro.setBackground(new java.awt.Color(204, 204, 204));
        jtfCabeloGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCabeloGuerreiroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Olho:");

        jtfOlhoGuerreiro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pele:");

        jtfPeleGuerreiro.setBackground(new java.awt.Color(204, 204, 204));

        bgSexoGuerreiro.add(jtfFemininoGuerreiro);
        jtfFemininoGuerreiro.setForeground(new java.awt.Color(255, 255, 255));
        jtfFemininoGuerreiro.setText("Feminino");

        jtfMasculinoGuerreiro.setBackground(new java.awt.Color(0, 102, 102));
        bgSexoGuerreiro.add(jtfMasculinoGuerreiro);
        jtfMasculinoGuerreiro.setForeground(new java.awt.Color(255, 255, 255));
        jtfMasculinoGuerreiro.setText("Masculino");

        jSexoGuerreiro.setForeground(new java.awt.Color(255, 255, 255));
        jSexoGuerreiro.setText("Sexo:");

        jbSalvarGuerreiro.setText("Salvar");
        jbSalvarGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarGuerreiroActionPerformed(evt);
            }
        });

        jbLimparGuerreiro.setText("Limpar");
        jbLimparGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparGuerreiroActionPerformed(evt);
            }
        });

        jTableGuerreiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Olho", "Sexo", "HP", "Armamento"
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
        jTableGuerreiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGuerreiroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGuerreiro);
        if (jTableGuerreiro.getColumnModel().getColumnCount() > 0) {
            jTableGuerreiro.getColumnModel().getColumn(0).setResizable(false);
            jTableGuerreiro.getColumnModel().getColumn(1).setResizable(false);
            jTableGuerreiro.getColumnModel().getColumn(2).setResizable(false);
            jTableGuerreiro.getColumnModel().getColumn(3).setResizable(false);
            jTableGuerreiro.getColumnModel().getColumn(4).setResizable(false);
            jTableGuerreiro.getColumnModel().getColumn(5).setResizable(false);
        }

        jDeletarGuerreiro.setText("Deletar");
        jDeletarGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletarGuerreiroActionPerformed(evt);
            }
        });

        jEditarGuerreiro.setText("Editar");
        jEditarGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarGuerreiroActionPerformed(evt);
            }
        });

        jtfNomeGuerreiro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arma:");

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
                        .addComponent(jtfNomeGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jEditarGuerreiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvarGuerreiro))
                            .addComponent(jtfCabeloGuerreiro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeleGuerreiro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSexoGuerreiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfFemininoGuerreiro)
                                        .addGap(43, 43, 43)
                                        .addComponent(jtfMasculinoGuerreiro))
                                    .addComponent(jtfOlhoGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbLimparGuerreiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDeletarGuerreiro)
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfArmamentoGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jtfNomeGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfOlhoGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCabeloGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPeleGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSexoGuerreiro)
                    .addComponent(jtfFemininoGuerreiro)
                    .addComponent(jtfMasculinoGuerreiro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfArmamentoGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvarGuerreiro)
                    .addComponent(jDeletarGuerreiro)
                    .addComponent(jEditarGuerreiro)
                    .addComponent(jbLimparGuerreiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void jbLimparGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparGuerreiroActionPerformed
        // TODO add your handling code here:
        limpaCampo();
    }//GEN-LAST:event_jbLimparGuerreiroActionPerformed

    private void jbSalvarGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarGuerreiroActionPerformed
        // TODO add your handling code here:
        if (jbSalvarGuerreiro.getText().equalsIgnoreCase("salvar")) {
            if (validainputs()) {
                Guerreiro g = new Guerreiro();
                g.setNome(jtfNomeGuerreiro.getText());
                g.setOlho(jtfOlhoGuerreiro.getText());
                g.setCabelo(jtfCabeloGuerreiro.getText());
                g.setPele(jtfPeleGuerreiro.getText());
                g.setSexo(jtfFemininoGuerreiro.isSelected());
                g.setArmamento(jtfArmamentoGuerreiro.getText());

                if (jtfFemininoGuerreiro.isSelected() || jtfMasculinoGuerreiro.isSelected()) {
                    g.setSexo(!jtfFemininoGuerreiro.isSelected());
                }
                GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
                guerreiroS.cadastrarGuerreiro(g);
                addRowToTable();
                limpaCampo();
                jbDefaut();
    }//GEN-LAST:event_jbSalvarGuerreiroActionPerformed
        } else {
            Guerreiro gue = new Guerreiro();
            gue.setId(idedit);
            gue.setNome(jtfNomeGuerreiro.getText());
            gue.setOlho(jtfOlhoGuerreiro.getText());
            gue.setCabelo(jtfCabeloGuerreiro.getText());
            gue.setPele(jtfPeleGuerreiro.getText());
            gue.setArmamento(jtfArmamentoGuerreiro.getText());
            GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
            guerreiroS.atualizarGuerreiros(gue);
            addRowToTable();
            jbDefaut();
            JOptionPane.showMessageDialog(this, "Gurreiro atualizado com sucesso");

        }

    }

    private void jbDefaut() {
        jbSalvarGuerreiro.setText("Salvar");
        jtfMasculinoGuerreiro.setVisible(true);
        jtfFemininoGuerreiro.setVisible(true);
        jbLimparGuerreiro.setEnabled(true);
        jSexoGuerreiro.setVisible(true);
        jDeletarGuerreiro.setVisible(false);
        jDeletarGuerreiro.setText("Deletar");
        jEditarGuerreiro.setVisible(false);
    }

    private void jtfCabeloGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCabeloGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCabeloGuerreiroActionPerformed

    private void jTableGuerreiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGuerreiroMouseClicked
        // TODO add your handling code here:
        jEditarGuerreiro.setVisible(true);
        jDeletarGuerreiro.setVisible(true);
    }//GEN-LAST:event_jTableGuerreiroMouseClicked

    private void jDeletarGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletarGuerreiroActionPerformed
        // TODO add your handling code here:
        int linha = jTableGuerreiro.getSelectedRow();
        int id = (int) jTableGuerreiro.getValueAt(linha, 0);
        String nome = (String) jTableGuerreiro.getValueAt(linha, 1);
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja mesmo deletar?" + nome, ".:Deletar:.", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG);
        if (resp == 0) {
            GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
            guerreiroS.deletarGuerreiros(id);
            JOptionPane.showMessageDialog(this, "Guerreiro " + nome + " deletada com sucesso");
            addRowToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Ok, a opção deletar foi cancelada pelo usuario com sucesso");
        }
    }//GEN-LAST:event_jDeletarGuerreiroActionPerformed

    private void jEditarGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarGuerreiroActionPerformed
        // TODO add your handling code here:
        jEditarGuerreiro.setEnabled(false);
        jEditarGuerreiro.setText("Atualizar");
        jtfFemininoGuerreiro.setEnabled(false);
        jtfMasculinoGuerreiro.setEnabled(false);
        jSexoGuerreiro.setVisible(false);
        jDeletarGuerreiro.setText("Deletar");
        // Buscar vitima e carregar nos campos
        int linha = jTableGuerreiro.getSelectedRow();
        idedit = (int) jTableGuerreiro.getValueAt(linha, 0);
        GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
        Guerreiro guerreiro = (Guerreiro) guerreiroS.getGuerreiroById(idedit);
        jtfNomeGuerreiro.setText(guerreiro.getNome());
        jtfCabeloGuerreiro.setText(guerreiro.getCabelo());
        jtfOlhoGuerreiro.setText(guerreiro.getOlho());
        jtfPeleGuerreiro.setText(guerreiro.getPele());
        jtfArmamentoGuerreiro.setText(guerreiro.getArmamento());
        jtfFemininoGuerreiro.setVisible(false);
        jtfMasculinoGuerreiro.setVisible(false);
    }//GEN-LAST:event_jEditarGuerreiroActionPerformed

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
            java.util.logging.Logger.getLogger(JFGuerreiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGuerreiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexoGuerreiro;
    private javax.swing.JButton jDeletarGuerreiro;
    private javax.swing.JButton jEditarGuerreiro;
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
    private javax.swing.JLabel jSexoGuerreiro;
    private javax.swing.JTable jTableGuerreiro;
    private javax.swing.JButton jbLimparGuerreiro;
    private javax.swing.JButton jbSalvarGuerreiro;
    private javax.swing.JTextField jtfArmamentoGuerreiro;
    private javax.swing.JTextField jtfCabeloGuerreiro;
    private javax.swing.JRadioButton jtfFemininoGuerreiro;
    private javax.swing.JRadioButton jtfMasculinoGuerreiro;
    private javax.swing.JTextField jtfNomeGuerreiro;
    private javax.swing.JTextField jtfOlhoGuerreiro;
    private javax.swing.JTextField jtfPeleGuerreiro;
    // End of variables declaration//GEN-END:variables
}
