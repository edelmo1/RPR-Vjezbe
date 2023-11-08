import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilniBrojTest {

    @Test
    void testIspisi() {
        MobilniBroj test=new MobilniBroj(62 ,"526 767");
        assertEquals("062/526 767",test.ispisi());
    }

    @Test
    void testHashCode() {
    }

}