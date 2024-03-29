/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.escolar.gui;

import br.ufmt.ic.posbd.escolar.FabricaDAO;
import br.ufmt.ic.posbd.escolar.dao.DisciplinaDAO;
import br.ufmt.ic.posbd.escolar.tableModel.DisciplinaTableModel;
import br.ufmt.ic.posbd.escolarMysql.entidade.Modalidade;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.Disciplina;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael
 */
public class DisciplinaJPanel extends javax.swing.JPanel {

    private DisciplinaTableModel tableModel;
    private DisciplinaDAO dao = FabricaDAO.criarDisciplinaDAO();

    /**
     * Creates new form SalaJPanel
     */
    public DisciplinaJPanel() {
        tableModel = new DisciplinaTableModel(dao.listar());
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

        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        salvarjButton = new javax.swing.JButton();
        idjLabel = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        cancelarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelajTable = new javax.swing.JTable();
        editarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        chjLabel = new javax.swing.JLabel();
        chjTextField = new javax.swing.JTextField();

        nomejLabel.setText("Nome:");

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        idjLabel.setText("Id:");

        idjTextField.setEditable(false);
        idjTextField.setEnabled(false);

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        tabelajTable.setModel(tableModel);
        jScrollPane1.setViewportView(tabelajTable);

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        excluirjButton.setText("Excluir");
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });

        chjLabel.setText("Carga Horária:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(excluirjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idjLabel)
                            .addComponent(nomejLabel)
                            .addComponent(chjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomejTextField)
                            .addComponent(idjTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarjButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(chjTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chjLabel)
                    .addComponent(chjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(cancelarjButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(editarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirjButton)
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        idjTextField.setText("");
        nomejTextField.setText("");
        chjTextField.setText("");
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
        if (tabelajTable.getSelectedRowCount() == 1) {
            int linha = tabelajTable.getSelectedRow();
            Disciplina edicao = tableModel.get(linha);
            nomejTextField.setText(edicao.getNome());
            chjTextField.setText(edicao.getCargaHoraria() + "");
            idjTextField.setText(edicao.getId() + "");
        } else {
            JOptionPane.showMessageDialog(tabelajTable, "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:
        int[] linhas = tabelajTable.getSelectedRows();
        if (JOptionPane.showConfirmDialog(excluirjButton, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {
            for (int i = 0; i < linhas.length; i++) {
                Disciplina disciplina = tableModel.get(linhas[i]);
                dao.excluir(disciplina.getId());
            }
            JOptionPane.showMessageDialog(tabelajTable, "Removidos com Sucesso!");
            tableModel.atualizar(dao.listar());
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        if (!nomejTextField.getText().equals("")) {
            Disciplina disciplina = new Disciplina();

            disciplina.setNome(nomejTextField.getText());
            
            try {
                disciplina.setCargaHoraria(Integer.parseInt(chjTextField.getText()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(chjTextField, "Número no formato errado. Por favor corrigir!");
                chjTextField.grabFocus();
                return ;
            }

            if (!idjTextField.getText().equals("")) {
                int id = Integer.parseInt(idjTextField.getText());
                disciplina.setId(id);
                dao.alterar(disciplina);
                JOptionPane.showMessageDialog(salvarjButton, "Atualizado com Sucesso!");
            } else {
                dao.inserir(disciplina);
                JOptionPane.showMessageDialog(salvarjButton, "Inserido com Sucesso!");
            }

            tableModel.atualizar(dao.listar());

            cancelarjButtonActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(nomejTextField, "Informe o campo nome!");
            nomejTextField.grabFocus();
        }
    }//GEN-LAST:event_salvarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JLabel chjLabel;
    private javax.swing.JTextField chjTextField;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JTable tabelajTable;
    // End of variables declaration//GEN-END:variables
}
