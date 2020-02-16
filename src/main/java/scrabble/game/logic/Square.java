package scrabble.game.logic;

import scrabble.game.constants.BonusType;

/**
 * Created by user on 2019-09-14.
 */
public class Square {

    String letter;
    Bonus bonus;


    Square(BonusType bonusValue){
        letter = null;
        this.bonus = new Bonus(bonusValue);
    }

}
