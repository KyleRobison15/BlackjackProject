package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;
	
	public Deck() {
		cards = createDeck();
	}
	
	private List <Card> createDeck() {
		List <Card> deck = new ArrayList<>();
		
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
		return deck;
	}
	
	public int checkDeckSize() {
		if (cards == null) {
			return -1;
		}
		return cards.size();
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	
}
