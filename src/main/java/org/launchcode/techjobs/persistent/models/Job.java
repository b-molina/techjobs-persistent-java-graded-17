package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//Task 3: Update Job Model 1. Extend Abstract entity
@Entity
public class Job extends AbstractEntity{

    //Task 3: Update Job Model 1. Remove redundant info
    // @Id
   // @GeneratedValue
   // private int id;
    //private String name;

    //Task 3: Replace employer field, add many to one
    @ManyToOne
    private Employer employer;

    //Task 4: Refactor 1. Update Job.skills
    @ManyToMany
    private List<Skill> skills;
    //private String skills;


    public Job() {
    }

    // Initialize the id and value fields.
    // Task 4: Updated some skills to List skill
    public Job( Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }

//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
        }


}
