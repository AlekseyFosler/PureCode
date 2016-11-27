package config;


import codeFormatter.Formatter;
import codeFormatter.strategy.ReaderStrategy;
import writer.Writer;

/**
 * Created by aleks on 28.11.2016.
 */
public interface ConfigFactory {
    ReaderStrategy buildReaderStrategy() throws ConfigFactoryException;
    Writer buildWriter() throws ConfigFactoryException;
    Formatter buildFormatter() throws ConfigFactoryException;
}
