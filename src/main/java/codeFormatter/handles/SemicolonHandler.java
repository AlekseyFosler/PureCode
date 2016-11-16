package codeFormatter.handles;

import codeFormatter.situation.Situation;
import codeFormatter.situation.JSCodeSituation;
/**
 * Created by aleks on 17.11.2016.
 */
public class SemicolonHandler implements Handler {

    private final JSCodeSituation context;

    public SemicolonHandler(final JSCodeSituation context) {
        this.context = context;
    }

    @Override
    public void handle(Situation situation) {
        int nestingLevel = situation.getNestingLevel();

        final StringBuilder result = new StringBuilder();
        result.append(context.getSemicolon());
        result.append(context.getNewLine());
        for (int i = 0; i < nestingLevel; i++) {
            result.append(context.getSpace());
        }

        situation.setFormattedString(result.toString());
    }
}
