package pokerBase;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlElement;

import domain.CardDomainModel;
import enums.eRank;
import enums.eSuit; 

public final class Card extends CardDomainModel {

	
	/**
	 * Keep the no-arg constructor private.  I don't want 'Card' created without attributes.
	 */
	private Card()
	{
	}
	
	/**
	 * Create a new card of a given rank and suit.
	 * @param suit
	 * @param rank
	 */
	public Card(eSuit suit, eRank rank, int cardNum ) {		
		super(suit, rank, cardNum);		
	}

	public Card(eSuit suit, eRank rank, boolean Wild, int cardNum) {
		super(suit, rank, Wild, cardNum);
	}
	

	/**
	 * CardRank Comparator is used for sorting the collection by rank
	 */
	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.getRank().getRank();
		   int Cno2 = c2.getRank().getRank();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};

}