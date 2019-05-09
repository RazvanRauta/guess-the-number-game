/**
 * @author: Razvan Rauta
 * Date: 09.05.2019
 * Time: 10:21
 */

package udemy.springcourse.service;

public interface GameService {

    boolean isGameOver();
    String getMainMessage();
    String getResultMessage();
    void checkGuess(int guess);
    void reset();
}
