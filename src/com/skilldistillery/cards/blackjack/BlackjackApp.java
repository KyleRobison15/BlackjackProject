package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApp {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.launch();

	}

	public void launch() {
		int choice = 0;
		boolean usingMenu = true;

		while (usingMenu) {
			System.out.println("--- WELCOME TO THE BLACKJACK APP ---");
			System.out.println("Please choose an option below: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Start a new game ");
			System.out.println("2. View game rules ");
			System.out.println("3. Quit ");
			System.out.println("--------------------------------------");

			choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				usingMenu = false;
				newGame();
				break;
			case 2:
				usingMenu = true;
				displayRules();
				break;
			case 3:
				System.out.println("Thank you. Goodbye!");
				usingMenu = false;
				break;
			default:
				System.out.println("Invalid choice. Please choose again");
				usingMenu = true;

			}
		}

	}

	public void newGame() {

		Player player = new Player();
		Dealer dealer = new Dealer();
		playGame(player, dealer);
	}

	public void playGame(Player player, Dealer dealer) {
		boolean playingHand = true;
		boolean isHit = true;

		initialDeal(player, dealer);

		displayHands1(player, dealer);

		if (player.playerHand.isBlackjack()) {
			System.out.println("Blackjack! You win.");
		}

		else {
			while (playingHand && isHit) {

				isHit = hitOrStay(player, dealer);
				displayHands1(player, dealer);

				if (player.playerHand.isBust()) {
					System.out.println("You bust. Dealer wins.");
					playingHand = false;

				}
			}

			if (playingHand) {
			dealer.dealerKeepHitting();
			displayHands2(player, dealer);

			if (dealer.playerHand.isBust()) {
				System.out.println("Dealer busts. You win!");
			} else if (player.didPush(dealer.playerHand)) {
				System.out.println("Push. No winner.");
			} else if (player.didWin(dealer.playerHand)) {
				System.out.println("You beat the dealer's hand. You win!");
			} else {
				System.out.println("Dealer wins.");
			}

		}
		}
		playAnotherHand(player, dealer);
	}

	public void initialDeal(Player player, Dealer dealer) {
		dealer.shuffleDealerDeck();

		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				player.playerHand.addCard(dealer.dealCard());
			} else {
				dealer.playerHand.addCard(dealer.dealCard());

			}
		}

	}

	public boolean hitOrStay(Player player, Dealer dealer) {
		boolean isHit = true;

		System.out.println("1. Hit");
		System.out.println("2. Stay");

		int hitOrStay = input.nextInt();

		switch (hitOrStay) {

		case 1:
			player.playerHand.addCard(dealer.dealCard());
			isHit = true;
			break;
		case 2:
			isHit = false;
		default:
			System.out.println("Invalid choice. Please enter either 1 or 2.");
		}
		return isHit;
	}

	public void playAnotherHand(Player player, Dealer dealer) {
		System.out.println("Would you like to play another hand?");
		System.out.println("1. Yes");
		System.out.println("2. No");

		int playAgainChoice = input.nextInt();

		switch (playAgainChoice) {

		case 1:
			player.playerHand.clearHand();
			dealer.playerHand.clearHand();
			playGame(player, dealer);
			break;
		case 2:
			System.out.println("Thanks for playing! Goodbye.");
			break;
		default:
			System.out.println("Invalid choice. Please enter either 1 or 2.");

		}
	}

	public void displayHands1(Player player, Dealer dealer) {

		dealer.playerHand.displayDealerHand();
		System.out.println("Your hand:");
		player.playerHand.displayFullHand();
		System.out.println("===============================================");

	}

	public void displayHands2(Player player, Dealer dealer) {

		System.out.println("Dealer hand:");
		dealer.playerHand.displayFullHand();
		System.out.println("Your hand:");
		player.playerHand.displayFullHand();
		System.out.println("===============================================");

	}

	public void displayRules() {

		System.out.println("----------------------------------- BASIC RULES ----------------------------------------");
		System.out.println("The goal of blackjack is to beat the dealer's hand without going over 21.");
		System.out.println("Face cards are worth 10. Aces are worth 11 (there are no soft aces in this app).");
		System.out.println("Each player starts with two cards, one of the dealer's cards is hidden until the end.");
		System.out.println("To 'Hit' is to ask for another card. To 'Stand' is to hold your total and end your turn.");
		System.out.println("If you go over 21 you bust, and the dealer wins regardless of the dealer's hand.");
		System.out.println("If you are dealt 21 from the start (Ace & 10), you got a blackjack");
		System.out.println("The dealer will hit until their cards total 17 or higher");
		System.out.println();

	}

}
