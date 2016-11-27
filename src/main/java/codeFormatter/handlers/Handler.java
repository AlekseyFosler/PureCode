package codeFormatter.handlers;


import codeFormatter.context.Context;

/**
 * Created by aleks on 27.11.2016.
 */
public interface Handler {
    void handle(Context context);
    void getOrDefault(String value, Handler charHandler);
}
