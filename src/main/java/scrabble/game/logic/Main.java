package scrabble.game.logic;

import java.util.ArrayList;

/**
 * Created by user on 2019-09-14.
 */
public class Main {

    public static void main(String[] args){

    Words words = new Words();

        ArrayList<String> listOfWords = words.getListOfWords();
        System.out.println(listOfWords.get(0));

    }
}
