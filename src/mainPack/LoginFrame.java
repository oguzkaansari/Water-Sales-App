/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author touch
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonClose = new javax.swing.JButton();
        buttonMinimize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldMail = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        labelNotify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        jPanel1.setFocusable(false);

        buttonClose.setBackground(new java.awt.Color(255, 255, 255));
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/icon_close.png"))); // NOI18N
        buttonClose.setBorder(null);
        buttonClose.setBorderPainted(false);
        buttonClose.setContentAreaFilled(false);
        buttonClose.setFocusPainted(false);
        buttonClose.setFocusable(false);
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        buttonMinimize.setBackground(new java.awt.Color(255, 255, 255));
        buttonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/icon_minimize.png"))); // NOI18N
        buttonMinimize.setBorder(null);
        buttonMinimize.setBorderPainted(false);
        buttonMinimize.setContentAreaFilled(false);
        buttonMinimize.setMaximumSize(new java.awt.Dimension(16, 16));
        buttonMinimize.setMinimumSize(new java.awt.Dimension(16, 16));
        buttonMinimize.setPreferredSize(new java.awt.Dimension(16, 16));
        buttonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinimizeActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/small_water.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textFieldMail.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        textFieldMail.setForeground(new java.awt.Color(102, 102, 102));
        textFieldMail.setText("E-Mail");
        textFieldMail.setToolTipText("");
        textFieldMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMailFocusLost(evt);
            }
        });

        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        buttonLogin.setBackground(new java.awt.Color(51, 153, 255));
        buttonLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Giriş");
        buttonLogin.setOpaque(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        labelNotify.setForeground(new java.awt.Color(255, 51, 51));
        labelNotify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNotify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(buttonLogin)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(labelNotify)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed

        System.exit(0);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinimizeActionPerformed

        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_buttonMinimizeActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed

        String email = textFieldMail.getText().trim();
        char[] password = passwordField.getPassword();
        String stPass = String.valueOf(password).trim();

        if (email.equals("E-Mail") || email.isEmpty()) {
            labelNotify.setText("Lütfen E-Mail Giriniz!");
            textFieldMail.requestFocus();
        } else if (stPass.equals("password") || stPass.isEmpty()) {
            labelNotify.setText("Lütfen Şifre Giriniz!");
            passwordField.requestFocus();
        } else {

            buttonLogin.setEnabled(false);
            new Thread(new Runnable() {
                public void run() {
                    labelNotify.setText("Giriş Yapılıyor...");
                }
            }).start();

            new Thread(new Runnable() {
                public void run() {
                    DB db = new DB();
                    boolean loginStatus = db.adminLogin(email, stPass);
                    db.close();
                    if (loginStatus) {
                        DashboardFrame dashboardFrame = new DashboardFrame();
                        dashboardFrame.setVisible(true);
                        dispose();

                    } else {
                        labelNotify.setText("E-Mail ya da Şifre Hatalı!");
                        buttonLogin.setEnabled(true);
                    }
                }
            }).start();

        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void textFieldMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMailFocusGained

        if (textFieldMail.getText().trim().equals("E-Mail")) {
            textFieldMail.setText("");
            textFieldMail.setForeground(Color.DARK_GRAY);
            textFieldMail.setFont(new Font("Arial", Font.PLAIN, 12));
        }
    }//GEN-LAST:event_textFieldMailFocusGained

    private void textFieldMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMailFocusLost

        if (textFieldMail.getText().trim().equals("")) {
            textFieldMail.setText("E-Mail");
            textFieldMail.setForeground(Color.GRAY);
            textFieldMail.setFont(new Font("Tahoma", Font.ITALIC, 11));
        }
    }//GEN-LAST:event_textFieldMailFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained

        char[] password = passwordField.getPassword();
        if (String.valueOf(password).trim().equals("password")) {
            passwordField.setText("");
            passwordField.setForeground(Color.DARK_GRAY);
            passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost

        char[] password = passwordField.getPassword();

        if (String.valueOf(password).trim().equals("")) {
            passwordField.setText("password");
            passwordField.setForeground(Color.GRAY);
            passwordField.setFont(new Font("Tahoma", Font.ITALIC, 11));
        }
    }//GEN-LAST:event_passwordFieldFocusLost

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonMinimize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNotify;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldMail;
    // End of variables declaration//GEN-END:variables
}