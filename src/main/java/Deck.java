/**
 * This class makes a deck of cards
 * it also checks the size of the deck
 * it also is able to draw the first card of the deck and returning the cards name and suit
 * it also shuffles the entire deck
 * @author Cindy Pan
 * @version 17.0.1
 */

import java.util.Random;

class Deck{
    private Card[] deck;


    /**
     * This constructor takes in an array of cards and set it as the deck
     * @param newDeck the deck of cards
     */
    public Deck(Card[] newDeck){
        this.deck = newDeck.clone();
    }


    /**
     * This constructor takes in no parameters 
     * and instead creates a deck of cards from ace to king through 4 suits
     * the values of the card are by numbers
     * ace = 1, 2 = 2.....
     * 
     * the for loops loop through the name values ace to king 
     * and switch to the next suit once every card is filled in
     * the i value makes sure the cards are at the right position and doesn't overwrite each card
     * 
     */
    public Deck(){
        this.deck = new Card[52];
        String[] name = {"Ace", "2", "3", "4", "5", "6", "7","8","9","10","Jack","Queen","King"};
        String[] suit = {"Hearts", "Clubs", "Diamonds", "Spades"};
        int i=0;

        for(int j = 0; j<suit.length; j++){
            for(int k=0; k<name.length; k++){
                this.deck[i] = new Card(name[k], suit[j], k+1);
                i++;
            }
        }
    }

    /**
     * this method returns the size of the deck
     * @return the length/size of the deck
     */
    public int size(){
        return this.deck.length;
    }

    /**
     * this method draws the first card of the deck
     * everytime a card is drawn, a new deck is created with that card gone
     * @return the first card 
     * @return null if the deck is empty
     */
    public Card draw(){
        if(this.deck.length==0){
            return null;
        }

        Card top = this.deck[0];
        Card[] deck1 = new Card[this.deck.length-1];
        // :( i have 0 idea
        for(int index = 1; index<this.deck.length; index++){
            deck1[index-1] = this.deck[index];
          
        }
        // reset the deck to remove this one
        this.deck = deck1;

        return top;

    }

    /**
     * This method has no returns as it only shuffles through our entire deck
     * generating a new random set of cards
     */
    public void shuffle(){
        //random is used to generate random integers between 0 to the deck length
        Random rand = new Random();

        for (int i = 0; i<this.deck.length; i++){
            int index = rand.nextInt(this.deck.length);
            // the guide i was refrencing limits the random generation by subtracting i from deck length
            // i legit dont understand why you would do that though
            // the index i already runs through every card....

            // the int i makes sure every card through 0 to 51 
            Card temp = this.deck[index];
            this.deck[index] = this.deck[i];
            this.deck[i]=temp;
            
        }
    }
    /** this method adds one more card into the deck 
    * this is really bad because im not using an array list
    * and just have to rerun everything into a new array
    * yi-yikes.
    * @param card the provided card
    */ 
    public void addCard(Card card){
        if (card!=null){

        Card[] deckNew = new Card[this.deck.length+1];

        for (int i =0; i<this.deck.length; i++){
            deckNew[i] = this.deck[i];
        }

        deckNew[deckNew.length-1] = card;
        this.deck = deckNew;

        }
    }

    /**
     * this method adds a given array of cards into the deck
     * then shuffles them
     * (i really should've used an arrayList...)
     * @param cards the given cards
     */
    public void reshuffle(Card[] cards){
        Random rand = new Random();
        int length = cards.length + this.deck.length;
        Card[] deckAgain = new Card[length];

        // add all the cards currently 
        for (int i = 0; i<this.deck.length; i++){
            deckAgain[i] = this.deck[i];
        }

        // add the new cards
        for (int j = 0; j<cards.length; j++){
            deckAgain[this.deck.length+j] = cards[j];
        }

        // set as new deck
        this.deck = deckAgain;

        for (int i = 0; i<this.deck.length; i++){
            int index = rand.nextInt(this.deck.length);

                 Card temp = this.deck[index];
            this.deck[index] = this.deck[i];
            this.deck[i]=temp;
            
        }
    }

}

