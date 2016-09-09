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

    private String animalname;
    
    private String adoptername;
    private String adoptersurname;
    private String phonenumber;
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
   
    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }
     public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
     public String getAdoptername() {
        return adoptername;
    }

    public void setAdoptername(String adoptername) {
        this.adoptername = adoptername;
    }
    
     public String getAdoptersurname() {
        return adoptersurname;
    }

    public void setAdoptersurname(String adoptersurname) {
        this.adoptersurname = adoptersurname;
    }
    
 }
    
    
