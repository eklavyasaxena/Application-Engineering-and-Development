/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonPackage;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class PersonDirectory {
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
        personList.remove(person);
                
    }
    
    public Person searchPerson(int personID){
        for(Person p : personList){
            if(personID == p.getPersonID()){
                return p;
            }
        }
        return null;
    }
}
