import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckShouldStartEmpty() {
        assertEquals(0, deck.deckSize());
    }

    @Test
    public void canAddCardToDeck() {
        deck.addCard(card);
        assertEquals(1, deck.deckSize());
    }

    @Test
    public void canAddAllCardsToDeck() {
        deck.populateDeckWithAllCards();
        assertEquals(52, deck.deckSize());
    }

    @Test
    public void canShuffleCards() {
        deck.populateDeckWithAllCards();
        deck.shuffleCards();
        assertEquals(52, deck.deckSize());
    }
}

