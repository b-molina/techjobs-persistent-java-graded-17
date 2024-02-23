package org.launchcode.techjobs.persistent.models;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

//Task 2: 4. add entity
@Entity
public class Skill extends AbstractEntity {
    //Task 2: 3. Longer Description
@NotBlank
@Size(max = 255)
    private String description;

//Task 4
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs =new ArrayList<>();

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
   //no arg constructor
    public Skill() {
    }

    public Skill(String description, List<Job> jobs) {
        this.description = description;
        this.jobs=jobs;
        // List new job
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}