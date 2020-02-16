package scrabble.game.logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 2019-09-14.
 */
public class Words {

    ArrayList<String> listOfWords = new ArrayList<>();

    Words(){
        try {
            String line = new String();
            FileReader fileReader = new FileReader("slowa.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                listOfWords.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> getListOfWords() {
        return listOfWords;
    }

    public void setListOfWords(ArrayList<String> listOfWords) {
        this.listOfWords = listOfWords;
    }
}
