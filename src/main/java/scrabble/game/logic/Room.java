package scrabble.game.logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Room {

    Board board = new Board();
    List<Player> playerList = new ArrayList<>();
    LetterBag letterBag = new LetterBag();

    public Room() throws IOException {
    }
}
