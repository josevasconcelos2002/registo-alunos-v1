package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("--Teste Estrutura de Menu--\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("|  [1] - Create Student       |\n");
            System.out.print("|  [2] - List Students        |\n");
            System.out.print("|  [3] - Remove Student       |\n");
            System.out.print("|  [4] - Search Student       |\n");
            System.out.print("|  [5] - Exit                 |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Option: ");

            int option = menu.nextInt();

            if (option == 5) {
                System.out.print("\nCya!");
                menu.close();
            }

            switch (option) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                    case 4:
                        break;

                default:
                    break;
            }
        }
    }
}