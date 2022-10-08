package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Tusk 1" + "\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +  firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("\n" + "Tusk 2" + "\n");

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        System.out.println("\n" + "Tusk 2" + "\n");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName1);






















    }

}
