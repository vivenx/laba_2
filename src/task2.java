import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        double[] parameters = inputParameters(scanner);
        double result = calculate(parameters);
        output(result);
    }

    public static double[] inputParameters(Scanner scanner) {
        double[] parameters = new double[2];

        while (true) {
            parameters[0] = Main.readDouble(scanner, "Введите X: ");
            parameters[1] = Main.readInt(scanner, "Введите N (> 0): ");

            if (validateParameters(parameters)) {
                return parameters;
            }

            System.out.println("Ошибка: N должно быть больше 0. Повторите ввод.");
        }
    }

    public static boolean validateParameters(double[] parameters) {
        return parameters != null
                && parameters.length == 2
                && parameters[1] > 0
                && parameters[1] == (int) parameters[1];
    }

    public static double calculate(double[] parameters) {
        double x = parameters[0];
        int n = (int) parameters[1];
        double term = x;
        double sum = term;

        for (int k = 1; k <= n; k++) {
            term = term * (-x * x) / ((double) (2 * k) * (2 * k + 1));
            sum = sum + term;
        }

        return sum;
    }

    public static void output(double result) {
        System.out.println("Приближённое значение sin(X): " + result);
    }
}
