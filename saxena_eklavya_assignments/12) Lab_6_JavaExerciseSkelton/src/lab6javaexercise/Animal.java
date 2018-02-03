/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6javaexercise;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class Animal implements Comparable<Animal> {

    String name;
    int age;

    public static final Comparator<Animal> ASCENDING_COMPARATOR = new Comparator<Animal>() {
        // Overriding the compare method to sort the age
        public int compare(Animal d, Animal d1) {
            return d1.age - d.age;
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal o) {
        return (this.name).compareTo(o.name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.getName() + ":" + this.getAge();
    }

}
