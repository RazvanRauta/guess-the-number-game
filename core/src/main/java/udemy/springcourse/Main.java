package udemy.springcourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The type Main.
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCATION = "beans.xml";


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        log.info("Hello Info");

        //create context (container)

        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);

        // call method next() to get a random number

        int number = numberGenerator.next();

        //log generated number

        log.info("number = {}", number);

        // get game bean from context (container)

        Game game = context.getBean(Game.class);

        // call reset method
        game.reset();

        // close context (container)
        context.close();
    }
}
