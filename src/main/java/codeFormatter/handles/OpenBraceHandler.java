package codeFormatter.handles;

import codeFormatter.situation.Situation;
import codeFormatter.situation.JSCodeSituation;
/**
 * Created by aleks on 17.11.2016.
 */
public class OpenBraceHandler implements Handler {

    private final JSCodeSituation context;

    public OpenBraceHandler(final JSCodeSituation context) {
        this.context = context;
    }

    @Override
    public void handle(Situation situation) {
        String lastCharacter = situation.getLastCharacters();
        int nestingLevel = situation.getNestingLevel();

        situation.setNestingLevel(nestingLevel + 1);

        final StringBuilder result = new StringBuilder();
        if (!lastCharacter.equals(context.getSpace()) && !lastCharacter.equals(context.getOpenBrace())) {
            result.append(context.getSpace());
        }
        result.append(context.getOpenBrace());
        result.append(context.getNewLine());
        for (int i = 0; i < nestingLevel + 1; i++) {
            result.append(context.getSpace());
        }

        situation.setFormattedString(result.toString());
    }

}
