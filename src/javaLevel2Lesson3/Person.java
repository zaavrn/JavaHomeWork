package javaLevel2Lesson3;

public class Person {
    private String phoneNumber;
    private String email;


    public Person (String phoneNumber, String email) {

        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
