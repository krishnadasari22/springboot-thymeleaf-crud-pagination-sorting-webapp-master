package com.springbootdemoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutorials")
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String empName;
    private String professor;
    private String department;

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String empName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String professor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String department() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", professor='" + professor + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
