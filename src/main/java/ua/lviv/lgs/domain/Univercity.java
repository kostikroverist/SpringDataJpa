package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private int numberOfInstitutes;

    @Column
    private int amountOfStudents;

    @Column
    private String universityAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfInstitutes() {
        return numberOfInstitutes;
    }

    public void setNumberOfInstitutes(int numberOfInstitutes) {
        this.numberOfInstitutes = numberOfInstitutes;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "Univercity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfInstitutes=" + numberOfInstitutes +
                ", amountOfStudents=" + amountOfStudents +
                ", universityAddress='" + universityAddress + '\'' +
                '}';
    }
}
