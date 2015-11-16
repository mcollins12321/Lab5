package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import domain.DeckDomainModel;
import domain.GamePlayDomainModel;
import domain.RuleDomainModel;

public class GamePlay extends GamePlayDomainModel {

	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	private ArrayList<GamePlayPlayerHand> GamePlayerHand = new ArrayList<GamePlayPlayerHand>();
	private ArrayList<GamePlayPlayerHand> GameCommonHand = new ArrayList<GamePlayPlayerHand>();
	private Deck GameDeck = null;
	private Rule rle;
	
	public GamePlay(Rule rle)
	{
		this.setGameID(UUID.randomUUID());
		this.setNbrOfCards(rle.GetNumberOfCards());
		this.setMaxNbrOfPlayers(rle.GetMaxNumberOfPlayers());
		this.setNbrOfJokers(rle.GetNumberOfJokers());
		this.setWildCards(rle.GetRuleCards());
		this.rle=rle;
	}

	public Rule getRle() {
		return rle;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public void addPlayerToGame(Player p)
	{
		GamePlayers.add(p);
	}

	public Deck getGameDeck() {
		return GameDeck;
	}

	public void setGameDeck(Deck gameDeck) {
		GameDeck = gameDeck;
	}
	
	public void addGamePlayPlayerHand(GamePlayPlayerHand GPPH)
	{
		GamePlayerHand.add(GPPH);
	}
	
	public GamePlayPlayerHand FindPlayerGame(GamePlay gme, Player p)
	{
		GamePlayPlayerHand GPPHReturn = null;
		
		for (GamePlayPlayerHand GPPH: GamePlayerHand)
		{
			if (p.getiPlayerPosition() == GPPH.getPlayer().getiPlayerPosition())
			{
				GPPHReturn = GPPH;
			}
		}
		return GPPHReturn;
	}
	
	public void addGamePlayCommonHand(GamePlayPlayerHand GPCH) {
		GameCommonHand.add(GPCH);
	}
	
	
}
