package com.cg.employee.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id

    private Integer employeeId;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "email_address", nullable = false)
    private String emailId;

    public Employee() {
    }

    public Employee( String name, String location, String emailId) {

        this.name = name;
        this.location = location;
        this.emailId = emailId;
    }


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}






