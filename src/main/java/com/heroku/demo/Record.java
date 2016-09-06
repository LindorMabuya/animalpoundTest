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
    private String animalname;
    private String personname;
    private String personsurname;
    private String phonenumber;
  
    public String animalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }
    
     public String getPersonname() {
        return personname;
    }

    public void setPersonName(String personname) {
        this.personname = personname;
    }
    
}
    
    
