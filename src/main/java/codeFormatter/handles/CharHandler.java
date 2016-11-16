package codeFormatter.handles;

import codeFormatter.situation.Situation;
import codeFormatter.situation.JSCodeSituation;

/**
 * Created by aleks on 17.11.2016.
 */
public class CharHandler implements Handler {

    public CharHandler(final JSCodeSituation jsCodeSituation) {
    }

    @Override
    public void handle(final Situation situation) {
        String currentCharacters = situation.getCurrentCharacters();
        situation.setFormattedString(currentCharacters);
    }
}
