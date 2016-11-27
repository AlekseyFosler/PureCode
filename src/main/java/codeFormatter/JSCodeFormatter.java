package codeFormatter;


import codeFormatter.context.Context;
import codeFormatter.handlers.Handler;
import codeFormatter.strategy.ReaderStrategy;
import writer.Writer;

import java.util.Map;

/**
 * Created by aleks on 28.11.2016.
 */
public class JSCodeFormatter implements Formatter {
    private final Map<String, Handler> handlers;
    private final Handler charHandler;

    public JSCodeFormatter(final Map<String, Handler> handlers) {
        this.charHandler = handlers.get("default");
        this.handlers = handlers;
    }

    @Override
    public void format(final ReaderStrategy readerStrategy, final Writer writer) {
        final Context context = null;
        context.getContext();
        context.setLastCharacters("\n");
        context.setNestingLevel(0);

        String value;
        while ((value = readerStrategy.getNext()) != null) {
            context.setCurrentCharacters(value);

            charHandler.getOrDefault(value, charHandler);
            charHandler.handle(context);
            writer.write(context.getFormattedString());

            context.setLastCharacters(context.getCurrentCharacters());
            context.setFormattedString("");
        }
    }
}
