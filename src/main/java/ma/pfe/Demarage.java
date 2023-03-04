package ma.pfe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demarage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demarage.class);

    public static void main(String[] args) {
        SpringApplication.run(Demarage.class, args);
        LOGGER.debug("=========== debug (TOUS)");
        LOGGER.info("=========== info  (info-warn-error)");
        LOGGER.warn("=========== warn  (warn-error)");
        LOGGER.error("=========== error (error)");
    }
}
