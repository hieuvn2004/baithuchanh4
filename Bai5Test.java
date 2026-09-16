import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Bai5Test {

    // TC01: n = 0
    @Test
    public void testSoNhoHon2Bang0() {
        assertFalse(Bai5.laSoNguyenTo(0));
    }

    // TC02: n = 1
    @Test
    public void testSoNhoHon2Bang1() {
        assertFalse(Bai5.laSoNguyenTo(1));
    }

    // TC03: 2 là số nguyên tố nhỏ nhất
    @Test
    public void testSoNguyenToNhoNhat() {
        assertTrue(Bai5.laSoNguyenTo(2));
    }

    // TC04: 3 - vòng lặp không thực hiện
    @Test
    public void testSoNguyenTo3() {
        assertTrue(Bai5.laSoNguyenTo(3));
    }

    // TC05: 4 - tìm thấy ước 2 ngay lần đầu
    @Test
    public void testSoHopSo4() {
        assertFalse(Bai5.laSoNguyenTo(4));
    }

    // TC06: 9 - tìm thấy ước
    @Test
    public void testSoHopSo9() {
        assertFalse(Bai5.laSoNguyenTo(9));
    }

    // TC07: 17 - vòng lặp chạy nhưng không tìm thấy ước
    @Test
    public void testSoNguyenTo17() {
        assertTrue(Bai5.laSoNguyenTo(17));
    }

    // TC08: 49 - ước nằm đúng tại sqrt(49) = 7
    @Test
    public void testSoHopSo49() {
        assertFalse(Bai5.laSoNguyenTo(49));
    }

    // TC09: 97 - số nguyên tố lớn hơn
    @Test
    public void testSoNguyenTo97() {
        assertTrue(Bai5.laSoNguyenTo(97));
    }
}