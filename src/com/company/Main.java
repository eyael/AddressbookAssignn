package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addresbookentry myobj = new Addresbookentry();
        String tryagain="";
        ArrayList<Addresbookentry> addbook = new ArrayList<>();

        do {
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();

            System.out.println("Please enter your emailaddress: ");
            String emailaddress = sc.nextLine();

            System.out.println("Please enter your number: ");
            String phonenumber = sc.nextLine();


            addbook.add(new Addresbookentry(name, emailaddress, phonenumber));
            System.out.println("Do you want to enter another contact");
            tryagain=sc.nextLine();

        }while(!tryagain.equalsIgnoreCase("no"));

            for (Addresbookentry address : addbook) {
                System.out.println("Name:" + address.getName() + "Emaill:" + address.getEmailAddress() + "Phonenumber:" + address.getphoneNumber());
            }



    }
}



