import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        double[] parameters = inputParameters(scanner);
        double result = calculate(parameters);
        output(result);
    }

    public static double[] inputParameters(Scanner scanner) {
        double[] parameters = new double[6];

        while (true) {
            System.out.println("Введите координаты первой точки:");
            parameters[0] = Main.readDouble(scanner, "x1 = ");
            parameters[1] = Main.readDouble(scanner, "y1 = ");
            parameters[2] = Main.readDouble(scanner, "z1 = ");

            System.out.println("Введите координаты второй точки:");
            parameters[3] = Main.readDouble(scanner, "x2 = ");
            parameters[4] = Main.readDouble(scanner, "y2 = ");
            parameters[5] = Main.readDouble(scanner, "z2 = ");

            if (validateParameters(parameters)) {
                return parameters;
            }

            System.out.println("Ошибка в координатах. Повторите ввод.");
        }
    }

    public static boolean validateParameters(double[] parameters) {
        return parameters != null && parameters.length == 6;
    }

    public static double calculate(double[] parameters) {
        double dx = parameters[3] - parameters[0];
        double dy = parameters[4] - parameters[1];
        double dz = parameters[5] - parameters[2];

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void output(double result) {
        System.out.println("Расстояние между точками: " + result);
    }
}
