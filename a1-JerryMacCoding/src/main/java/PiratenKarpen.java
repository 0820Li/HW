import pk.Dice;
import pk.Faces;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class PiratenKarpen {
    private static final Logger logger = LogManager.getLogger(PiratenKarpen.class);

    public static void main(String[] args) {
        int numGames = 42;
        if (args.length > 0) {
            numGames = Integer.parseInt(args[0]);
        }
        logger.info("Welcome to Piraten Karpen Simulator!");
        logger.info("Playing " + numGames + " games");
        for (int i = 0; i < numGames; i++) {
            int score = 0;
            Dice[] myDices = new Dice[8];
            for (int j = 0; j < 8; j++) {
                myDices[j] = new Dice();
            }
            for (Dice d : myDices) {
                Faces result = d.roll();
                if (result == Faces.GOLD) {
                    score += 1;
                }
                if (result == Faces.DIAMOND) {
                    score += 2;
                }
            }
            score *= 100;
            logger.info("Game " + (i + 1) + " score: " + score);
        }
        logger.info("That's all folks!");
    }
}