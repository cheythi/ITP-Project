/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;
import com.dbconnection.DBconnect;
import com.login.login;
import com.main.main;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cheythi
 */
public class employee_report extends javax.swing.JFrame {
    
    DBconnect con = new DBconnect();
    
    PreparedStatement pst = null;
     ResultSet rs=null;
    
    PreparedStatement pst1 = null;
    ResultSet rs1 =null;
    
    
    PreparedStatement pst2 = null;
    ResultSet rs2 =null;

    /**
     * Creates new form uniforms
     */
    public employee_report() {
        initComponents();
        header.setBackground(new Color(0,0,0,180));
        logout.setBackground(new Color(255,51,0,180));
        menu.setBackground(new Color(255,51,0,180));
        gun_pnl.setBackground(new Color(255,51,0,180));
        report_pnl.setBackground(new Color(255,51,0,180));
      
        
         this.setExtendedState(MAXIMIZED_BOTH);
    
    
    
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
        gun_pnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        report_pnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        absent = new javax.swing.JTextField();
        present = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        tn = new javax.swing.JTextField();
        pr = new javax.swing.JButton();
        eidd = new javax.swing.JTextField();
        se = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        preview = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        rnic = new javax.swing.JLabel();
        rtp = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
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

        gun_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gun_pnlMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Employee");

        javax.swing.GroupLayout gun_pnlLayout = new javax.swing.GroupLayout(gun_pnl);
        gun_pnl.setLayout(gun_pnlLayout);
        gun_pnlLayout.setHorizontalGroup(
            gun_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(gun_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gun_pnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        gun_pnlLayout.setVerticalGroup(
            gun_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(gun_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gun_pnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(gun_pnl);
        gun_pnl.setBounds(0, 70, 780, 30);

        report_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_pnlMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Attendance");

        javax.swing.GroupLayout report_pnlLayout = new javax.swing.GroupLayout(report_pnl);
        report_pnl.setLayout(report_pnlLayout);
        report_pnlLayout.setHorizontalGroup(
            report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(report_pnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        report_pnlLayout.setVerticalGroup(
            report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(report_pnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(report_pnl);
        report_pnl.setBounds(780, 70, 770, 30);

        cal.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        cal.setText("Calculate");
        cal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });
        background.add(cal);
        cal.setBounds(710, 520, 110, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Present");
        background.add(jLabel6);
        jLabel6.setBounds(140, 520, 120, 50);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Absent");
        background.add(jLabel7);
        jLabel7.setBounds(440, 520, 90, 50);

        absent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        absent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(absent);
        absent.setBounds(540, 520, 110, 60);

        present.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        present.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(present);
        present.setBounds(240, 520, 110, 60);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("First Name");
        background.add(jLabel8);
        jLabel8.setBounds(110, 250, 140, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Last Name");
        background.add(jLabel9);
        jLabel9.setBounds(110, 380, 130, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Telephone Number");
        background.add(jLabel10);
        jLabel10.setBounds(480, 380, 230, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("NIC");
        background.add(jLabel11);
        jLabel11.setBounds(480, 260, 70, 29);

        fn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(fn);
        fn.setBounds(110, 300, 260, 40);

        nic.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(nic);
        nic.setBounds(480, 300, 240, 40);

        ln.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ln.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(ln);
        ln.setBounds(110, 420, 270, 40);

        tn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(tn);
        tn.setBounds(480, 420, 250, 40);

        pr.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pr.setText("preview");
        pr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prActionPerformed(evt);
            }
        });
        background.add(pr);
        pr.setBounds(370, 700, 150, 50);

        eidd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        eidd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eidd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eiddActionPerformed(evt);
            }
        });
        background.add(eidd);
        eidd.setBounds(250, 180, 180, 40);

        se.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        se.setText("Search");
        se.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        background.add(se);
        se.setBounds(460, 180, 110, 40);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel12.setText("EID");
        background.add(jLabel12);
        jLabel12.setBounds(160, 180, 70, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setText("First name:-");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel13.setText("Last name:-");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel14.setText("NIC:-");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel15.setText("Telephone number:-");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel16.setText("Attendance");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel17.setText("Present:-");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Absent:-");

        fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rnic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rtp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel19.setText("Employee Report");

        javax.swing.GroupLayout previewLayout = new javax.swing.GroupLayout(preview);
        preview.setLayout(previewLayout);
        previewLayout.setHorizontalGroup(
            previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewLayout.createSequentialGroup()
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(previewLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, previewLayout.createSequentialGroup()
                                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rtp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(rnic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, previewLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(previewLayout.createSequentialGroup()
                                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(previewLayout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(previewLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        previewLayout.setVerticalGroup(
            previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(rtp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel16)
                .addGap(57, 57, 57)
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        background.add(preview);
        preview.setBounds(850, 150, 620, 610);
        background.add(image);
        image.setBounds(0, 60, 1550, 0);

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

    private void gun_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gun_pnlMouseClicked
        add_employee ae1 = new add_employee();
        ae1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gun_pnlMouseClicked

    private void report_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_pnlMouseClicked
        attendance a1 = new attendance();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_report_pnlMouseClicked

    private void eiddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eiddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eiddActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
           String seid = eidd.getText();
         
        
         if(eidd.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter Employee ID");
        }
        
         else{
       String sql ="SELECT  NIC, FIRSTNAME, LASTNAME,  TELEPHONE  from employee where EID='"+seid+"' ";
       
        try {
            pst = (PreparedStatement) con.connect().prepareStatement(sql);
            rs= pst.executeQuery(sql);
            
             if(rs.next()){
                 
           //String enic = rs.getString("NIC");    
           nic.setText(rs.getString("NIC"));
                 
           //String fname = rs.getString("FIRSTNAME");    
           fn.setText(rs.getString("FIRSTNAME"));
           
           //String lname = rs.getString("LASTNAME");    
           ln.setText(rs.getString("LASTNAME"));
           
           //String tele = rs.getString("TELEPHONE");    
           tn.setText(rs.getString("TELEPHONE"));
         }
             else{
              JOptionPane.showConfirmDialog(this,"wjdfdjfkdm");
        }
             
        } catch (SQLException ex) {
            Logger.getLogger(employee_report.class.getName()).log(Level.SEVERE, null, ex);
        }      
         }
    }//GEN-LAST:event_seActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
        // TODO add your handling code here:

        String eeid = String.valueOf(eidd.getText());
        // System.out.println(eeid);
        try {
            String query1 = "select count(EID) as epresent from attendance where present= 'Present' and EID='"+eeid+"' ";
            String query2 = "select count(EID) as eabsent from attendance where present = 'Absent' and EID='"+eeid+"'";

            PreparedStatement pst1;
            ResultSet rs1;
            pst1 = (PreparedStatement) con.connect().prepareStatement(query1);
            rs1=pst1.executeQuery();

            PreparedStatement pst2;
            ResultSet rs2;
            pst2 = (PreparedStatement) con.connect().prepareStatement(query2);
            rs2=pst2.executeQuery();

            if (rs1.next()) {

                present.setText(rs1.getString("epresent"));
                //present.setText(Integer.toString(a));
                //System.out.println("=============="+a);
            }

            if (rs2.next()) {
                if (rs2.getInt("eabsent") > 0) {
                    absent.setText(rs2.getString("eabsent"));
                }else{
                    absent.setText("0");
                }

                //absent.setText(Integer.toString(b));
            }

            // int epresent = Integer.parseInt(present.getText());
            // int eabsent = Integer.parseInt(absent.getText());

        } catch (Exception e) {

        }

    }//GEN-LAST:event_calActionPerformed

    private void prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prActionPerformed
        String p1 = fn.getText();
        String p2 = ln.getText();
        String p3 = nic.getText();
        String p4 = tn.getText();
        String p5 = present.getText();
        String p6 = absent.getText();
        
        
        fname.setText(p1);
        lname.setText(p2);
        rnic.setText(p3);
        rtp.setText(p4);
        p.setText(p5);
        a.setText(p6);
    }//GEN-LAST:event_prActionPerformed

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
            java.util.logging.Logger.getLogger(employee_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JTextField absent;
    private javax.swing.JPanel background;
    private javax.swing.JButton cal;
    private javax.swing.JTextField eidd;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel fname;
    private javax.swing.JPanel gun_pnl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel lname;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nic;
    private javax.swing.JLabel p;
    private javax.swing.JButton pr;
    private javax.swing.JTextField present;
    private javax.swing.JPanel preview;
    private javax.swing.JPanel report_pnl;
    private javax.swing.JLabel rnic;
    private javax.swing.JLabel rtp;
    private javax.swing.JButton se;
    private javax.swing.JTextField tn;
    // End of variables declaration//GEN-END:variables
}
