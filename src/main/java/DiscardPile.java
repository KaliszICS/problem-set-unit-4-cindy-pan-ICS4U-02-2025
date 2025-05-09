/**
 * this method generates a discard pile for cards
 * it can take in an array and set it as the discard pile 
 * also it can check the size of the pile
 * also can add cards into the pile
 * remove one or remove all cards from the pile
 * and lastly return all cards in the pile as a String
 * :c
 * @author Cindy Pan
 * @version 17.0.1 
 */

class DiscardPile {

    private Card[] pile;
    
    /**
     * this constructor takes in an array of cards and generate a discard pile based on the cards given
     * @param cards1 the array of cards given
     */
    public DiscardPile(Card[] cards1){
        this.pile = cards1;
    }

    /**
     * this constructor takes in no parameters
     * and just simply generate an empty array
     */
    public DiscardPile(){
        this.pile = new Card[0];
    }

    /**
     * a getter method that returns the discard pile as an array of cards
     * @return the discard pile as an array of cards
     */
    public Card[] getPile(){
        return this.pile;
    }

    /**
     * this method returns the size of the discard pile
     * @return int, the size of the array 
     */
    public int size(){
        return this.pile.length;
    }

    public void addCard(Card card){
        Deck k = new Deck(this.pile);
        k.addCard(card);
        
        for (int i=0; i <this.pile.length; i++){

        }
    }
}
