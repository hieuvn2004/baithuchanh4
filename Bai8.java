import java.util.Scanner;

public class Bai8 {

    public static boolean laNamNhuan(int nam) {

        if (nam % 400 == 0) {
            return true;
        }

        if (nam % 100 == 0) {
            return false;
        }

        return nam % 4 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam: ");
        int nam = scanner.nextInt();

        if (laNamNhuan(nam)) {
            System.out.println(nam + " la nam nhuan");
        } else {
            System.out.println(nam + " khong phai nam nhuan");
        }

        scanner.close();
    }
}