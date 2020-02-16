package scrabble.game.logic;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterBag {

    Map<String, Integer> letterList = new HashMap<>();

    LetterBag() throws IOException {
        BufferedReader reader = null;
        String line;
        try {
                 reader = new BufferedReader(new FileReader(getFileFromResources("LetterBag.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while ((line = reader.readLine()) != null) {
            String[] letterPattern = line.split("-");
            letterList.put(letterPattern[0], Integer.valueOf(letterPattern[1]));
        }

    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

}
