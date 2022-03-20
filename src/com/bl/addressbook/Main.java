package com.bl.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    HashMap<String, Uc2> addressbook = new HashMap<>();

    public void addMultipleAddressBook() {
        while (true) {

            System.out.println("Enter selection \n1)To Access adress book\n2)exit and add");// add new if running for
            // fort
            int selection = sc.nextInt();
            switch (selection) {

                case 1:
                    System.out.println("enter adress book name");
                    String name = sc.next();
                    if (addressbook.containsKey(name)) {
                        System.out.println("entered addressbook name already present");
                    } else {
                        Uc2 addr = new Uc2();
                        addr.addMultiplePerson();
                        System.out.println("Welcome to addressbook" + name);
                        addressbook.put(name, addr);
                    }
                    break;

                case 2:
                    System.out.println("exiting");
                    System.exit(0);
            }

        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Welcome to the address book system");
        main.addMultipleAddressBook();
    }

}