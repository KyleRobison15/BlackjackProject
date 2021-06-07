# Blackjack Project

### Overview of Program
This program is a very basic representation of a game of blackjack. You can see the rules of blackjack here: https://bicyclecards.com/how-to-play/blackjack/. In my particular version, there is no betting, no soft aces and no splitting hands.


### Object Oriented Programming
This project is an excellent demonstration of object oriented design. The program relies on a handful of different classes that represent the things needed to play most card games, and uses them in an implementation of a game of blackjack.

#### Data Abstraction
What is a game of blackjack in the real world? What things do we need to play? Who takes part in a game of blackjack, and how do the participants behave? These are some of the big questions I had to answer before designing my program and well before writing any actual code.

I created a Card class which utilizes enums for the suit, rank and values of each card. From there I was able to create a deck of cards, which is an ArrayList of the 52 cards you find in a real deck. There is also an abstract class called Hand which uses an ArrayList to represent the cards a player would be holding in a card game. For Blackjack in particular, I created classes for the Player and Dealer, as well as a subclass of Hand called BlackjackHand. The Player, Dealer, and BlackjackHand classes have state and behavior that is specific to playing a game of blackjack.

#### Data Encapsulation
Through the use of access modifiers and package organization, I was able to make sure my program's data is well encapsulated.

I divided the project into two separate packages - one that holds the basic, common classes for playing any card game, and one that holds the classes specific to playing a game of Blackjack. This is a simple way to make sure there is a clear organizational separation between the two.

Constructors are utilized in many of the classes to give only the data I as the programmer designated as legal to the objects that get created. For example, the Deck class can only be constructed in a way that gives the Deck object 52 of the correct playing cards found in a real deck of cards.

I made the visibility of most all of the instance fields private, meaning they cannot be directly accessed and changed by the user. Instead, the user must utilize the methods I provided for each class to change any fields.

Finally, because the Hand and BlackjackHand classes live in different packages, I used the protected access modifier for the Hand class's List<Card> field to allow the BlackjackHand subclass access to the superclass methods.

#### Inheritance and Polymorphism
There are several examples of inheritance and polymorphism in this program. All of the common classes (Card, Deck, Hand etc.) were created for the purpose of being used in any card game.

One example of this in my program is the BlackjackHand class. BlackjackHand is a subclass of the Hand superclass. This means BlackjackHand has the basic state (cards in the hand of a player) and behavior (ability to add cards, discard, have a total value etc.) of a normal hand. But it also has special rules specific to Blackjack (bust if total value > 21, blackjack if total value = 21).

Additionally, the Dealer class is a subclass of Player. In blackjack, a dealer is a player right? But they also have a deck of cards, and must deal cards to the other players. They also have dealer specific behavior like having one card in their hand hidden and being forced to hit until the value of their hand is greater than 17. Inheritance and polymorphism allowed me to write the player class once, and then expand on that for the Dealer class.

### Other Features and Technologies Used
* Enumerated Types (Enums): I used enums for the rank and suit of a standard playing card because they are predefined and constant.

* ArrayList Data Structure: ArrayList was very useful in this program to represent a deck of cards and a player's hand.

* Loops: There are several while loops used in the program to keep the program running while a game is in progress and to allow the user to continue playing hands until they quit. There are also several for loops used for various things like constructing a deck of cards, and printing hands.

* Switches: Switches are used as the main conditional for taking user input in the menus of the application.

* UML Class Diagrams: I created a basic UML class diagram during the object oriented design process which was immensely useful in getting started.
