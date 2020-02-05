package javaLevel1Lesson5;

import java.util.Objects;

public class Staff {

    private String firstName;
    private String middleName;
    private String surname;

    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Staff(String firstName, String middleName, String surname, String position, String email, String phoneNumber, int salary, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public int getSalary() {
        return salary;
          }

    public void setSalary(int salary) {
        if (salary>0){
            this.salary = salary;
        }else{
            System.out.println("Зарплата должна быть больше 0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void info(){

        System.out.println("Имя: " + firstName + "; Отчество: " + middleName + "; Фамилия: "+ surname + "; Должность: " + position + "; E-mail: " + email + "; Номер телефона: +" + phoneNumber + "; Заработная плата: " + salary + "; Возраст: " + age);
    }


    /*@Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return salary == staff.salary &&
                age == staff.age &&
                firstName.equals(staff.firstName) &&
                middleName.equals(staff.middleName) &&
                surname.equals(staff.surname) &&
                position.equals(staff.position) &&
                email.equals(staff.email) &&
                phoneNumber.equals(staff.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, surname, position, email, phoneNumber, salary, age);
    }
}
