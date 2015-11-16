package domain;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlElement;

import enums.eRank;
import enums.eSuit;

public class CardDomainModel {
	@XmlElement
	private eSuit Suit;
	@XmlElement
	private eRank Rank;
	@XmlElement
	private boolean Wild = false;
	@XmlElement 
	private String CardImg;
	private int CardNbr;
	
	 
	/**
	 * Keep the no-arg constructor private.  I don't want 'Card' created without attributes.
	 */
	public CardDomainModel()
	{
	}
	
	/**
	 * Create a new card of a given rank and suit.
	 * @param suit
	 * @param rank
	 */
	public CardDomainModel(eSuit suit, eRank rank, int CardNbr ) {
		Suit = suit; 
		Rank = rank; 
		this.Wild = false;
		this.CardImg = CardNbr + ".png";
		
	}

	public CardDomainModel(eSuit suit, eRank rank, boolean Wild, int CardNbr) {
		Suit = suit; 
		Rank = rank; 
		this.Wild = Wild;
		this.CardImg = CardNbr + ".png";
	}
	
	/**
	 * Getter for Rank
	 * @return
	 */
	public eRank getRank() {
		return this.Rank;
	}

	/**
	 * Getter for Suit
	 * @return
	 */
	public eSuit getSuit() {
		return this.Suit;
	}
	
	public boolean getWild()
	{
		return this.Wild;
	}
	
	public void setWild()
	{
		this.Wild = true;
	}
	
	public String getCardImg()
	{
		return this.CardImg;
	}

	/**
	 * @return the cardNbr
	 */
	public int getCardNbr() {
		return CardNbr;
	}

	/**
	 * @param cardNbr the cardNbr to set
	 */
	public void setCardNbr(int cardNbr) {
		CardNbr = cardNbr;
	}

	/**
	 * CardRank Comparator is used for sorting the collection by rank
	 */
	public static Comparator<CardDomainModel> CardRank = new Comparator<CardDomainModel>() {

		public int compare(CardDomainModel c1, CardDomainModel c2) {

		   int Cno1 = c1.getRank().getRank();
		   int Cno2 = c2.getRank().getRank();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};

}