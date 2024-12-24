package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList = new ArrayList<>();

    public Deck() {
        for (int i = 1; i <= 13; i++) {
            for (Emblem value : Emblem.values()) {
                cardList.add(new Card(value,i));
            }
        }
        Collections.shuffle(cardList);
    }

    public Card draw() {
        return cardList.removeFirst();
    }
}
