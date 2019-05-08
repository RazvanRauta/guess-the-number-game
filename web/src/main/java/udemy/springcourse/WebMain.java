/**
 * @author: Razvan Rauta
 * Date: 08.05.2019
 * Time: 17:19
 */

package udemy.springcourse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WebMain {

    public static void main(String[] args) {
        log.info("Hello Info");

        SpringApplication.run(WebMain.class, args);

    }
}
