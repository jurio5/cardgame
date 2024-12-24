package card;

public class Card implements Comparable<Card> {

    private final Emblem emblem;
    private final int cardNumber;

    public Card(Emblem emblem, int cardNumber) {
        this.emblem = emblem;
        this.cardNumber = cardNumber;
    }

    public Emblem getEmblem() {
        return emblem;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    public int compareTo(Card compareNumber) {
        if (this.cardNumber != compareNumber.cardNumber) {
            return Integer.compare(this.cardNumber,compareNumber.cardNumber);
        } else {
            return this.emblem.compareTo(compareNumber.emblem);
        }
    }

    @Override
    public String toString() {
        return cardNumber + "(" + emblem.getSymbol() + ")";
    }
}
