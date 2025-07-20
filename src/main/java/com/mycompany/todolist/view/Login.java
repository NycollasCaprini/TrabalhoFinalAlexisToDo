/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.todolist.view;
import com.mycompany.todolist.model.Usuario;
import com.mycompany.todolist.util.ConfiguraComponentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    private final ConfiguraComponentes cf = new ConfiguraComponentes();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        configCampos();
        System.out.println(listaUsuarios.toString());
    }
    
    public Login(ArrayList<Usuario> listaUsuarios){
        initComponents();
        setResizable(false); 
        setLocationRelativeTo(null); 
        configCampos();
        this.listaUsuarios = listaUsuarios;
        System.out.println(listaUsuarios.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        psfSenha = new javax.swing.JPasswordField();
        btnLogar = new javax.swing.JButton();
        lblCliqueAqui = new javax.swing.JLabel();
        chbMostrarSenha = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        psfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        btnLogar.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        btnLogar.setText("Login");
        btnLogar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        lblCliqueAqui.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCliqueAqui.setForeground(new java.awt.Color(153, 0, 204));
        lblCliqueAqui.setText("Clique aqui para registrar");
        lblCliqueAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCliqueAquiMouseClicked(evt);
            }
        });

        chbMostrarSenha.setText("Mostrar Senha");
        chbMostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbMostrarSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblCliqueAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                        .addComponent(psfSenha))
                                    .addComponent(chbMostrarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(psfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chbMostrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCliqueAqui)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        for(int i = 0; i < listaUsuarios.size(); i++){
            
            String email = listaUsuarios.get(i).getEmail();
            String senha = listaUsuarios.get(i).getSenha();
            
            String emailDigitado = txtEmail.getText();
            String senhaDigitada = String.valueOf(psfSenha.getPassword());
            
            if(email.equals(emailDigitado) && senha.equals(senhaDigitada)){
                new Principal().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não coincidem");
            }
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    private void lblCliqueAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueAquiMouseClicked
        Cadastro cadastro = new Cadastro(listaUsuarios);
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCliqueAquiMouseClicked

    private void chbMostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbMostrarSenhaMouseClicked
        String senha = String.valueOf(psfSenha.getPassword());
        cf.configCheckBox(chbMostrarSenha, psfSenha, "Senha", senha);
    }//GEN-LAST:event_chbMostrarSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbMostrarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCliqueAqui;
    private javax.swing.JPasswordField psfSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
   
    private void configCampos(){
        cf.configCampoTexto(txtEmail, "Email");
        cf.configCampoSenha(psfSenha, "Senha");
        if (chbMostrarSenha.isSelected()){
            psfSenha.setEchoChar((char) 0 );
        }else{
            psfSenha.setEchoChar('*');
        }
    } //funcionando
}   

