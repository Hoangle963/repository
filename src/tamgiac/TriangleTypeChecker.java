package tamgiac;
import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ba cạnh của tam giác
        System.out.print("Enter lengths of three sides of the triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện không phải là tam giác
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            System.out.println("Not a Triangle");
        } else {
            // Kiểm tra loại tam giác
            if (a == b && b == c) {
                System.out.println("Triangle is Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triangle is Isosceles");
            } else {
                System.out.println("Triangle is Scalene");
            }
        }

        scanner.close();
    }
}
