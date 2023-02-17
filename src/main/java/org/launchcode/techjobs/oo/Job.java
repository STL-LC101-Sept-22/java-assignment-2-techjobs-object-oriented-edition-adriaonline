package org.launchcode.techjobs.oo;

import java.util.Objects;

import static org.junit.Assert.*;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
        }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
//        this();
//        this.name = name;
//        this.employer = employer;
//        this.location = location;
//        this.positionType = positionType;
//        this.coreCompetency = coreCompetency;

//        if (getName().equals("")) {
//            return "Data not available";
//        } else if (getEmployer().equals("")) {
//            return "Data not available";
//        } else { return employer;}

        return "\n" +
                "ID: " + (getId() != 0 ? getId() : "Data not available") + "\n" +
                "Name: " + (getName().equals("") ? "Data not available" : name) + "\n" +
//                "Name: " + name + "\n" +
                "Employer: " + (getEmployer().getValue().equals("") ? "Data not available" : employer) + "\n" +
                "Location: " + (getLocation().getValue().equals("") ? "Data not available" : location) + "\n" +
                "Position Type: " + (getPositionType().getValue().equals("") ? "Data not available" : positionType) + "\n" +
                "Core Competency: " + (getCoreCompetency().getValue().equals("") ? "Data not available" : coreCompetency) + "\n";
//                "\n"; // the directions said it wanted a line after but the test doesn't want it there *shrug*

//        if (getId().THIS IS INT("")) {
//            System.out.println("ID: Data not available");
//        }


//
//        if (assertNull(testJob.getEmployer())) {
//            System.out.println("Employer: Data not available");
//        }
//
//        if (assertNull(testJob.getLocation())) {
//            System.out.println("Location: Data not available");
//        }
//
//        if (assertNull(testJob.getPositionType())) {
//            System.out.println("Position Type: Data not available");
//        }
//
//        if (assertNull(testJob.getCoreCompetency())) {
//            System.out.println("Core Competency: Data not available");
//        }
    }
}