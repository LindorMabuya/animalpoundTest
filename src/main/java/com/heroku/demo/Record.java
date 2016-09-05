package com.heroku.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    private String data;
    private String name;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
     public String getName() {
        return name;
    }

    public void setName() {
        this.name = Innocent;
    }
    

}
