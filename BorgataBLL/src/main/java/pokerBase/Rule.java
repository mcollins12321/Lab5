package pokerBase;

import java.util.ArrayList;

import domain.CardDomainModel;
import enums.eGame;
import enums.eRank;
import enums.eSuit;

public class Rule {

	private int MaxNumberOfPlayers;
	private int NumberOfCards;
	private int NumberOfJokers;
	private int CommunityCards;
	private ArrayList<CardDomainModel> RuleCards = new ArrayList<CardDomainModel>();
	private eGame Game;

	public Rule(eGame gme) {
		switch (gme) {
		case FiveStud: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 0;
			this.CommunityCards = 0;
			break;
		}
		case FiveStudOneJoker: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 1;
			this.CommunityCards = 0;
			break;
		}
		case FiveStudTwoJoker: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 2;
			this.CommunityCards = 0;
			break;
		}
		case TexasHoldEm: {
			this.MaxNumberOfPlayers = 8;
			this.NumberOfCards = 2;
			this.NumberOfJokers = 0;
			this.CommunityCards = 5;
			break;
		}
		case Omaha: {
			this.MaxNumberOfPlayers = 6;
			this.NumberOfCards = 4;
			this.NumberOfJokers = 0;
			this.CommunityCards = 5;
			break;
		}
		case SevenDraw: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 7;
			this.NumberOfJokers = 0;
			this.CommunityCards = 0;
			break;
		}		
		case DeucesWild: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 0;
			this.RuleCards.add(new CardDomainModel(eSuit.DIAMONDS, eRank.TWO, 40));
			this.RuleCards.add(new CardDomainModel(eSuit.HEARTS, eRank.TWO, 1));
			this.RuleCards.add(new CardDomainModel(eSuit.SPADES, eRank.TWO, 14));
			this.RuleCards.add(new CardDomainModel(eSuit.CLUBS, eRank.TWO, 27));
			this.CommunityCards = 0;
			break;
		}
		case AcesAndEights: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 2;
			this.NumberOfJokers = 0;
			this.RuleCards.add(new CardDomainModel(eSuit.DIAMONDS, eRank.ACE, 52));
			this.RuleCards.add(new CardDomainModel(eSuit.HEARTS, eRank.ACE, 13));
			this.RuleCards.add(new CardDomainModel(eSuit.SPADES, eRank.ACE, 26));
			this.RuleCards.add(new CardDomainModel(eSuit.CLUBS, eRank.ACE, 39));
			this.RuleCards.add(new CardDomainModel(eSuit.DIAMONDS, eRank.EIGHT, 46));
			this.RuleCards.add(new CardDomainModel(eSuit.HEARTS, eRank.EIGHT, 7));
			this.RuleCards.add(new CardDomainModel(eSuit.SPADES, eRank.EIGHT, 20));
			this.RuleCards.add(new CardDomainModel(eSuit.CLUBS, eRank.EIGHT, 33));
			this.CommunityCards = 0;
			break;
		}
		}
	}

	public int GetMaxNumberOfPlayers() {
		return this.MaxNumberOfPlayers;
	}

	public int GetNumberOfCards() {
		return this.NumberOfCards;
	}

	public int GetNumberOfJokers() {
		return this.NumberOfJokers;
	}
	
	public int GetCommunityCardsCount()
	{
		return this.CommunityCards;
	}
	
	public ArrayList<CardDomainModel> GetRuleCards()
	{
		return this.RuleCards;
	}

	/**
	 * @return the game
	 */
	public eGame getGame() {
		return Game;
	}
	
}
