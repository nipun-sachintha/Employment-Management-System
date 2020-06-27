package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dependents")
public class Dependents {

    private long dependentId; //dependent_id
    private String firstName;//first_name
    private String lastName;  // last_name
    private String relationship;
    private long id;


    public Dependents() {

    }

    public Dependents(String firstName, String lastName, String relationship,long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.id=id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getDependentId() {
        return dependentId;
    }
    public void setDependentId(long dependentId) {
        this.dependentId = dependentId;
    }


    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "relationship", nullable = false)
    public String getRelationship() {
        return relationship;
    }
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

}
