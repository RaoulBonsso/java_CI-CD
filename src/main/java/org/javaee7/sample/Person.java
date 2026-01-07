package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    // person name
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    // getter 
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}