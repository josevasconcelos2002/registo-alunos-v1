package org.example.ui;

import org.example.model.Student;

import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu()
    {
        this.sc = new Scanner(System.in);
    }

    public Scanner getScanner()
    {
        return this.sc;
    }

    public int mainMenu()
    {
        int option;
        System.out.print("--Menu--\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("|  [1] - Create Student       |\n");
        System.out.print("|  [2] - List Students        |\n");
        System.out.print("|  [3] - Remove Student       |\n");
        System.out.print("|  [4] - Search Student       |\n");
        System.out.print("|  [5] - Exit                 |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Option: ");

        option = this.sc.nextInt();
        return option;
    }

    public Student createStudentMenu()
    {
        System.out.print("--Create Student--\n\n");

        System.out.println("ID: ");
        Integer ID = this.sc.nextInt();

        System.out.println("Name: ");
        String name = this.sc.next();

        System.out.println("Age: ");
        Integer age = this.sc.nextInt();

        return new Student(ID, name, age);
    }

    public Integer removeStudentMenu()
    {
        System.out.print("--Remove Student--\n\n");
        System.out.println("ID: ");

        return this.sc.nextInt();
    }

    public Integer searchStudentMenu()
    {
        System.out.print("--Search Student--\n\n");
        System.out.println("ID: ");

        return this.sc.nextInt();
    }
}
