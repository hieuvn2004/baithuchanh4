import java.util.Scanner;

public class Bai1 {

    public static double tinhChuVi(double dai, double rong) {
        return 2 * (dai + rong);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();

        double chuVi = tinhChuVi(dai, rong);

        System.out.println("Chu vi hinh chu nhat = " + chuVi);

        scanner.close();
    }
}