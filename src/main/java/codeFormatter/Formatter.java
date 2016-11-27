package codeFormatter;


import codeFormatter.strategy.ReaderStrategy;
import writer.Writer;

/**
 * Created by aleks on 27.11.2016.
 */
public interface Formatter {

    void format(ReaderStrategy readerStrategy, Writer writer);
}
