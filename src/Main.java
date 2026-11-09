import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Меню лабораторной работы №2");
            System.out.println("1: сумма ряда");
            System.out.println("2: приближённое значение sin(X)");
            System.out.println("3: проверка числа на простоту");
            System.out.println("4: расстояние между точками в 3D");
            System.out.println("0: выход");

            int choice = readInt(scanner, "Выберите пункт меню: ");

            if (choice == 1) {
                task1.run(scanner);
            } else if (choice == 2) {
                task2.run(scanner);
            } else if (choice == 3) {
                task3.run(scanner);
            } else if (choice == 4) {
                task4.run(scanner);
            } else if (choice == 0) {
                running = false;
                System.out.println("Программа завершена.");
            } else {
                System.out.println("Такого пункта нет. Выберите число от 0 до 4.");
            }
        }
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("Ошибка: введите целое число.");
            scanner.next();
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (!Double.isNaN(value) && !Double.isInfinite(value)) {
                    return value;
                }
            } else {
                scanner.next();
            }

            System.out.println("Ошибка: введите конечное вещественное число.");
        }
    }
}
