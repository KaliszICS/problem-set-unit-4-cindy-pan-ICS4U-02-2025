/**
 * This class takes in three parameters and returns them together as a String
 * it takes in a name, suit, and value
 * This class also compares two cards to see if they have the same name, suit, and value
 * @author Cindy Pan
 * @version 17.0.1
 */
class Card{
    
    private String name;
    private String suit;
    private int value;


    /**
     * Constructor of the instance variables, takes in 3 parameters and stores them into the instance variables
     * @param name1 the name of the card, String 
     * @param suit1 the suit of the card, String 
     * @param value1 The value of the card in int
     */
    public Card(String name1, String suit1, int value1){
        this.name = name1;
        this.suit = suit1;
        this.value = value1;
    }

    /**
     * Getters for the name variable
     * @return the name of the card, String
     */
    public String getName(){
        return this.name;
    }

    /**
     * getter for the suit variable
     * @return the Suit of the card, String
     */
    public String getSuit(){
        return this.suit;
    }

    /**
     * getter for the value variable
     * @return the Value/score of the card, int
     */
    public int getValue(){
        return this.value;
    }

    /**
     * This method collects the name and suit values and returns them as a String
     * @return "name of suit", String
     */
    @Override
    public String toString(){
        return this.name+" of "+this.suit;
    }


    /**
     * this method compares the name, suit and value of two cards
     * it returns false when one of the cards isn't a card
     * if all values are the same, it returns true, false otherwise
     * @return true whenever the two cards given are equal
     * @return false when there are no given cards or they differ in value
     */
    @Override
    public boolean equals(Object obj){
    
        if (obj == null){
            return false;
        }
        
        if (obj.getClass() != this.getClass()){
            return false;
        }

        Card c = (Card)obj;

        if (this.name.equals(c.getName()) && this.suit.equals(c.getSuit()) && this.value==c.getValue()){
            return true;
        }
        return false;
    }
}