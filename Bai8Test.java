import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Bai8Test {

    @Test
    public void testNamChiaHetCho400() {
        assertTrue(Bai8.laNamNhuan(2000));
    }

    @Test
    public void testNamChiaHetCho100NhungKhongChiaHet400() {
        assertFalse(Bai8.laNamNhuan(1900));
    }

    @Test
    public void testNamChiaHetCho4() {
        assertTrue(Bai8.laNamNhuan(2024));
    }

    @Test
    public void testNamKhongChiaHetCho4() {
        assertFalse(Bai8.laNamNhuan(2023));
    }

    @Test
    public void testNamChiaHetCho100Va400() {
        assertTrue(Bai8.laNamNhuan(2400));
    }

    @Test
    public void testNamKhongNhuan() {
        assertFalse(Bai8.laNamNhuan(2022));
    }
}