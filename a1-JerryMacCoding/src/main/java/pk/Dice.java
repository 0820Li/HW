package pk;
import java.util.Arrays;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Dice {
    private static final Logger logger = LogManager.getLogger(Dice.class);
    public Faces roll() {
        int howManyFaces = Faces.values().length;
        logger.debug("(DEBUG) there are " + howManyFaces + " faces");
        logger.debug("(DEBUG) " + Arrays.toString(Faces.values()));
        Random bag = new Random();
        Faces result = Faces.values()[bag.nextInt(howManyFaces)];
        logger.debug("(DEBUG) Dice result: " + result);
        return result;
    }
}