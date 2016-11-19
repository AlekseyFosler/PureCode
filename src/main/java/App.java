import codeFormatter.JSCodeFormatter;
import codeFormatter.command.IHandlerFactory;
import codeFormatter.command.JSHandlerFactory;
import codeFormatter.config.CheckConfig;
import codeFormatter.config.configParser.ConfigParser;
import codeFormatter.stateStrategy.IStateStrategy;
import codeFormatter.stateStrategy.StateStrategy;
import fileReader.Reader;

import java.io.IOException;

/**
 * Created by aleks on 18.11.2016.
 */
public class App {
    public void main() throws IOException {
        Reader readerConfig = new Reader("src/main/resources/config.json");
        ConfigParser parser = new ConfigParser();
        CheckConfig starter = new CheckConfig ();
        try {
            starter.checkStartAvailible(config);
        }catch (StarterException ex) {
            throw new FormaterException("cant_start_wrong_config", ex);
        }
        IHandlerFactory contextFactory = new JSHandlerFactory(config.getHandlersMap());
        IStateStrategy stateStrategy = new StateStrategy(config.getStatesMap());
        JSCodeFormatter formater = new formater(contextFactory, stateFactory);
        ConfigParser reader = new ConfigParser().buildReader();
        ConfigParser writer = new ConfigParser().buildWriter();

        formater.formate(reader, writer);
        }
    }
}
