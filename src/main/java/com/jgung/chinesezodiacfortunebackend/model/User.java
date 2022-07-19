package com.jgung.chinesezodiacfortunebackend.model;

import com.jgung.chinesezodiacfortunebackend.service.Zodiac;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private Zodiac zodiac;

    public User() {

    }

    public User(String username, String password, String firstName, String lastName, Zodiac zodiac) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zodiac = zodiac;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Zodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }

    @Override
    public String toString() {
        return this.zodiac.toString() + " " + this.firstName + " " + this.lastName;
    }

}
