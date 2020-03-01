package javaLevel1Lesson5;

import java.util.Scanner;

public class StaffSearch {

    private  static final int COUNT = 5;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Staff [] staffArray = new Staff[COUNT];

        staffArray [0] = new Staff( " Иван ","Федорович" ,"Иванов", "Системный администратор", "it@mail.ru", "7(919)235-69-70", 100000, 30);
        //staffArray [1] = new Staff( " Иван ","Федорович" ,"Иванов", "Системный администратор", "it@mail.ru", "7(919)235-69-70", 100000, 30);
        staffArray [1] = new Staff( "Иван", "Иванович", "Петров","Бухгалтер", "buh@mail.ru", "7(919)235-69-71", 60000, 45);
        staffArray [2] = new Staff(  "Иван", "Иванович","Сидоров", "Менеджер", "sii@mail.ru", "7(919)235-69-72", 80000, 41);
        staffArray [3] = new Staff(  "Ольга", "Петровна","Зайцева", "офис менеджер", "info@mail.ru", "7(919)235-69-73", 40000, 20);
        staffArray [4] = new Staff(  "Владимир", "Владимирович","Путин", "BOSS", "boss@mail.ru", "1(111)111-11-11", 10000000, 65);
//                staffArray[0].setSalary(-200000);
//                System.out.println(staffArray[0].equals(staffArray[1]))
//                System.out.println(staffArray[1]);
//                System.out.println(staffArray[0]);
        searchAge(staffArray);

    }

    private static void searchAge(Staff[] staffArray) {
        System.out.print("Веедите возраст сотрудника для отбора свыше лет:");
        int ageinput = scanner.nextInt();
        for (Staff x: staffArray ){
            if (x.getAge()>ageinput){
                x.info();
            }
        }
    }


}


