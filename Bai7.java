import java.util.Scanner;

public class Bai7 {

    public static double timSoLonNhat(double a, double b, double c) {

        double max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        double max = timSoLonNhat(a, b, c);

        System.out.println("So lon nhat = " + max);

        scanner.close();
    }
}