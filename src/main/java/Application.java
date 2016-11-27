import codeFormatter.Formatter;
import codeFormatter.strategy.ReaderStrategy;
import config.ConfigFactory;
import config.JSConfigFactory;
import writer.Writer;
import writer.WriterException;

/**
 * Created by aleks on 18.11.2016.
 */
public class Application {
    public static void main() throws WriterException {
        ConfigFactory configFactory = new JSConfigFactory();

        ReaderStrategy readerStrategy = configFactory.buildReaderStrategy();
        Writer writer = configFactory.buildWriter();

        Formatter formatter = configFactory.buildFormatter();
        formatter.format(readerStrategy, writer);

        readerStrategy.close();
        writer.close();
    }
}
