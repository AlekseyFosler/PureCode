package codeFormatter.command;

import codeFormatter.state.IState;
import codeFormatter.handles.Handler;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by aleks on 18.11.2016.
 */
public class JSHandlerFactory implements IHandlerFactory {
    Map<Pair<Character, IState>, Handler> commandMap;

    public JSHandlerFactory(Map<Pair<Character, IState>, Handler> initMap) {
        commandMap = initMap;
    }


    @Override
    public Handler getHandler(char symbol, IState state) {
        return commandMap.get(new Pair<Character, IState>(symbol, state));
    }
}
