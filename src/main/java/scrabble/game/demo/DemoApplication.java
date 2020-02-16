package scrabble.game.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import scrabble.game.logic.Board;
import scrabble.game.logic.Room;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		Room room = new Room();

		SpringApplication.run(DemoApplication.class, args);
	}

}
