import java.util.Scanner;

public class Bai3 {

    public static void giaiPhuongTrinhBac2(double a, double b, double c) {

        // Trường hợp a = 0
        if (a == 0) {

            // Khi a = 0 và b = 0
            if (b == 0) {

                // Khi cả a, b, c đều bằng 0
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }

            } else {
                // Phương trình bx + c = 0
                double x = -c / b;
                System.out.println("Phuong trinh co mot nghiem: x = " + x);
            }

            return;
        }

        // Trường hợp a != 0
        double delta = b * b - 4 * a * c;

        if (delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Phuong trinh co hai nghiem:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (delta == 0) {

            double x = -b / (2 * a);

            System.out.println("Phuong trinh co nghiem kep: x = " + x);

        } else {

            System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        giaiPhuongTrinhBac2(a, b, c);

        scanner.close();
    }
}