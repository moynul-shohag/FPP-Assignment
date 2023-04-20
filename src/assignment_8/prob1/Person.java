package assignment_8.prob1;

import java.security.PublicKey;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    public Person(String last,String first,int a){
        lastName=last;
        firstName=first;
        age=a;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return "Person {LastName=" + lastName + " FirstName=" + firstName + " Age=" + age +"}";
    }
}
