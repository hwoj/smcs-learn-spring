package com.example.smcslearn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fName;
    private String lName;
    private int gradYear;

    protected Tutor() {};

    public Tutor(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', gradYear='%d']",
                id, fName, lName, gradYear);
    }

}
