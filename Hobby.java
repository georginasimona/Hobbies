package com.siit.persons;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String country;
    private int frequency;
    private String hobby;

    private List<Address> address = new ArrayList<>();
    private List<String> hobbies = new ArrayList<>();
    List<String> detailsAboutHobbies = new ArrayList<>();


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getDetailsAboutHobbies() {
        return detailsAboutHobbies;
    }

    public void setDetailsAboutHobbies(List<String> detailsAboutHobbies) {
        this.detailsAboutHobbies = detailsAboutHobbies;
    }



    public Hobby(String hobby, int frequency, Address address) {
        this.hobby = hobby;
        this.frequency = frequency;


    }
    @Override
    public String toString() {
        return "Hobby{" +
                "country='" + country + '\'' +
                ", frequency=" + frequency +
                ", hobby='" + hobby + '\'' +
                ", address=" + address +
                ", hobbies=" + hobbies +
                ", detailsAboutHobbies=" + detailsAboutHobbies +
                '}';
    }
}
