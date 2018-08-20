import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    public void constructor_InvalidColorG2_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->new Card("g2"));
    }

    @Test
    public void constructor_InvalidColorK7_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->new Card("k7"));
    }

    @Test
    public void constructor_InvalidValueC1_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->new Card("c1"));
    }

    @Test
    public void constructor_InvalidValueC11_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->new Card("c11"));
    }

    @Test
    public void getValue_C5CardValue_Integer(){
        Card card = new Card("c5");
        assertEquals(5, card.getValue());
    }

    @Test
    public void getValue_HACardValue_Integer(){
        Card card = new Card("ha");
        assertEquals(14, card.getValue());
    }

    @Test
    public void getValue_DQCardValue_Integer(){
        Card card = new Card("dq");
        assertEquals(12, card.getValue());
    }
}