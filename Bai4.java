import java.util.Scanner;

public class Bai4 {

    public static boolean laNamNhuan(int nam) {
        return (nam % 400 == 0)
                || (nam % 4 == 0 && nam % 100 != 0);
    }

    public static int soNgayTrongThang(int thang, int nam) {

        if (thang < 1 || thang > 12) {
            return -1;
        }

        switch (thang) {

            case 2:
                if (laNamNhuan(nam)) {
                    return 29;
                } else {
                    return 28;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return 31;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        int thang = scanner.nextInt();

        System.out.print("Nhap nam: ");
        int nam = scanner.nextInt();

        int soNgay = soNgayTrongThang(thang, nam);

        if (soNgay == -1) {
            System.out.println("Thang khong hop le");
        } else {
            System.out.println("Thang " + thang
                    + " nam " + nam
                    + " co " + soNgay + " ngay");
        }

        scanner.close();
    }
}