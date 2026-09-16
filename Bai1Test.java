import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai1Test {

    // Test trường hợp hợp lệ thông thường
    @Test
    public void testChuViHinhChuNhat() {
        double ketQua = Bai1.tinhChuVi(5, 3);

        assertEquals(16.0, ketQua, 0.001);
    }

    // Test khi chiều dài và chiều rộng bằng nhau
    @Test
    public void testHinhVuong() {
        double ketQua = Bai1.tinhChuVi(5, 5);

        assertEquals(20.0, ketQua, 0.001);
    }

    // Test giá trị bằng 0
    @Test
    public void testGiaTriBangKhong() {
        double ketQua = Bai1.tinhChuVi(0, 5);

        assertEquals(10.0, ketQua, 0.001);
    }

    // Test giá trị thập phân
    @Test
    public void testGiaTriThapPhan() {
        double ketQua = Bai1.tinhChuVi(2.5, 1.5);

        assertEquals(8.0, ketQua, 0.001);
    }

    // Test với giá trị lớn
    @Test
    public void testGiaTriLon() {
        double ketQua = Bai1.tinhChuVi(1000, 500);

        assertEquals(3000.0, ketQua, 0.001);
    }
}