public class Main {
    public static void main(String args[]){
        Deck c = new Deck();
        Card ca = new Card("23", "FROGS FROGS HERE", 0);
        Card[] cards = {ca, ca, null};
        //c.reshuffle(cards);
        String outout = " ";
        for (int i=0; i<51;i++){
        //ca = (c.draw());
        outout = (ca.toString() + " , " +ca.toString());
        
        
        }
       System.out.println(outout);

       DiscardPile p = new DiscardPile();
       System.out.println(p.size());
        

    }
}
