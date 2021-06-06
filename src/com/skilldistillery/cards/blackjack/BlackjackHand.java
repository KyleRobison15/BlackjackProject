package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	private static final int BLACKJACK_VALUE = 21;
	private static final int DEALER_HIT_THRESHOLD = 17;

	public BlackjackHand() {
		super();
	}

	public boolean isBlackjack() {
		if (getHandValue() == BLACKJACK_VALUE) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() > BLACKJACK_VALUE) {
			return true;
		} else {
			return false;
		}
	}

	public boolean dealerHit() {
		if (getHandValue() < DEALER_HIT_THRESHOLD) {
			return true;
		} else {
			return false;
		}
	}

	public void displayDealerHand() {
		System.out.println("Dealer hand:");
		if (cards.size() == 0) {
			System.out.println("No cards.");
		} 
		else {
			System.out.println("Hidden card");
			for (int i = 1; i < cards.size(); i++) {
				System.out.println(cards.get(i));

			}
		}
		int hiddenCardValue = cards.get(0).getValue();
		System.out.println("Hand value: " + (getHandValue() - hiddenCardValue));
		System.out.println();

	} 

}
