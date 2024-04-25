import java.util.Scanner;

public class ScalesTriangle {
    public static boolean isScaleneTriangle(double a, double b, double c) {
        return a != b && b != c && c != a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        if (isScaleneTriangle(a, b, c)) {
            System.out.println("The given lengths form a scalene triangle.");
        } else {
            System.out.println("The given lengths do not form a scalene triangle.");
        }

        scanner.close();
    }
}
