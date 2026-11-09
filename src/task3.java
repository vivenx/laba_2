import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        int[] parameters = inputParameters(scanner);
        boolean result = calculate(parameters);
        output(result);
    }

    public static int[] inputParameters(Scanner scanner) {
        int[] parameters = new int[1];

        while (true) {
            parameters[0] = Main.readInt(scanner, "Введите N (> 1): ");

            if (validateParameters(parameters)) {
                return parameters;
            }

            System.out.println("Ошибка: N должно быть больше 1. Повторите ввод.");
        }
    }

    public static boolean validateParameters(int[] parameters) {
        return parameters != null && parameters.length == 1 && parameters[0] > 1;
    }

    public static boolean calculate(int[] parameters) {
        int number = parameters[0];

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void output(boolean result) {
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
