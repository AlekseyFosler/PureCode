package codeFormatter.command;

import codeFormatter.state.IState;
import codeFormatter.handles.Handler;

/**
 * Created by aleks on 18.11.2016.
 */
public interface IHandlerFactory {
    public Handler getHandler(char symbol, IState state);
}
