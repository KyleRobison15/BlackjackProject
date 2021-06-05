package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	private List<Card> cards;
	
	public Hand() {
		this.cards = new ArrayList<>();
	}
	
	public void displayFullHand() {
		
		if (cards.size() == 0) {
			System.out.println("No cards.");
		}
		else {
			for (Card card : cards) {
				System.out.println(card);
			}
		}
		
	}

	public void addCard(Card card) {
		cards.add(card);
	}
	
	public Card discard (int cardToRemove) {
		return cards.remove(cardToRemove);
	}

	public int getHandValue() {
		int handValue = 0;
		for (Card card : cards) {
			handValue += card.getValue();
		}

		return handValue;
	}
	
	public void foldHand() {
		cards.clear();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cards=").append(cards).append("]");
		return builder.toString();
	}
	
}
