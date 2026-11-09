import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        int[] parameters = inputParameters(scanner);
        double result = calculate(parameters);
        output(result);
    }

    public static int[] inputParameters(Scanner scanner) {
        int[] parameters = new int[1];

        while (true) {
            parameters[0] = Main.readInt(scanner, "Введите N (N >= 2): ");

            if (validateParameters(parameters)) {
                return parameters;
            }

            System.out.println("Ошибка: N должно быть не меньше 2. Повторите ввод.");
        }
    }

    public static boolean validateParameters(int[] parameters) {
        return parameters != null && parameters.length == 1 && parameters[0] >= 2;
    }

    public static double calculate(int[] parameters) {
        double sum = 0.0;

        for (int n = 2; n <= parameters[0]; n++) {
            double value = n;
            sum = sum + 1.0 / (value * value - 1.0);
        }

        return sum;
    }

    public static void output(double result) {
        System.out.println("Сумма ряда: " + result);
    }
}
