package codeFormatter.handles;

import codeFormatter.situation.Situation;
import codeFormatter.situation.JSCodeSituation;
/**
 * Created by aleks on 17.11.2016.
 */
public class CloseBraceHandler implements Handler {

    private final JSCodeSituation context;

    public CloseBraceHandler(final JSCodeSituation context) {
        this.context = context;
    }

    @Override
    public void handle(Situation situation) {
        int nestingLevel = situation.getNestingLevel() - 1;

        situation.setNestingLevel(nestingLevel);

        final StringBuilder result = new StringBuilder();
        result.append(context.getNewLine());
        for (int i = 0; i < nestingLevel; i++) {
            result.append(context.getSpace());
        }
        result.append(context.getCloseBrace());
        result.append(context.getNewLine());
        for (int i = 0; i < nestingLevel; i++) {
            result.append(context.getSpace());
        }

        situation.setFormattedString(result.toString());
    }

}
