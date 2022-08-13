import com.juego.Jugada;
import org.junit.Test;

import static org.junit.Assert.*;

public class JugadaTest {


    @Test
    public void jugar() {
        String empatePiedra = Jugada.jugar(1,1);
        System.out.println(empatePiedra);
        assertEquals("Empate" , empatePiedra);

        String piedraPapel = Jugada.jugar(1,2);
        System.out.println(piedraPapel);
        assertEquals("Gana papel",piedraPapel);

        String piedraTijera = Jugada.jugar(1,3);
        System.out.println(piedraTijera);
        assertEquals("Gana piedra",piedraTijera);

        String papelPiedra = Jugada.jugar(2,1);
        System.out.println(papelPiedra);
        assertEquals("Gana papel", papelPiedra);

        String empatePapel = Jugada.jugar(2,2);
        System.out.println(empatePapel);
        assertEquals("Empate" , empatePapel);

        String papelTijera = Jugada.jugar(2,3);
        System.out.println(papelTijera);
        assertEquals("Gana tijera", papelTijera);

        String tijeraPiedra = Jugada.jugar(3,1);
        System.out.println(tijeraPiedra);
        assertEquals("Gana piedra", tijeraPiedra);

        String tijeraPapel = Jugada.jugar(3,2);
        System.out.println(tijeraPapel);
        assertEquals("Gana tijera", tijeraPapel);

        String empateTijera = Jugada.jugar(3,3);
        System.out.println(empateTijera);
        assertEquals("Empate" , empateTijera);


    }
}