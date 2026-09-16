import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai4Test {

    // TC01: Tháng nhỏ hơn 1
    @Test
    public void testThangKhongHopLeNhoHon1() {
        int ketQua = Bai4.soNgayTrongThang(0, 2024);

        assertEquals(-1, ketQua);
    }

    // TC02: Tháng lớn hơn 12
    @Test
    public void testThangKhongHopLeLonHon12() {
        int ketQua = Bai4.soNgayTrongThang(13, 2024);

        assertEquals(-1, ketQua);
    }

    // TC03: Tháng 2 của năm nhuận
    @Test
    public void testThangHaiNamNhuan() {
        int ketQua = Bai4.soNgayTrongThang(2, 2024);

        assertEquals(29, ketQua);
    }

    // TC04: Tháng 2 của năm không nhuận
    @Test
    public void testThangHaiNamKhongNhuan() {
        int ketQua = Bai4.soNgayTrongThang(2, 2023);

        assertEquals(28, ketQua);
    }

    // TC05: Năm chia hết cho 400
    @Test
    public void testNamChiaHetCho400() {
        int ketQua = Bai4.soNgayTrongThang(2, 2000);

        assertEquals(29, ketQua);
    }

    // TC06: Năm chia hết cho 100 nhưng không chia hết cho 400
    @Test
    public void testNamChiaHetCho100NhungKhongChiaHet400() {
        int ketQua = Bai4.soNgayTrongThang(2, 1900);

        assertEquals(28, ketQua);
    }

    // TC07: Tháng có 30 ngày
    @Test
    public void testThangCo30Ngay() {
        int ketQua = Bai4.soNgayTrongThang(4, 2024);

        assertEquals(30, ketQua);
    }

    // TC08: Tháng có 31 ngày
    @Test
    public void testThangCo31Ngay() {
        int ketQua = Bai4.soNgayTrongThang(1, 2024);

        assertEquals(31, ketQua);
    }
}