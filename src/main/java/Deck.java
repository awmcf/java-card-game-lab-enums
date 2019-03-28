import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public int deckSize() {
        return this.deck.size();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public void populateDeckWithAllCards() {
        for (SuitType currentSuit : SuitType.values()) {
            for (RankType currentRank : RankType.values()) {
                Card card = new Card(currentSuit, currentRank);
                deck.add(card);
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(this.deck);
    }

}