import entity.Entity;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Entity entity = new Entity();

        Arrays.stream(entity.getClass().getDeclaredMethods())
                .peek((e) -> logger.info(e))
                .forEach(x -> Arrays.stream(x.getAnnotations())
                        .forEach((e) -> logger.info(e)));
    }

}
