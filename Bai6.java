import java.util.Scanner;

public class Bai6 {

    public static int tinhTong(int n) {

        if (n < 1) {
            return 0;
        }

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        return tong;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int tong = tinhTong(n);

        System.out.println("Tong tu 1 den " + n + " = " + tong);

        scanner.close();
    }
}