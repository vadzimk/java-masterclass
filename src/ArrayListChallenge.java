/* Create a program that implements a simple mobile phone with the following capabilities.
 Able to store, modify, remove and query contact names.
 You will want to create a separate class for Contacts (name and phone number).
 Create a master class (MobilePhone) that holds the ArrayList of Contacts
 The MobilePhone class has the functionality listed above.
 Add a menu of options that are available.
 Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
 and search/find contact.
 When adding or updating be sure to check if the contact already exists (use name)
 Be sure not to expose the inner workings of the Arraylist to MobilePhone
 e.g. no ints, no .get(i) etc
 MobilePhone should do everything with Contact objects only.

 */

import java.util.*;

//MobilePhone
public class ArrayListChallenge {

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();

        myPhone.addContact("Vadzim", "123");
        myPhone.addContact("Vadzim", "123");
        myPhone.printContactList();
        myPhone.searchContact("Vadzim");
        myPhone.updateContact("Vadzim", "456");
        myPhone.printContactList();
        myPhone.removeContact("Vadzim");
        myPhone.printContactList();
    }


}

class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<>();
    }


    public Contact searchContact(String name) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(contacts.get(i).toString());
            }
        }

        return null;
    }

    public void removeContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Contact " + name + " was removed");
            }
        }
    }

    public void updateContact(String name, String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getName() == name) {
                c.setPhoneNumber(phoneNumber);
                System.out.println("Contact " + name + " updated with phone number " + phoneNumber);
                return;
            }
        }
        System.out.println("Contact with such name was not found");
    }

    public void addContact(String name, String phoneNumber) {
        Contact toAdd = new Contact(name, phoneNumber);
        if (contacts.contains(toAdd)) {
            System.out.println("Such contact already exists");
        } else {
            this.contacts.add(toAdd);
            System.out.println(name + " has been added");
        }
    }

    public void printContactList() {
        if (contacts.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.print("List: ");
            for (Contact c : contacts) {
                System.out.print(c.toString() + ", ");
            }
            System.out.println();
        }
    }


    public void quit() {
        System.out.println("Good bye!");
        System.exit(0);
    }
}


class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + "\t" + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Contact o = (Contact) obj;
        return this.name.equalsIgnoreCase(o.getName());
    }
}