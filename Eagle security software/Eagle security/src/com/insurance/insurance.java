/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insurance;

import com.dbconnection.DBconnect;
import com.login.login;
import com.main.main;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author cheythi
 */
public class insurance extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form insurance
     */
    public insurance() {
        initComponents();
        logout_btn.setBackground(new Color(255,51,0,180));
        main_btn.setBackground(new Color(255,51,0,180));
        header_panel.setBackground(new Color(0,0,0,150));
        
        con = DBconnect.connect();
        
        insurancetable();
        employeeload();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void insurancetable(){
    
       try{ 
           
           String el = " SELECT * FROM insurance";
        
        pst= (PreparedStatement) con.prepareStatement(el);
        rs= (ResultSet) pst.executeQuery();
        
        itable.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){
           int showConfirmDialog = JOptionPane.showConfirmDialog(null,e);
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

        header_panel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        minimize_btn = new javax.swing.JLabel();
        middle_panel = new javax.swing.JPanel();
        iid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employee = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        blood = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        sick = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        itable = new javax.swing.JTable();
        add = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        logout_btn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        main_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        header_panel.setBackground(new java.awt.Color(51, 102, 255));

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setText("INSURANCE");

        close_btn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        close_btn.setForeground(new java.awt.Color(51, 51, 51));
        close_btn.setText("X");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });

        minimize_btn.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        minimize_btn.setForeground(new java.awt.Color(51, 51, 51));
        minimize_btn.setText("-");
        minimize_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimize_btnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout header_panelLayout = new javax.swing.GroupLayout(header_panel);
        header_panel.setLayout(header_panelLayout);
        header_panelLayout.setHorizontalGroup(
            header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name)
                .addGap(581, 581, 581)
                .addComponent(minimize_btn)
                .addGap(18, 18, 18)
                .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        header_panelLayout.setVerticalGroup(
            header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_panelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(name)
                .addContainerGap())
            .addGroup(header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(close_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        middle_panel.setBackground(new java.awt.Color(204, 204, 204));
        middle_panel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        middle_panel.setLayout(null);
        middle_panel.add(iid);
        iid.setBounds(200, 90, 50, 20);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("INSURANCE ID");
        middle_panel.add(jLabel2);
        jLabel2.setBounds(80, 90, 110, 20);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("HEIGHT");
        middle_panel.add(jLabel3);
        jLabel3.setBounds(80, 220, 80, 15);

        employee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--employee------" }));
        middle_panel.add(employee);
        employee.setBounds(200, 150, 160, 30);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("WEIGHT");
        middle_panel.add(jLabel6);
        jLabel6.setBounds(80, 280, 80, 20);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("AGE");
        middle_panel.add(jLabel7);
        jLabel7.setBounds(80, 340, 70, 20);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("SICKNESS");
        middle_panel.add(jLabel8);
        jLabel8.setBounds(80, 420, 80, 20);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("BLOOD TYPE");
        middle_panel.add(jLabel9);
        jLabel9.setBounds(80, 490, 100, 20);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("EMPLOYEE");
        middle_panel.add(jLabel10);
        jLabel10.setBounds(80, 160, 90, 15);

        blood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloodMouseClicked(evt);
            }
        });
        middle_panel.add(blood);
        blood.setBounds(200, 480, 160, 30);

        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightKeyPressed(evt);
            }
        });
        middle_panel.add(height);
        height.setBounds(200, 210, 160, 30);

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        middle_panel.add(age);
        age.setBounds(200, 330, 160, 30);
        middle_panel.add(sick);
        sick.setBounds(200, 410, 160, 30);

        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weightKeyPressed(evt);
            }
        });
        middle_panel.add(weight);
        weight.setBounds(200, 270, 160, 30);

        itable.setBackground(new java.awt.Color(51, 102, 255));
        itable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(itable);

        middle_panel.add(jScrollPane2);
        jScrollPane2.setBounds(420, 130, 860, 440);

        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addMouseReleased(evt);
            }
        });

        jLabel1.setText("ADD");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        middle_panel.add(add);
        add.setBounds(80, 600, 100, 50);

        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteMouseReleased(evt);
            }
        });

        jLabel12.setText("DELETE");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        middle_panel.add(delete);
        delete.setBounds(370, 600, 100, 50);

        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateMouseReleased(evt);
            }
        });

        jLabel11.setText("UPDATE");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        middle_panel.add(update);
        update.setBounds(230, 600, 100, 50);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\cheythi\\Desktop\\Eagle security software\\background\\security.jpg")); // NOI18N
        middle_panel.add(background);
        background.setBounds(0, -10, 1320, 680);

        logout_btn.setBackground(new java.awt.Color(102, 102, 102));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_btnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Log out");

        javax.swing.GroupLayout logout_btnLayout = new javax.swing.GroupLayout(logout_btn);
        logout_btn.setLayout(logout_btnLayout);
        logout_btnLayout.setHorizontalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logout_btnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        logout_btnLayout.setVerticalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logout_btnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        main_btn.setBackground(new java.awt.Color(102, 102, 102));
        main_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_btnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                main_btnMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("MENU");

        javax.swing.GroupLayout main_btnLayout = new javax.swing.GroupLayout(main_btn);
        main_btn.setLayout(main_btnLayout);
        main_btnLayout.setHorizontalGroup(
            main_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(main_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(main_btnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        main_btnLayout.setVerticalGroup(
            main_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(main_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(main_btnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(middle_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(middle_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_btnMouseClicked

    private void main_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_btnMousePressed

    }//GEN-LAST:event_main_btnMousePressed

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        add.setBackground(new Color(51,102,255));
        
        try{
        String sl = "Insert into insurance (nic,height,weight,age,sickness,blodtype) values (?,?,?,?,?,?)";

        pst = (PreparedStatement) con.prepareStatement(sl);
        
        pst.setString(1,employee.getSelectedItem().toString());
        pst.setString(2,height.getText());
        pst.setString(3,weight.getText());
        pst.setString(4,age.getText());
        pst.setString(5,sick.getText());
        pst.setString(6,blood.getText());
        
        pst.execute();
        insurancetable();
        }
        catch(Exception e){
             int showConfirmDialog = JOptionPane.showConfirmDialog(null,e);
        }
       
        employee.setSelectedItem("--employee------");
        height.setText("");
        weight.setText("");
        age.setText("");
        sick.setText("");
        blood.setText("");
        
    }//GEN-LAST:event_addMousePressed

    private void addMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseReleased
        add.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_addMouseReleased

    private void itableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itableMousePressed
        
        int i = itable.getSelectedRow();
        
        String id = itable.getValueAt(i, 0).toString();
        String enic = itable.getValueAt(i, 1).toString();
        String he = itable.getValueAt(i, 2).toString();
        String we = itable.getValueAt(i, 3).toString();
        String eage = itable.getValueAt(i, 4).toString();
        String sk = itable.getValueAt(i, 5).toString();
        String bt = itable.getValueAt(i, 6).toString();
      
        iid.setText(id);
        employee.setSelectedItem(enic);
        height.setText(he);
        weight.setText(we);
        age.setText(eage);
        sick.setText(sk);
        blood.setText(bt);
    }//GEN-LAST:event_itableMousePressed

    private void updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMousePressed
        update.setBackground(new Color(51,102,255));
        
         int i = JOptionPane.showConfirmDialog(null,"Do you really want to update");
        
        if(i == 0){
             String aiid = iid.getText().toString();
             String inic = employee.getSelectedItem().toString();
             String he = height.getText();
             String we = weight.getText().toString();
             String eage = age.getText().toString();
             String sk= sick.getText().toString();
             String bt = blood.getText().toString();
             
             String up = "UPDATE  insurance SET  nic = '"+ inic +"' ,height = '"+ he +"' ,weight = '"+ we +"' , age = '"+ eage +"',sickness = '"+ sk +"', blodtype = '"+ bt +"' where i_id = '"+ aiid +"'";
             try{
                 pst = (PreparedStatement) con.prepareStatement(up);
                 pst.execute();
           
                 insurancetable();
             }catch(Exception e){
                 int showConfirmDialog = JOptionPane.showConfirmDialog(null,e);
             }
        }
        employee.setSelectedItem("--employee------");
        height.setText("");
        weight.setText("");
        age.setText("");
        sick.setText("");
        blood.setText("");
    }//GEN-LAST:event_updateMousePressed

    private void updateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseReleased
         update.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_updateMouseReleased

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        delete.setBackground(new Color(51,102,255));
        
         int d = JOptionPane.showConfirmDialog(null,"Do you really want to delete?");
        
        if(d == 0){
            String id = iid.getText();
            
            String del = "DELETE from insurance where i_id = '"+ id +"'";
            try {
                pst = (PreparedStatement) con.prepareStatement(del);
                pst.execute();
                
                insurancetable();
            } catch (Exception e) {
               int log = JOptionPane.showConfirmDialog(null,e);
            }
        }
        employee.setSelectedItem("--employee------");
        height.setText("");
        weight.setText("");
        age.setText("");
        sick.setText("");
        blood.setText("");
    }//GEN-LAST:event_deleteMousePressed

    private void deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseReleased
        delete.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_deleteMouseReleased

    private void minimize_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btnMousePressed
       this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minimize_btnMousePressed

    private void main_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_btnMouseClicked
        main m1 = new main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_main_btnMouseClicked

    private void logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseClicked
        login l1 = new login();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_btnMouseClicked

    private void heightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyPressed
        String eid = height.getText();
          
          
        int length = eid.length();
          
          
        char c = evt.getKeyChar();
          
          
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
              
            if(length<3){
                 
                height.setEditable(true);
            }
            else{
                  height.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                height.setEditable(true);
            }
            else{
                  height.setEditable(false);
          }
        }
    }//GEN-LAST:event_heightKeyPressed

    private void weightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyPressed
        String eid = weight.getText();
          
          
        int length = eid.length();
          
          
        char c = evt.getKeyChar();
          
          
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
              
            if(length<3){
                 
                weight.setEditable(true);
            }
            else{
                  weight.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                weight.setEditable(true);
            }
            else{
                  weight.setEditable(false);
          }
        }
    }//GEN-LAST:event_weightKeyPressed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        String eid = age.getText();
          
          
        int length = eid.length();
          
          
        char c = evt.getKeyChar();
          
          
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
              
            if(length<2){
                 
                age.setEditable(true);
            }
            else{
                  age.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                age.setEditable(true);
            }
            else{
                  age.setEditable(false);
          }
        }
    }//GEN-LAST:event_ageKeyPressed

    private void bloodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodMouseClicked
        
    }//GEN-LAST:event_bloodMouseClicked

    
    private void employeeload(){
        try{
            String ec = "select NIC from employee"; 
            pst = (PreparedStatement) con.prepareStatement(ec);
            rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String nic = rs.getString("NIC");
                employee.addItem(nic);
              
            }
       }catch(Exception e){
            
        }
    }
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
            java.util.logging.Logger.getLogger(insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insurance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JTextField age;
    private javax.swing.JLabel background;
    private javax.swing.JTextField blood;
    private javax.swing.JLabel close_btn;
    private javax.swing.JPanel delete;
    private javax.swing.JComboBox<String> employee;
    private javax.swing.JPanel header_panel;
    private javax.swing.JTextField height;
    private javax.swing.JLabel iid;
    private javax.swing.JTable itable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel logout_btn;
    private javax.swing.JPanel main_btn;
    private javax.swing.JPanel middle_panel;
    private javax.swing.JLabel minimize_btn;
    private javax.swing.JLabel name;
    private javax.swing.JTextField sick;
    private javax.swing.JPanel update;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}