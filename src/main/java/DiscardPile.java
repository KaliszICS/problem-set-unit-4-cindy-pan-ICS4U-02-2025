/**
 * this class generates a discard pile for cards
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
        this.pile = cards1.clone();
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
    public Card[] getDiscardPile(){
        return this.pile;
    }

    /**
     * this method returns the size of the discard pile
     * @return int, the size of the array 
     */
    public int size(){
        return this.pile.length;
    }

    /**
     * this method takes in a card parameter and adds it to the discard pile
     * @param card the card given
     */
    public void addCard(Card card){
      if (this.pile.length>0){
        Card[] replace = new Card[this.pile.length+1];

        for (int i=0; i < this.pile.length; i++){
            replace[i] = this.pile[i];
        }
        
        replace[replace.length-1] = card;
        this.pile = replace;
    }
    else {
        Card[] temp ={card};
        this.pile = temp;
    }
}

    /**
     * this method takes in a specific card to remove from the pile
     * if the card is found, it is returned
     * if the card isnt in the pile, the code returns null
     * @param card is the card given
     * @return false if the card isnt found
     * @true when the card can be found
     */

    public Card removeCard(Card card){

        if(card==null){
            return null;
        }
        
        int length = this.pile.length;
        for (int i = 0; i <length; i++){
            if(card.equals(this.pile[i])){
               
                int index = i;
                Card[] temp = new Card[this.pile.length-1];
                    for (int j = 0; j<this.pile.length-1; j++){
                        if (j < index){
                            temp[j] = this.pile[j];
                        }
                        else {
                            temp[j] = this.pile[j+1];
                        }
                    }
                     return this.pile[i];
            }
        }
        return null;

    }

    /**
     * this method removes all the cards in the discard pile
     * then returns all of them as an array
     * @return null if the array given is empty
     * @return the entire array of cards
     */
    public Card[] removeAll(){
        if(this.pile==null){
            return new Card[0];
        }

        Card[] temp = new Card[this.pile.length];

        for (int i = 0; i<this.pile.length; i++){
            temp[i] = this.pile[i];
            this.pile[i] = null;
        }
        return temp;


    }

   /**
    * this method returns every card in the discard pile as one string
    * @return null if the code encounters a null pointer exception 
    * or to say it encounters a null in the array
    * @return the entire array of cards as a String
    */

    public String toString(){
       
        try { //try catching this to walk around null pointer exception 
              String outter = " ";
        for (int i = 0 ; i<this.pile.length; i++){
            outter = outter + (this.pile[i]).toString() + ", ";
        }
    
        outter = outter.substring(1,(outter.length()-2));
        return outter+".";
        // i am too lazy to cover the last case where the last card has one extra space
        // substring it is!!!!!!!!!!

        } 
        catch (Exception e) {
           return null;
        }
      
    }
}
