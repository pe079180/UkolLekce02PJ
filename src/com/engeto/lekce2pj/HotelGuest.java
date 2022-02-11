package com.engeto.lekce2pj;

import java.time.LocalDate;

public class HotelGuest {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public HotelGuest(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {

        return ( firstName + " " + lastName + ", born " + birthDate );
    }
}
