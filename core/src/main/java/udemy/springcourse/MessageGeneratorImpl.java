package udemy.springcourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * The type Message generator.
 */
@Component
public class MessageGeneratorImpl implements MessageGenerator {

    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);


    private final Game game;

    @Autowired
    public MessageGeneratorImpl(Game game) {
        this.game = game;
    }

    /**
     * Init.
     */
    @PostConstruct
    public void init() {

        log.info("game = {}", game);
    }


    @Override
    public String messageGenerator() {
        return "Number is between " +
                game.getSmallest() +
                " and " + game.getBiggest() + ". Can you guess it?";
    }

    @Override
    public String getResultMessage() {

        if (game.isGameWon()) {
            return "You guess it! The number was " + game.getNumber();

        } else if (game.isGameLoast()) {

            return "You lost. The number was " + game.getNumber();
        }else if (!game.isValidNumberRange()){

            return "Invalid number range";
        }else if (game.getRemainingGuesses() == game.getGuessCount()){

            return "What is your first guess?";

        }else{

            String direction = "Lower";

            if (game.getGuess() < game.getNumber())
            {
                direction = "Higher";
            }

            return direction + "! You have " + game.getRemainingGuesses() + " guesses left";
        }

    }
}
