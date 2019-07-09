package cheattowin;

public class Card 
{
    private String rank;
    private String suit;

  
    public String getSuit() 
    {
        return suit;
    }
    
    public void setSuit(String suit) 
    {
        this.suit = suit;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }
    
    @Override
    public String toString()
    {
        return this.rank + " of " + this.suit;
    }
      
}
=========================================================
package cheattowin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pita
 */
public class CheatToWin{

    public static void main(String[] args) 
    {
        // TODO code application logic here
        HashMap<String, Integer> cardCounts = new HashMap();
        //HashMap<String, Double> cardProb = new HashMap();
        String[] suits = { "h", "d", "c" , "s" };
        String[] rank = { "a", "k" , "q", "j", "10","9","8","7", "6","5","4","3","2","1"};       
        ArrayList<Card> deck = new ArrayList();
        //Get all 52 cards in the deck
        for(int i = 0; i < suits.length; i++)
        {
            for(int j =0;j < rank.length; j++)   
            {
                //Initializ the card counts
                cardCounts.put(rank[j], 0);
                //create the card
                Card c = new Card();
                c.setRank(rank[j]);
                c.setSuit(suits[i]);
                //add the card to the deck
                deck.add(c);
            }
        }  
        //Shuffle the deck using knuth-fisher-yates-hyphen-whatever shuffle
        Collections.shuffle(deck);
        // get x number of cards from deck
        final int CARDS_TO_GET = 20;
        for(int i = 0; i < CARDS_TO_GET; i++)
        {
            Integer currentCount = cardCounts.get(deck.get(i).getRank());
            cardCounts.put(deck.get(i).getRank(), currentCount + 1);
        }
        System.out.println("Cards shuffled. Which rank came up next?");
        Scanner in = new Scanner(System.in);
        String nextRank = in.nextLine();
        Integer rankCount = cardCounts.get(nextRank);
        Double pro = computeProbability(rankCount, deck.size() - CARDS_TO_GET);
        System.out.println("The probability of getting " + nextRank + " is " + pro);
        System.out.println("Counted " + rankCount + " of " + nextRank);          
    }
    public static Double computeProbability(Integer rankCount, Integer totalCardsLeft)
    {
        int rankCardsLeft  = 4 - rankCount;
        System.out.println(rankCardsLeft + " " + totalCardsLeft);
        Double returnValue = new Double(rankCardsLeft) / new Double(totalCardsLeft);
        System.out.println(returnValue);
        return returnValue;
    }
}

