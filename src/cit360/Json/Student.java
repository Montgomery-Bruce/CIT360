package cit360.Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;
    
    public Student(String firstName, String lastName, int age, boolean isMale){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }
    public Student() {}

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", isMale=" + isMale + '}';
    }
    
}

