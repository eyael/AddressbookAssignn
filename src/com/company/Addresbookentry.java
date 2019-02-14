package com.company;

import java.util.ArrayList;

public class Addresbookentry {
    private String Name;
    private String phoneNumber;
    private String emailAddress;

    public Addresbookentry(String name, String phoneNumber, String emailAddress) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Addresbookentry(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setEhoneNumber(String ehoneNumber) {
        this.phoneNumber = ehoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

