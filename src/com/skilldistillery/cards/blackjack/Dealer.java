package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	private Deck dealerDeck;
	
	public Dealer() {
		super();
		this.dealerDeck = new Deck();
	}

	public void shuffleDealerDeck() {
		dealerDeck.shuffleDeck();
	}
	
	public Card dealCard() {
		return dealerDeck.dealCard();
	}
	
	public void dealerKeepHitting() {
		while(playerHand.dealerHit()) {
			playerHand.addCard(dealerDeck.dealCard());
		}
		
	}
	
	
	
}
