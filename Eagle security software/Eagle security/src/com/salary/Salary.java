/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salary;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Salary {
    
    private int salary;
    private int eid;
    private String nic;
    private LocalDate date;

    public Salary() {
    }

    public Salary(int salary, int eid, String nic) {
        this.salary = salary;
        this.eid = eid;
        this.nic = nic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
    
}
