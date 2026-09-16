import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Bai3Test {

    // Hàm hỗ trợ lấy nội dung đã in ra màn hình
    private String chayVaLayKetQua(double a, double b, double c) {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;

        System.setOut(new PrintStream(output));

        Bai3.giaiPhuongTrinhBac2(a, b, c);

        System.setOut(oldOut);

        return output.toString();
    }

    // TC01: a = 0, b = 0, c = 0
    @Test
    public void testVoSoNghiem() {

        String ketQua = chayVaLayKetQua(0, 0, 0);

        assertTrue(ketQua.contains("vo so nghiem"));
    }

    // TC02: a = 0, b = 0, c != 0
    @Test
    public void testVoNghiemKhiABBangKhong() {

        String ketQua = chayVaLayKetQua(0, 0, 5);

        assertTrue(ketQua.contains("vo nghiem"));
    }

    // TC03: a = 0, b != 0
    @Test
    public void testPhuongTrinhBacNhat() {

        String ketQua = chayVaLayKetQua(0, 2, -4);

        assertTrue(ketQua.contains("mot nghiem"));
        assertTrue(ketQua.contains("2.0"));
    }

    // TC04: a != 0, delta > 0
    @Test
    public void testHaiNghiemPhanBiet() {

        String ketQua = chayVaLayKetQua(1, -3, 2);

        assertTrue(ketQua.contains("hai nghiem"));
    }

    // TC05: a != 0, delta = 0
    @Test
    public void testNghiemKep() {

        String ketQua = chayVaLayKetQua(1, 2, 1);

        assertTrue(ketQua.contains("nghiem kep"));
    }

    // TC06: a != 0, delta < 0
    @Test
    public void testVoNghiemDeltaAm() {

        String ketQua = chayVaLayKetQua(1, 2, 5);

        assertTrue(ketQua.contains("vo nghiem"));
    }
}