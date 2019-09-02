/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conf.Conexao;
;
import data.TabelaLivros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class FormCadastro extends javax.swing.JFrame {

    public Conexao conexao;    
    public static Statement stmt;
    
    private TabelaLivros tabelaLivros;

    /**
     * Creates new form FormCadastro
     */
    public FormCadastro() throws SQLException {
        conexao = new Conexao();        
        stmt = conexao.getConexao().createStatement();
        
        tabelaLivros = new TabelaLivros(select());
                

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListagem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jButtonEmprestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableListagem.setModel(tabelaLivros);
        jTableListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListagem);

        jLabel1.setText("Código:");

        jTextFieldCodigo.setEditable(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Categoria:");

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

        jLabel4.setText("Autor:");

        jButtonEmprestar.setText("Emprestar Livros");
        jButtonEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldCodigo)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldCategoria))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEmprestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEmprestar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListagemMouseClicked
        // TODO add your handling code here:
        jTextFieldCodigo.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 0).toString());
        jTextFieldNome.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 1).toString());
        jTextFieldCategoria.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 2).toString());
        jTextFieldAutor.setText(jTableListagem.getValueAt(jTableListagem.getSelectedRow(), 3).toString());
        
        
        
        
        

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
            jTextFieldNome.setText("");
            jTextFieldCategoria.setText("");
            jTextFieldAutor.setText("");
            try {
                tabelaLivros.setResult(select());
            } catch (SQLException ex) {
                Logger.getLogger(FormCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }

            jButtonExcluir.setEnabled(false);

        } //end i
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:

        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldAutor.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldCodigo.getText().equals("")) {
            insert();
        } else {
            update();
        }
        
        
        try {
            tabelaLivros.setResult(select());
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldAutor.setText("");

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        try {
            tabelaLivros.setResult(search());
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestarActionPerformed
        FormEmprestimos formEmprestimos = null;
        try {
            formEmprestimos = new FormEmprestimos();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        formEmprestimos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEmprestarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormCadastro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public ResultSet select() {
        ResultSet rs = null;
        String SQL = "select * from livros";
        try {
            rs = stmt.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet search() {
        ResultSet rs = null;
        String SQL = "select * from livros where nome_livro like '%" + jTextFieldPesquisa.getText() + "%'";
        try {
            rs = stmt.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void delete(String id) {
        String SQL = "DELETE FROM livros WHERE id = " + id;
        try {
            this.stmt.executeUpdate(SQL);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    
   

    public void insert() {
        String SQL = "insert into livros(nome_livro, categoria, autor) "
                + "values(?,?,?)";
        try {
            PreparedStatement ps = this.conexao.getConexao().prepareStatement(SQL);

            ps.setString(1, jTextFieldNome.getText());
            ps.setString(2, jTextFieldCategoria.getText());
            ps.setString(3,jTextFieldAutor.getText());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        String SQL = "update livros set nome_livro=?, categoria=?, autor=? "
                + "where id = ?";
        try {

            PreparedStatement ps = this.conexao.getConexao().prepareStatement(SQL);

            ps.setString(1, jTextFieldNome.getText());
            ps.setString(2, jTextFieldCategoria.getText());
            ps.setString(3, jTextFieldAutor.getText());
            ps.setString(4, jTextFieldCodigo.getText());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmprestar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListagem;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
