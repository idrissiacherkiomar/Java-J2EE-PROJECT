package ma.pfe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class Demarage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demarage.class);

    @Autowired
    private Environment env;

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Demarage.class);
        Environment env = app.run(args).getEnvironment();

        LOGGER.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}/swagger-ui/#/\n\t" +
                        "External: \thttp://{}:{}/swagger-ui/#/\n----------------------------------------------------------",
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port")
        );

        //SpringApplication.run(Demarage.class, args);
        //LOGGER.debug("=========== debug (TOUS)");
        //LOGGER.info("=========== info  (info-warn-error)");
        //LOGGER.warn("=========== warn  (warn-error)");
        //LOGGER.error("=========== error (error)");
    }
}
