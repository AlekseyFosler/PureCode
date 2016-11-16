package codeFormatter.handles;

import codeFormatter.situation.Situation;
import codeFormatter.situation.JSCodeSituation;
/**
 * Created by aleks on 17.11.2016.
 */
public class SpaceHandler implements Handler {

    private final JSCodeSituation context;

    public SpaceHandler(final JSCodeSituation context) {
        this.context = context;
    }

    @Override
    public void handle(Situation situation) {
        String lastCharacter = situation.getLastCharacters();

        if (lastCharacter.equals(context.getSpace())) {
            situation.setFormattedString("");
            return;
        }

        situation.setFormattedString(context.getSpace());
    }
}
