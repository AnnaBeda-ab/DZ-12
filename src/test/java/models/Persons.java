package models;

import com.opencsv.bean.CsvBindByName;

public class Persons {

    @CsvBindByName(column = "firstName")
    private String firstName;
    @CsvBindByName(column = "lastName")
    private String lastName;
    @CsvBindByName(column = "age")
    private int age;
    @CsvBindByName(column = "partner")
    private boolean partner;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }
}
