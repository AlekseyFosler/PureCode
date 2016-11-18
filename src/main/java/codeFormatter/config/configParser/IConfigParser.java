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
public interface IConfigParser {
    public Reader buildReader();
    public Writer buildWriter();
    public boolean isValidateConfig();
    public Map<Pair<Character, IState>, Handler> getHandlersMap();
    public Map<Pair<Character, IState>, IState> getStatesMap();
}
