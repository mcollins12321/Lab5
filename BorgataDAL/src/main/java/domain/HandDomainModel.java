package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;

import enums.eCardNo;
import enums.eHandStrength;
import enums.eRank;

public class HandDomainModel {
	private UUID playerID;
	@XmlElement
	private ArrayList<CardDomainModel> CardsInHand;
	private ArrayList<CardDomainModel> BestCardsInHand;

	@XmlElement
	private int bNatural = 1;

	@XmlElement
	private int HandStrength;
	@XmlElement
	private int HiHand;
	@XmlElement
	private int LoHand;
	@XmlElement
	private ArrayList<CardDomainModel> Kickers = new ArrayList<CardDomainModel>();

	private boolean bScored = false;

	private boolean Flush;
	private boolean Straight;
	private boolean Ace;
	private static DeckDomainModel dNonWildDeck = new DeckDomainModel();

	private ArrayList<HandDomainModel> PossibleHands = new ArrayList<HandDomainModel>();

	public HandDomainModel() {

	}

	public CardDomainModel GetCardFromHand(int location) {
		return CardsInHand.get(location);
	}

	
	public void setCardsInHand(ArrayList<CardDomainModel> cardsInHand) {
		CardsInHand = cardsInHand;
	}

	public HandDomainModel(ArrayList<CardDomainModel> setCards) {
		this.CardsInHand = setCards;
	}

	public ArrayList<CardDomainModel> getCards() {
		return CardsInHand;
	}

	public ArrayList<CardDomainModel> getBestHand() {
		return BestCardsInHand;
	}

	public void setPlayerID(UUID playerID) {
		this.playerID = playerID;
	}

	public UUID getPlayerID() {
		return playerID;
	}

	public void setBestHand(ArrayList<CardDomainModel> BestHand) {
		this.BestCardsInHand = BestHand;
	}

	public int getHandStrength() {
		return HandStrength;
	}

	
	public void setHandStrength(int handStrength) {
		HandStrength = handStrength;
	}

	public ArrayList<CardDomainModel> getKicker() {
		return Kickers;
	}


	public void setKickers(ArrayList<CardDomainModel> kickers) {
		Kickers = kickers;
	}

	public int getHiHand() {
		return HiHand;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}

	public boolean isFlush() {
		return Flush;
	}

	public void setFlush(boolean flush) {
		Flush = flush;
	}

	public boolean isStraight() {
		return Straight;
	}

	public void setStraight(boolean straight) {
		Straight = straight;
	}

	public boolean isAce() {
		return Ace;
	}

	public void setAce(boolean ace) {
		Ace = ace;
	}

	public boolean isbScored() {
		return bScored;
	}

	public void setbScored(boolean bScored) {
		this.bScored = bScored;
	}
	public int getbNatural() {
		return bNatural;
	}

	public void setbNatural(int bNatural) {
		this.bNatural = bNatural;
	}


}
