import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai2Test {

    // Test trường hợp hợp lệ thông thường
    @Test
    public void testDienTichHinhChuNhat() {
        double ketQua = Bai2.tinhDienTich(5, 3);

        assertEquals(15.0, ketQua, 0.001);
    }

    // Test khi chiều dài và chiều rộng bằng nhau
    @Test
    public void testHinhVuong() {
        double ketQua = Bai2.tinhDienTich(5, 5);

        assertEquals(25.0, ketQua, 0.001);
    }

    // Test giá trị bằng 0
    @Test
    public void testGiaTriBangKhong() {
        double ketQua = Bai2.tinhDienTich(0, 5);

        assertEquals(0.0, ketQua, 0.001);
    }

    // Test giá trị thập phân
    @Test
    public void testGiaTriThapPhan() {
        double ketQua = Bai2.tinhDienTich(2.5, 1.5);

        assertEquals(3.75, ketQua, 0.001);
    }

    // Test với giá trị lớn
    @Test
    public void testGiaTriLon() {
        double ketQua = Bai2.tinhDienTich(1000, 500);

        assertEquals(500000.0, ketQua, 0.001);
    }
}