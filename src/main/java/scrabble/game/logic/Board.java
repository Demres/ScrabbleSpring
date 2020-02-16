package scrabble.game.logic;

import scrabble.game.constants.BonusType;

/**
 * Created by user on 2019-09-14.
 */
public class Board {

    Square[][] board = new Square[15][15];
    String[][] boardSettings = {
            {"3W","0","0","2L","0","0","0","3W","0","0","0","2L","0","0","3W",},
            {"0","2W","0","0","0","3L","0","0","0","3L","0","0","0","2W","0",},
            {"0","0","2W","0","0","0","2L","0","2L","0","0","0","2W","0","0",},
            {"0","0","0","2W","0","0","0","2L","0","0","0","2W","0","0","0",},
            {"0","0","0","0","2W","0","0","0","0","0","2W","0","0","0","0",},
            {"0","0","0","0","0","3L","0","0","0","3L","0","0","0","0","0",},
            {"0","0","0","0","0","0","2L","0","2L","0","0","0","0","0","0",},
            {"3W","0","0","2L","0","0","0","Star","0","0","0","2L","0","0","3W",},
            {"0","0","0","0","0","0","2L","0","2L","0","0","0","0","0","0",},
            {"0","0","0","0","0","3L","0","0","0","3L","0","0","0","0","0",},
            {"0","0","0","0","2W","0","0","0","0","0","2W","0","0","0","0",},
            {"0","0","0","2W","0","0","0","2L","0","0","0","2W","0","0","0",},
            {"0","0","2W","0","0","0","2L","0","2L","0","0","0","2W","0","0",},
            {"0","2W","0","0","0","3L","0","0","0","3L","0","0","0","2W","0",},
            {"3W","0","0","2L","0","0","0","3W","0","0","0","2L","0","0","3W",}
                                };

    BonusType[][] newBoardSettings = {
            {BonusType.TRIPPLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_WORD,},
            {BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.TRIPPLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.STAR,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_WORD,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,},
            {BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_WORD,BonusType.NOTHING,},
            {BonusType.TRIPPLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_WORD,BonusType.NOTHING,BonusType.NOTHING,BonusType.NOTHING,BonusType.DOUBLE_LETTER,BonusType.NOTHING,BonusType.NOTHING,BonusType.TRIPPLE_WORD,}
    };


    Board(){
        for(int row = 0; row < boardSettings.length; row++){
            for (int column = 0; column < boardSettings[0].length; column++){
                Square square = new Square(newBoardSettings[column][row]);
                board[column][row] = square;
            }
        }
    }


}
