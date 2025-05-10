/**
 * This class can take in the age, name, and an array of cards for a player
 * it has a method that returns the size of the hand 
 * it has a method that allows the player to draw a new card
 * it has a method that allows the player to discard a card into the discard pile(if they have it in their hand)
 * it has a method that allows the player return a card back into the deck (if they have it in their hands)
 * and a method that outputs their name, age and entire hand as a String 
 * @author Cindy Pan
 * @version 17.0.1
 */
class Player {

    private String name;
    private int age;
    private Card[] hand;

    /**
     * this method constructs the instance variables
     * @param name1 the name of the player, string
     * @param age1 the age of the player, int
     * @param cards the hand of the player, card array
     */
    public Player(String name1, int age1, Card[] cards){
        this.name = name1;
        this.age = age1;
        this.hand = cards;
    }

    /**
     * this constructor takes in no card array and instead generates an empty array for the player's hand
     * @param name2 the name of the player, String
     * @param age2 the age of the player, int
     */
    public Player(String name2, int age2){
        this.name = name2;
        this.age = age2;
        this.hand = new Card[0];
    }

    /**
     * this method gets the name of the player
     * @return the name of the player
     */
    public String getName(){
        return this.name;
    }

    /**
     * this method gets the age of the player
     * @return the age of the player
     */
    public int getAge(){
        return this.age;
    }

    /**
     * this method returns the hand of the player
     * @return the hand of the player
     */
    public Card[] getHand(){
        return this.hand;
    }
    
    /**
     * this method returns the size of the player's hand
     * @return the size/length of the hand
     */
    public int size(){
        return this.hand.length;
    }


    /**
     * this method takes in a deck of cards, allowing players to draw a card from that deck
     * adding the new card into their hands
     * @param deck the deck of cards
     */
    public void draw(Deck deck){
       if (deck!=null){
        Card[] temp = new Card[this.hand.length+1];

        // AGAIN    
        for (int i = 0; i < this.hand.length; i++){
            temp[i] = this.hand[i];

        }
        temp[this.hand.length] = deck.draw();
        this.hand = temp;
        }


    }

    /**
     * this method takes in a card and a discard pile
     * it checks if the player have this card in hand 
     * if the player do have this card, it sends the card to the discard pile
     * if the player doesn't, it returns false and does nothing
     * @param card the card the players trying to discard
     * @param discardPile the discard pile given
     * @return false if the card isn't in the players hand or the card isn't a card
     * @return true if the card is in the players hand and is able to be discarded
     */
    public boolean discardCard(Card card, DiscardPile discardPile){
        try {
            int index = 0;
            for (int i = 0; i<this.hand.length; i++){
                if (this.hand[i]==card){
                    index = i;
                    discardPile.addCard(card);

                    // this is all creating a new hand without the card
                    Card[] temp = new Card[this.hand.length-1];
                    for (int j = 0; j<this.hand.length-1; j++){
                        if (j < index){
                            temp[j] = this.hand[j];
                        }
                        else {
                            temp[j] = this.hand[j+1];
                        }
                    }
                    // :)

                    return true;
                }
            }
            return false;
        } 
        
        catch (Exception e) {
            // pretty sure I have null checkers in every method 
            // but why not another one
            return false;
        }
    }

    public boolean returnCard(Card card, Deck deck){
        try {
            int index = 0;

            for (int i = 0; i<this.hand.length; i++){
                if (this.hand[i]==card){
                    index = i;
                    deck.addCard(card);

                    // this is all creating a new hand without the card
                    Card[] temp = new Card[this.hand.length-1];
                    for (int j = 0; j<this.hand.length-1; j++){
                        if (j < index){
                            temp[j] = this.hand[j];
                        }
                        else {
                            temp[j] = this.hand[j+1];
                        }
                    }

                    return true;

                }
            }
            return false;

        }
        
        catch (Exception e) {
            return false;
           
        }
    }
    
    /**
     * this method returns the player's name, age, and entire deck as a String
     * @return the player's name, age and hand, String
     */
    public String toString(){
        try {
             String outter = this.name +", " + String.valueOf(age)+", ";
        for (int i = 0 ; i<this.hand.length; i++){
            outter = outter + (this.hand[i]).toString() + ", ";
        }
    
        outter =  outter.substring(0, (outter.length())-2);
        return outter+".";
        } 
        catch (Exception e) {
           return this.name+" ,"+this.age+".";
        }
    }
}
