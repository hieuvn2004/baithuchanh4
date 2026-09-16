import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai6Test {

    // TC01: n < 1
    @Test
    public void testSoAm() {
        int ketQua = Bai6.tinhTong(-1);

        assertEquals(0, ketQua);
    }

    // TC02: n = 0
    @Test
    public void testBangKhong() {
        int ketQua = Bai6.tinhTong(0);

        assertEquals(0, ketQua);
    }

    // TC03: n = 1
    @Test
    public void testBangMot() {
        int ketQua = Bai6.tinhTong(1);

        assertEquals(1, ketQua);
    }

    // TC04: n = 2
    @Test
    public void testHai() {
        int ketQua = Bai6.tinhTong(2);

        assertEquals(3, ketQua);
    }

    // TC05: n = 5
    @Test
    public void testNam() {
        int ketQua = Bai6.tinhTong(5);

        assertEquals(15, ketQua);
    }

    // TC06: n = 10
    @Test
    public void testMuoi() {
        int ketQua = Bai6.tinhTong(10);

        assertEquals(55, ketQua);
    }

    // TC07: n = 100
    @Test
    public void testMotTram() {
        int ketQua = Bai6.tinhTong(100);

        assertEquals(5050, ketQua);
    }
}