package codeFormatter.stateStrategy;

import codeFormatter.state.IState;

/**
 * Created by aleks on 18.11.2016.
 */
public interface IStateStrategy {
    IState changeState(char symbol, IState currentState);
}
