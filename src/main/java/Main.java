import java.io.*;
public class Main {
    public static void main(String args[]){
        Deck c = new Deck();
        Card ca = new Card("23", "FROGS FROGS HERE", 0);
        Card caa = new Card("2","help",0);
        Card[] cards = {ca, ca, caa};
        String[] help = {};
        Player newPlayer = new Player("who", 22,cards);
        //c.reshuffle(cards);
        DiscardPile d = new DiscardPile(cards);
        //System.out.println(ca.toString());
        
        System.out.println(newPlayer.discardCard(ca, d));
        

    }
}
