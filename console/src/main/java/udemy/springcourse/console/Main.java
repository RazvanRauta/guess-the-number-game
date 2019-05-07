package udemy.springcourse.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import udemy.springcourse.config.GameConfig;


@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Hello Info");

        //create context (container)

        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);

        // close context (container)
        context.close();
    }
}
