import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    private PokerClient pokerClient;

    @BeforeEach
    public void init(){
        pokerClient = new PokerClient("h3", "d3", "s3", "s4", "c8");
    }

   @DisplayName("Highest card is not mine")
    @Test
    public void highestCardIsMine_NotMine_True(){
       assertTrue(pokerClient.highestCardIsMine("s4", "h4", "s5", "d6", "c2"));
   }

    @DisplayName("Highest card is mine")
    @Test
    public void highestCardIsMine_Mine_False(){
        assertFalse(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "ca"));
    }


}