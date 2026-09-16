import java.util.Scanner;

public class Bai2 {

    public static double tinhDienTich(double dai, double rong) {
        return dai * rong;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();

        double dienTich = tinhDienTich(dai, rong);

        System.out.println("Dien tich hinh chu nhat = " + dienTich);

        scanner.close();
    }
}