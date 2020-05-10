/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salary;

/**
 *
 * @author User
 */
public class Employee {
    
    private int id;
    private String name;
    private int phone;
    private int salary;
    private String nic;

    public Employee(int id, String name, int phone, int salary, String nic) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.nic = nic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
    

   
    
    
}
