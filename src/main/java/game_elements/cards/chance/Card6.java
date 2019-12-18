package game_elements.cards.chance;

import game_elements.cards.Card;
import player.Player;

public class Card6 extends Card {

    public Card6(){
        super.setName("Chance6");
        super.setDescription("You have won a crossword competition , Collect $100");
        super.setAltDescription("Which one is the real reward ? , knowledge of puzzle or the money , Mr. Monopoly thinks... ");
    }

    @Override
    public void action(Player player, Player[] playerArray) {
        player.getMoney().addMoney(100);
    }
}