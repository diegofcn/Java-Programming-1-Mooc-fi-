/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */

import java.util.Objects;
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
        
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
        
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
        
    }
    
    public Person shortest() {
        if(persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = new Person("", Integer.MAX_VALUE);
        for(Person person: persons) {
            if(person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
        
    }
    
    public Person take() {
        
        if(persons.isEmpty()) {
            return null;
            
        }
         Person shortestPerson = new Person("", Integer.MAX_VALUE);
        for (Person person : persons) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        persons.remove(shortestPerson);
        return shortestPerson;
        
    }
    
}
