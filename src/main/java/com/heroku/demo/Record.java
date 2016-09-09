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

    private String animalName;
    
    private String adopterName;
    private String adopterSurname
    private String phonenumber;
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
   
    public String getAnimalName() {
        return animalname;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
     public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
     public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }
    
     public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }
    
 }
    
    
