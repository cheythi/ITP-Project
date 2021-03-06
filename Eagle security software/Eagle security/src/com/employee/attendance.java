/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;

import com.dbconnection.DBconnect;
import com.login.login;
import com.main.main;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**

/**
 *
 * @author cheythi
 */
public class attendance extends javax.swing.JFrame {

    /**
     * Creates new form uniforms
     */
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    public attendance() {
        initComponents();
        header.setBackground(new Color(0,0,0,180));
        logout.setBackground(new Color(255,51,0,180));
        menu.setBackground(new Color(255,51,0,180));
        addemp_pnl.setBackground(new Color(255,51,0,180));
        report_pnl.setBackground(new Color(255,51,0,180));
        att.setBackground(new Color(51,51,51,180));
        atable.setBackground(new Color(51,51,51,180));
        
          
        con = DBconnect.connect();
        
        //loadtable
         tableload();
        
    }
    
      public void tableload(){
    
        try{
        String sql ="SELECT  date,EID,present FROM  attendance";
        pst = (PreparedStatement) con.prepareStatement(sql);
        rs = (ResultSet) pst.executeQuery();
        
        
        atable.setModel(DbUtils.resultSetToTableModel((ResultSet) rs));
      
        }
        catch(SQLException e){
        
        }
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
        logout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addemp_pnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        report_pnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        att = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pbox = new javax.swing.JComboBox<>();
        aid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        atable = new javax.swing.JTable();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(null);

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Log out");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(logout);
        logout.setBounds(0, 800, 780, 50);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        background.add(header);
        header.setBounds(0, 0, 1550, 70);

        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Menu");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(menu);
        menu.setBounds(780, 800, 770, 50);

        addemp_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addemp_pnlMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Employee");

        javax.swing.GroupLayout addemp_pnlLayout = new javax.swing.GroupLayout(addemp_pnl);
        addemp_pnl.setLayout(addemp_pnlLayout);
        addemp_pnlLayout.setHorizontalGroup(
            addemp_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(addemp_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addemp_pnlLayout.createSequentialGroup()
                    .addContainerGap(313, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
        addemp_pnlLayout.setVerticalGroup(
            addemp_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(addemp_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addemp_pnlLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        background.add(addemp_pnl);
        addemp_pnl.setBounds(0, 70, 780, 70);

        report_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_pnlMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Report");

        javax.swing.GroupLayout report_pnlLayout = new javax.swing.GroupLayout(report_pnl);
        report_pnl.setLayout(report_pnlLayout);
        report_pnlLayout.setHorizontalGroup(
            report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, report_pnlLayout.createSequentialGroup()
                    .addContainerGap(330, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap(331, Short.MAX_VALUE)))
        );
        report_pnlLayout.setVerticalGroup(
            report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, report_pnlLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        background.add(report_pnl);
        report_pnl.setBounds(780, 70, 770, 70);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel5.setText("Attendance");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Date");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("EID");

        nic.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setText("ADD");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Present");

        pbox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select Status----", "Present", "Absent" }));
        pbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        aid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attLayout = new javax.swing.GroupLayout(att);
        att.setLayout(attLayout);
        attLayout.setHorizontalGroup(
            attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attLayout.createSequentialGroup()
                .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(attLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(pbox, javax.swing.GroupLayout.Alignment.LEADING, 0, 199, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(attLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel5)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        attLayout.setVerticalGroup(
            attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(attLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(65, 65, 65)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        background.add(att);
        att.setBounds(80, 200, 550, 530);

        atable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        atable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "EID", "Present"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        atable.setRowHeight(30);
        atable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(atable);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(770, 210, 590, 510);
        background.add(image);
        image.setBounds(0, 0, 1550, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addemp_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addemp_pnlMouseClicked
        add_employee e1 = new add_employee();
        e1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addemp_pnlMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        
        String date = aid.getText();
        String eeid=nic.getText();
        String eatt= pbox.getSelectedItem().toString();
        
        
       
        
        
       // PreparedStatement pst;
        
        try{
                String q = "INSERT INTO attendance (EID,date,present) values (?,?,?) ";
        
        pst = (PreparedStatement) con.prepareStatement(q);
        pst.setString(1, eeid);
       pst.setString(2, date);
        
        pst.setString(3, eatt);
        
            
        
        
          pst.executeUpdate();
        
        tableload();
        
        }
        catch(SQLException e){
            JOptionPane.showConfirmDialog(this,e);
        }
        
        aid.setText("");
        nic.setText("");
        pbox.setSelectedItem("--Select Gender--");
      
       
      
        
        
        
    }//GEN-LAST:event_addActionPerformed

    private void report_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_pnlMouseClicked
        employee_report er1 = new employee_report();
        er1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_report_pnlMouseClicked

    private void atableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atableMouseClicked
        // TODO add your handling code here:
        
               
        int r = atable.getSelectedRow();
        
    String date = atable.getValueAt(r, 0).toString();
    String enic = atable.getValueAt(r, 1).toString();
    String epresent = atable.getValueAt(r, 2).toString();
   
    
    aid.setText(date);
    nic.setText(enic);
    pbox.setSelectedItem(epresent);
   
        
    }//GEN-LAST:event_atableMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        login l1 = new login();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        main m1 = new main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

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
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new attendance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel addemp_pnl;
    private javax.swing.JTextField aid;
    private javax.swing.JTable atable;
    private javax.swing.JPanel att;
    private javax.swing.JPanel background;
    private javax.swing.JPanel header;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nic;
    private javax.swing.JComboBox<String> pbox;
    private javax.swing.JPanel report_pnl;
    // End of variables declaration//GEN-END:variables

   
}
