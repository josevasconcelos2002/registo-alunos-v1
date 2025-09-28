package org.example;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.example.ui.Menu;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRepository students = new StudentRepository();
        Menu menu = new Menu();

        while (true) {

            int option = menu.mainMenu();

            if (option == 5) {
                System.out.print("\nCya!");
                menu.getScanner().close();
                break;
            }

            switch (option) {
                case 1:
                    Student newStudent = menu.createStudentMenu();
                    students.addStudent(newStudent);
                    break;

                case 2:
                    students.listAllStudents();
                    break;

                case 3:
                    Integer IDtoRemove = menu.removeStudentMenu();
                    students.deleteStudent(IDtoRemove);
                    break;

                case 4:
                    Integer IDtoSearch = menu.removeStudentMenu();
                    students.searchStudent(IDtoSearch);
                    break;
                default:
                    break;
            }
        }
    }
}