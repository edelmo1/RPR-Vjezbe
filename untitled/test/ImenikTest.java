import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImenikTest {


    @Test
    void testDajBroj() {


        Imenik imenik = new Imenik();


        TelefonskiBroj broj= new MobilniBroj(62 , " 526 767");
        imenik.dodaj("Edi Djelmo" , broj);
        try{
            assertEquals("062/ 526 767",imenik.dajBroj("blablabla"));
        }
        catch(NepostojeceIme e) {
            System.out.println("Nije ok");
        }


    }

    @Test
    void testDajIme() {


        Imenik imenik = new Imenik();


        TelefonskiBroj broj= new MobilniBroj(62 , " 526 767");
        imenik.dodaj("Edi Djelmo" , broj);
        assertEquals("Edi Djelmo" , imenik.dajIme(broj));
    }
}
