/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import com.main.main;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author cheythi
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        background = new javax.swing.JPanel();
        company3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        un_lbl = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        login_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(null);

        company3.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        company3.setForeground(new java.awt.Color(204, 204, 204));
        company3.setText("Eagle Security (PVT) LTD ");
        background.add(company3);
        company3.setBounds(160, 150, 430, 90);

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cheythi\\Desktop\\Eagle security software\\background\\logo1.png")); // NOI18N
        background.add(logo);
        logo.setBounds(300, 60, 90, 90);

        un_lbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        un_lbl.setForeground(new java.awt.Color(204, 204, 204));
        un_lbl.setText("User name");
        background.add(un_lbl);
        un_lbl.setBounds(190, 270, 90, 21);

        Password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setText("Password");
        background.add(Password);
        Password.setBounds(190, 330, 80, 13);

        un.setBackground(new java.awt.Color(204, 204, 204));
        un.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        un.setBorder(null);
        background.add(un);
        un.setBounds(310, 269, 130, 30);

        pwd.setBackground(new java.awt.Color(204, 204, 204));
        pwd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pwd.setBorder(null);
        background.add(pwd);
        pwd.setBounds(310, 320, 130, 30);

        login_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_pnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_pnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_pnlMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Log in");

        javax.swing.GroupLayout login_pnlLayout = new javax.swing.GroupLayout(login_pnl);
        login_pnl.setLayout(login_pnlLayout);
        login_pnlLayout.setHorizontalGroup(
            login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_pnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        login_pnlLayout.setVerticalGroup(
            login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(login_pnl);
        login_pnl.setBounds(500, 310, 95, 40);

        background_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\cheythi\\Desktop\\Eagle security software\\background\\login.png")); // NOI18N
        background.add(background_img);
        background_img.setBounds(-10, -10, 730, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_pnlMouseClicked
       
        if(un.getText().equals("admin") && pwd.getText().equals("1234")){
            main m1 = new main();
            m1.setVisible(true);
            this.dispose();
       }
        else{
            JOptionPane.showMessageDialog(this,"Invalid access.Try again!");
            un.setText("");
            pwd.setText("");
        }
        
    }//GEN-LAST:event_login_pnlMouseClicked

    private void login_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_pnlMouseEntered
        login_pnl.setBackground(new Color(204,255,51));
    }//GEN-LAST:event_login_pnlMouseEntered

    private void login_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_pnlMouseExited
        login_pnl.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_login_pnlMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JPanel background;
    private javax.swing.JLabel background_img;
    private javax.swing.JLabel company3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel login_pnl;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField un;
    private javax.swing.JLabel un_lbl;
    // End of variables declaration//GEN-END:variables
}