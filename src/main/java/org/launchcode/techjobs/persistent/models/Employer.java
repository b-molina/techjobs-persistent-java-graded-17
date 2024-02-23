package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
//Task 2: 2. add entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(max = 255)

    //Task 2: 1. Add location
    private String location;

    //Task 3: Add Job field to employer
    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {
    }


}
