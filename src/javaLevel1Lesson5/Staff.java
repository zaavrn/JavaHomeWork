package javaLevel1Lesson5;

public class User {

    private String firstName;
    private String midelName;
    private String surname;

    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public User(String firstName, String surname, String position, String email, String phoneNumber,int salary, int age){
        this.firstName = firstName;
        this.midelName = middeleName;
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
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void changePosition (String position){
       this.position=position;
        System.out.println(firstName+position);
    }





    public void info(){

        System.out.println("Имя: " + firstName + "; Фамилия: "+ surname + "; Должность: " + position + "; E-mail: " + email + "; Номер телефона: +" + phoneNumber + "; Заработная плата: " + salary + "; Возраст: " + age);
    }


    @Override
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
    }

    public static void main(String[] args) {
        User staff = new User( "Иван","Иванов Иван Федорович", "Системный администратор", "it@mail.ru", "7(919)235-69-70", 100000, 30);
       staff.info();
       staff.changePosition("boss");
       staff.info();




        /*User [] staffArray = new User[5];

        staffArray [0] = new User( "Иванов Иван Федорович", "Системный администратор", "it@mail.ru", "7(919)235-69-70", 100000, 30);
        staffArray [1] = new User( "Петров Иван Иванович", "Бухгалтер", "buh@mail.ru", "7(919)235-69-71", 100000, 45);
        staffArray [2] = new User( "Сидоров Иван Иванович", "Менеджер", "sii@mail.ru", "7(919)235-69-72", 100000, 41);
        staffArray [3] = new User( "Зайцева Ольга Петровна", "офис менеджер", "info@mail.ru", "7(919)235-69-73", 100000, 20);
        staffArray [4] = new User( "Путин Владимир Владимирович", "BOSS", "boss@mail.ru", "1(111)111-11-11", 1000000, 65);


        //User staff = new User ("Иванов Иван Федорович", "Программист", "info@mail.ru", "7(919)235-69-70", 100000, 30);

        staff.info();*/


    }


}
