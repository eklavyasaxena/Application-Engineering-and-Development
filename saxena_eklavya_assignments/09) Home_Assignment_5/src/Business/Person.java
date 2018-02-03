/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author eklav
 */
public class Person {
    int personID;
    String firstName;
    String lastName;
    String email;
    
    static int count = 0;
    public Person(){
        count++;
        personID = count;
    }

    public int getPersonID() {
        return personID;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return String.valueOf(personID);
    }
}
