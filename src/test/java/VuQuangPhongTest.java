import org.junit.Test;

import static org.junit.Assert.*;

public class VuQuangPhongTest {

    @Test
    public void isDate() {
        boolean actual = VuQuangPhong.isDate(29, 2);
        assertEquals(true, actual);
    }
}