package codeFormatter;

import fileReader.Reader;
import fileWriter.Writer;

/**
 * Created by aleks on 18.11.2016.
 */
public interface IJSCodeFormatter {
    public void formate (final Reader reader, final Writer writer) throws IJSCodeFormatterException;
}
