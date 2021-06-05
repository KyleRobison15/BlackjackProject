package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

public class Player {

	protected BlackjackHand playerHand;
	private String name;
	
	public Player(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}
	public Player(BlackjackHand playerHand, String name) {
		this(playerHand);
		this.name = name;
	}
	
	public void hit(Deck dealerDeck) {
		playerHand.addCard(null);
	}
	
	public boolean didWin (BlackjackHand dealerHand) {
		if (playerHand.getHandValue() > dealerHand.getHandValue()) {
			return true;
		}
		return false;
		
	}
	
	//add player behavior here
	//how does a player receive cards in a game of blackjack?
	//how does a player handle their cards in a game of blackjack?
	//when does a player win in a game of blackjack?

}
