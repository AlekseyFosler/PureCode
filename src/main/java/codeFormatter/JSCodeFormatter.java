package codeFormatter;

import codeFormatter.handles.Handler;
import codeFormatter.situation.Situation;
import fileWriter.Writer;

import java.util.Map;

/**
 * Created by aleks on 17.11.2016.
 */
public class JSCodeFormatter {

   // private final Situation situation;
    private final Map<String, Handler> handlers;
    private final Handler charHandler;


    public JSCodeFormatter(Map<String, Handler> handlers, Handler charHandler) {
       // this.situation = situation;
        this.handlers = handlers;
        this.charHandler = charHandler;
    }

    public void format(Writer writer){
        //final Situation situation;

    }

}
