package com.java.ptb2;

import java.util.Scanner;

public class ptb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Giải phương trình bậc hai
        String result = giaiPhuongTrinhBacHai(a, b, c);
        System.out.println(result);
    }

    public static String giaiPhuongTrinhBacHai(double a, double b, double c) {
        // Trường hợp a = 0, phương trình trở thành bậc nhất
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                return "Phương trình có một nghiệm x = " + x;
            } else {
                if (c == 0) {
                    return "Phương trình vô số nghiệm.";
                } else {
                    return "Phương trình vô nghiệm.";
                }
            }
        } else {
            // Tính discriminant (Δ)
            double delta = b * b - 4 * a * c;

            // Trường hợp delta > 0, phương trình có 2 nghiệm phân biệt
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phương trình có 2 nghiệm phân biệt:\n" +
                       "x1 = " + x1 + "\n" +
                       "x2 = " + x2;
            }
            // Trường hợp delta = 0, phương trình có nghiệm kép
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phương trình có nghiệm kép: x = " + x;
            }
            // Trường hợp delta < 0, phương trình vô nghiệm
            else {
                return "Phương trình vô nghiệm thực.";
            }
        }
    }
}
