package codeFormatter.stateStrategy;

import codeFormatter.state.IState;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by aleks on 18.11.2016.
 */
public class StateStrategy implements IStateStrategy {
    Map<Pair<Character, IState>, IState> state;

    public StateStrategy(Map<Pair<Character, IState>, IState> init) {
        state = init;
    }

    @Override
    public IState changeState(char symbol, IState currentState) {
        return null;
    }
}
