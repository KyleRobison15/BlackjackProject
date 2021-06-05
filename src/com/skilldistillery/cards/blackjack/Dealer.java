package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class Dealer extends Player{

	private Deck dealerDeck;
	
	public Dealer(BlackjackHand playerHand, String name) {
		super(playerHand, name);
		this.dealerDeck = new Deck();
	}
	
	//Add dealer specific behavior here (what can a dealer do in a game of blackjack?)
	//A dealer can do everything a player can. But they also have specific behavior as well...
	//How does a dealer deal cards in a game of black jack?
	//How does a dealer handle their cards? ie.) when do they show both, when do they have to hit etc...
	
	
	//deal cards
	//must hit if value of hand < 17
	//must stay if value of hand > 17
	
	public void dealCards() {
		
	}
	
}
