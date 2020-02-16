package scrabble.game.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


    @MessageMapping("/all")
    @SendTo("/topic/all")
    public String greeting(String message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return message;
        //return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}