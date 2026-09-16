import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai7Test {

    @Test
    public void testALaSoLonNhat() {
        double ketQua = Bai7.timSoLonNhat(10, 5, 3);
        assertEquals(10.0, ketQua, 0.001);
    }

    @Test
    public void testBLaSoLonNhat() {
        double ketQua = Bai7.timSoLonNhat(5, 10, 3);
        assertEquals(10.0, ketQua, 0.001);
    }

    @Test
    public void testCLaSoLonNhat() {
        double ketQua = Bai7.timSoLonNhat(5, 3, 10);
        assertEquals(10.0, ketQua, 0.001);
    }

    @Test
    public void testBaSoBangNhau() {
        double ketQua = Bai7.timSoLonNhat(5, 5, 5);
        assertEquals(5.0, ketQua, 0.001);
    }

    @Test
    public void testSoAm() {
        double ketQua = Bai7.timSoLonNhat(-10, -5, -3);
        assertEquals(-3.0, ketQua, 0.001);
    }

    @Test
    public void testSoThapPhan() {
        double ketQua = Bai7.timSoLonNhat(2.5, 7.8, 4.2);
        assertEquals(7.8, ketQua, 0.001);
    }

    @Test
    public void testHaiSoBangNhauLonNhat() {
        double ketQua = Bai7.timSoLonNhat(10, 10, 5);
        assertEquals(10.0, ketQua, 0.001);
    }
}