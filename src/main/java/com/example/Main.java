package com.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Programmer();
        employee.comToWork();

        System.out.println();

        Employee manager = new Manager();
        manager.comToWork();

        System.out.println();
    }
}
