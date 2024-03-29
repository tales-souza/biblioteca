/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
    Atualizado em 02/06/2019 por tales
 */
package view;

import conf.Conexao;
import data.TabelaEmprestimos;
import data.TabelaLivros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static view.FormCadastro.stmt;

/**
 *
 * @author marcos
 */
public class FormEmprestimos extends javax.swing.JFrame {

    public Conexao conexao;    
    public static Statement stmt;
    
    private TabelaEmprestimos tabelaEmprestimos;

    /**
     * Creates new form FormCadastro
     */
    public FormEmprestimos() throws SQLException {
        conexao = new Conexao();        
        stmt = conexao.getConexao().createStatement();
        
        tabelaEmprestimos = new TabelaEmprestimos(select());
                

        initComponents();
        popularSelect();
        popularSelect2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListagem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDevolver = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAluno = new javax.swing.JComboBox<String>();
        jComboBoxLivros = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableListagem.setModel(tabelaEmprestimos);
        jTableListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListagem);

        jLabel1.setText("Código:");

        jTextFieldCodigo.setEditable(false);

        jLabel2.setText("Data do Pedido");

        jTextFieldPedido.setEnabled(false);

        jLabel3.setText("Data para Devolver");

        jTextFieldDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDevolverActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("Aluno:");

        jLabel5.setText("Livro");

        jComboBoxAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextFieldCodigo)
                                            .addComponent(jLabel2)
                                            .addComponent(jTextFieldPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                            .addComponent(jTextFieldDevolver))
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPesquisar))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxLivros, javax.swing.GroupLayout.Alignment.LEADING, 0, 39, Short.MAX_VALUE)
                            .addComponent(jComboBoxAluno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListagemMouseClicked
        // TODO add your handling code here:
        jTextFieldCodigo.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 0).toString());
        jTextFieldPedido.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 1).toString());
        jTextFieldDevolver.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 2).toString());
        jComboBoxAluno.setSelectedItem(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 3).toString());
        jComboBoxLivros.setSelectedItem(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 4).toString());
        

        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableListagemMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que você deseja excluir esse registro?",
                "Exclusão de Cadastro",
                JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {

            delete(jTextFieldCodigo.getText());

            jTextFieldCodigo.setText("");
            jTextFieldPedido.setText("");
            jTextFieldDevolver.setText("");
            jComboBoxAluno.setSelectedItem("");
            jComboBoxLivros.setSelectedItem(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 4).toString());
            try {
                tabelaEmprestimos.setResult(select());
            } catch (SQLException ex) {
                Logger.getLogger(FormEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
            }

            jButtonExcluir.setEnabled(false);

        } //end i
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:

        jTextFieldCodigo.setText("");
        jTextFieldPedido.setText("");
        jTextFieldDevolver.setText("");
        jComboBoxAluno.setSelectedItem("");
        jComboBoxLivros.setSelectedItem("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldCodigo.getText().equals("")) {
            insert();
        } else {
            update();
        }
        
        
        try {
            tabelaEmprestimos.setResult(select());
                        

        } catch (SQLException ex) {
            Logger.getLogger(FormEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        jTextFieldCodigo.setText("");
        jTextFieldPedido.setText("");
        jTextFieldDevolver.setText("");
        jComboBoxAluno.setSelectedItem("");
        jComboBoxLivros.setSelectedItem("");
        

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        try {
            tabelaEmprestimos.setResult(search());
        } catch (SQLException ex) {
            Logger.getLogger(FormEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDevolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDevolverActionPerformed

    private void jComboBoxAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(FormEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormEmprestimos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public ResultSet select() {
        ResultSet rs = null;
        String SQL = "SELECT a.id, a.DT_ENTREGA, a.DT_DEVOLUCAO,"
                + " b.NOME, c.NOME_LIVRO FROM EMPRESTIMOS a, ALUNO b, LIVROS"
                + " c WHERE a.id_aluno = b.ID AND A.id_livro = c.ID";
        
        
        try {
            
            rs = stmt.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet search() {
        ResultSet rs = null;
        String SQL = "SELECT a.id, a.DT_ENTREGA, a.DT_DEVOLUCAO,"
                + " b.NOME, c.NOME_LIVRO FROM EMPRESTIMOS a, ALUNO b, LIVROS"
                + " c WHERE a.id_aluno = b.ID AND A.id_livro = c.ID AND b.nome like '%" + jTextFieldPesquisa.getText() + "%'";
        try {
            System.out.println(SQL);
            rs = stmt.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void delete(String id) {
        String SQL = "DELETE FROM emprestimos WHERE id = " + id;
        try {
            this.stmt.executeUpdate(SQL);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    public void insert() {
        String SQL = "insert into emprestimos(dt_devolucao, id_aluno, id_livro) "
                + "values(?,?,?)";
        try {
            PreparedStatement ps = this.conexao.getConexao().prepareStatement(SQL);

            ps.setString(1, jTextFieldDevolver.getText());
            ps.setString(2, (String) jComboBoxAluno.getSelectedItem());
            ps.setString(3, (String) jComboBoxLivros.getSelectedItem());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        String SQL = "update emprestimos set dt_devolucao=?, id_aluno=?, id_livro=? "
                + "where id = ?";
        try {

            PreparedStatement ps = this.conexao.getConexao().prepareStatement(SQL);

            ps.setString(1, jTextFieldDevolver.getText());
            ps.setString(2, (String) jComboBoxAluno.getSelectedItem());
            ps.setString(3, (String) jComboBoxLivros.getSelectedItem());
            ps.setString(4, jTextFieldCodigo.getText());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public ResultSet popularSelect() {
        ResultSet rs = null;
        String SQL = "select * from aluno";
        Vector aluno = new Vector();
        try {
            rs = stmt.executeQuery(SQL);
            
            while(rs.next()){
                
                aluno.add(rs.getString("id"));
               
            }
            System.out.println(aluno);
            
            jComboBoxAluno.setModel(new DefaultComboBoxModel(aluno));
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public ResultSet popularSelect2() {
        ResultSet rs = null;
        String SQL = "select * from livros";
        Vector aluno = new Vector();
        try {
            rs = stmt.executeQuery(SQL);
            
            while(rs.next()){
                
                aluno.add(rs.getString("id"));
               
            }
            System.out.println(aluno);
            
            jComboBoxLivros.setModel(new DefaultComboBoxModel(aluno));
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxAluno;
    private javax.swing.JComboBox<String> jComboBoxLivros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListagem;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDevolver;
    private javax.swing.JTextField jTextFieldPedido;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
