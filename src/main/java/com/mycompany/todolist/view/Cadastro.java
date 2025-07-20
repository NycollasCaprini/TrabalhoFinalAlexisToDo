/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.todolist.view;


import com.mycompany.todolist.model.Usuario;
import com.mycompany.todolist.util.ConfiguraComponentes;
import com.mycompany.todolist.util.ValidaCampos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private ConfiguraComponentes cf = new ConfiguraComponentes();
    private ValidaCampos validaCampos = new ValidaCampos();
    
    public Cadastro() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        configCampos();
        System.out.println(listaUsuarios.toString());
    }
    
    public Cadastro(ArrayList<Usuario> listaUsuarios) {
        initComponents();
        configCampos();
        setLocationRelativeTo(this);
        setResizable(false);
        this.listaUsuarios = listaUsuarios;
        System.out.println(listaUsuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        psfSenha = new javax.swing.JPasswordField();
        psfConfirmarSenha = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNomeCompleto = new javax.swing.JTextField();
        cbxMostrarSenha = new javax.swing.JCheckBox();
        cbxMostrarConfirmar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro");

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        psfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        psfConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirmar Senha"));

        btnSalvar.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNomeCompleto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome Completo"));

        cbxMostrarSenha.setText("Mostrar Senha");
        cbxMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMostrarSenhaActionPerformed(evt);
            }
        });

        cbxMostrarConfirmar.setText("Mostrar Senha");
        cbxMostrarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMostrarConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(psfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(psfConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxMostrarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxMostrarConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMostrarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMostrarConfirmar))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(validaCampos()){
            Usuario usuario = retornaUsuario();
            listaUsuarios.add(usuario);
            System.out.println(listaUsuarios.toString());
            new Login(listaUsuarios).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMostrarSenhaActionPerformed
        String senha =  String.valueOf(psfSenha.getPassword());
        cf.configCheckBox(cbxMostrarSenha, psfSenha, "Senha", senha );
    }//GEN-LAST:event_cbxMostrarSenhaActionPerformed

    private void cbxMostrarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMostrarConfirmarActionPerformed
        String senha =  String.valueOf(psfSenha.getPassword());
        cf.configCheckBox(cbxMostrarConfirmar, psfConfirmarSenha, "Senha", senha );
    }//GEN-LAST:event_cbxMostrarConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbxMostrarConfirmar;
    private javax.swing.JCheckBox cbxMostrarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField psfConfirmarSenha;
    private javax.swing.JPasswordField psfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeCompleto;
    // End of variables declaration//GEN-END:variables

    private void configCampos() {
        cf.configCampoTexto(txtNomeCompleto, "Nome Completo");
        cf.configCampoTexto(txtEmail, "Email"); 
        cf.configCampoSenha(psfSenha, "Senha");
        cf.configCampoSenha(psfConfirmarSenha, "Confirmar senha");
    } //funcionando
    
    private Usuario retornaUsuario() {
        String email = txtEmail.getText();
        String nome = txtNomeCompleto.getText();
        
        String senha = String.valueOf(psfSenha.getPassword());
        String confirmarSenha = String.valueOf(psfConfirmarSenha.getPassword());

        if (!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog(this, "Erro: as senhas não coincidem!");
            return null; 
        }
        
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setNomeCompleto(nome);

        return usuario;
    }  //funcionando  

    private boolean validaCampos(){
        boolean resultado =  true;
        
        if(validaCampos.validaTextField(txtNomeCompleto, "Nome Completo")) resultado = false;
        if(validaCampos.validaTextField(txtEmail, "Email")) resultado = false;
        if(validaCampos.validaPasswordField(psfSenha, "Senha")) resultado = false;
        if(validaCampos.validaPasswordField(psfConfirmarSenha, "Confirmar senha")) resultado = false;
        
        String senha = String.valueOf(psfSenha.getPassword());
        String confirmarSenha = String.valueOf(psfConfirmarSenha.getPassword());
        
        if(!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem!");
            resultado = false;
        }
        
        return resultado;
    } //funcionando
 
}
