package com.perscholas.model;
import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table
public class Department implements Serializable  {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int did;
    private String dname;

    public Department(int did, String dname) {
        super();
        this.did = did;
        this.dname = dname;
    }
    public Department()
    {
    }
    public int getDid() {
        return this.did;
    }
    public void setDid(int did) {
        this.did = did;
    }
    public String getDname() {
        return this.dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
}

