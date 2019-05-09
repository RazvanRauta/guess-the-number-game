/**
 * @author: Razvan Rauta
 * Date: 09.05.2019
 * Time: 10:23
 */

package udemy.springcourse.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udemy.springcourse.Game;
import udemy.springcourse.MessageGenerator;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class GameServiceImpl implements GameService {
    private final Game game;
    private final MessageGenerator messageGenerator;

    @Autowired
    public GameServiceImpl(Game game, MessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    @PostConstruct
    public void init(){

        log.info("Message = {} and number = {}", messageGenerator.getMainMessage(), game.getNumber());
    }


    @Override
    public boolean isGameOver() {

        return game.isGameWon() || game.isGameLost();
    }

    @Override
    public String getMainMessage() {

        return messageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage() {

        return messageGenerator.getResultMessage();
    }

    @Override
    public void checkGuess(int guess) {

        game.setGuess(guess);
        game.check();

    }

    @Override
    public void reset() {

        game.reset();

    }
}
