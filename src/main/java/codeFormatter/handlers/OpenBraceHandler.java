package codeFormatter.handlers;


import codeFormatter.context.Context;
import codeFormatter.context.PermanentContext;

/**
 * Created by aleks on 27.11.2016.
 */
public class OpenBraceHandler implements Handler {

    private final PermanentContext permanentContext;

    public OpenBraceHandler(final PermanentContext permanentContext) {
        this.permanentContext = permanentContext;
    }

    @Override
    public void handle(Context context) {

    }

    @Override
    public void getOrDefault(String value, Handler charHandler) {

    }
}
