package codeFormatter.config.configParser;


import codeFormatter.state.IState;
import codeFormatter.handles.Handler;
import fileReader.Reader;
import fileWriter.Writer;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by aleks on 18.11.2016.
 */
public class ConfigParser implements IConfigParser {

    @Override
    public Reader buildReader() {
        return null;
    }

    @Override
    public Writer buildWriter() {
        return null;
    }

    @Override
    public boolean isValidateConfig() {
        return false;
    }

    @Override
    public Map<Pair<Character, IState>, Handler> getHandlersMap() {
        return null;
    }

    @Override
    public Map<Pair<Character, IState>, IState> getStatesMap() {
        return null;
    }
}
