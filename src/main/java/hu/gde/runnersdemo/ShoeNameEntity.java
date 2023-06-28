package hu.gde.runnersdemo;

import jakarta.persistence.*;

@Entity
public class ShoeNameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shoeNameId;
    private String shoeName;

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public long getShoeNameId() {
        return shoeNameId;
    }
}