import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerClient {

    private List<Card> clientCards = new ArrayList<>();

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        clientCards.addAll(Arrays.asList(
                new Card(p1.toUpperCase()),
                new Card(p2.toUpperCase()),
                new Card(p3.toUpperCase()),
                new Card(p4.toUpperCase()),
                new Card(p5.toUpperCase())
                )
        );
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card highestCard = new Card("s2");

        List<Card> userCards = new ArrayList<>(Arrays.asList(
                new Card(p1.toUpperCase()),
                new Card(p2.toUpperCase()),
                new Card(p3.toUpperCase()),
                new Card(p4.toUpperCase()),
                new Card(p5.toUpperCase())
        ));

        for(int i = 0; i < userCards.size(); i++){
            Card card = clientCards.get(i).getValue() > userCards.get(i).getValue() ? clientCards.get(i) : userCards.get(i);
            if(card.getValue() > highestCard.getValue()) highestCard = card;
        }

        return clientCards.contains(highestCard);
    }

}