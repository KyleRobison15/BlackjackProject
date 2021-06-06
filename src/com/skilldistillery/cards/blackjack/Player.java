package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	protected BlackjackHand playerHand;
	
	public Player() {
		this.playerHand = new BlackjackHand();
	}

	public boolean didWin (BlackjackHand dealerHand) {
		if (playerHand.getHandValue() > dealerHand.getHandValue()) {
			return true;
		}
		return false;
	}
	
	public boolean didPush (BlackjackHand dealerHand) {
		if (playerHand.getHandValue() == dealerHand.getHandValue()) {
			return true;
		}
		return false;
	}
	

}
