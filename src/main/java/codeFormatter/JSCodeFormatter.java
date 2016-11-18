package codeFormatter;

import codeFormatter.config.configParser.ConfigParser;
import codeFormatter.config.configParser.IConfigParser;
import codeFormatter.handles.Handler;
import fileReader.Reader;
import fileWriter.Writer;

import java.util.Map;

/**
 * Created by aleks on 17.11.2016.
 */
public class JSCodeFormatter {

   // private final Situation situation;
    private final Map<String, Handler> handlers;
    private final Handler charHandler;


    Reader rConfig = new Reader("src/main/resources/config.json");
    IConfigParser parser = new ConfigParser();



    public JSCodeFormatter(Map<String, Handler> handlers, Handler charHandler) {
       // this.situation = situation;
        this.handlers = handlers;
        this.charHandler = charHandler;
    }

    public void format(Writer writer){
        //final Situation situation;

    }

}
