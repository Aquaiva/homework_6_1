package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
	String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        //task 2
        System.out.println("task 2");
        System.out.println("Данные Ф.И.О. сотрудника для запонения отчета — " + fullName.toUpperCase());
        //task 3
        System.out.println("task 3");
        String fullNameWithYo = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника — " + fullNameWithYo.replace("ё", "е"));

    }
}
