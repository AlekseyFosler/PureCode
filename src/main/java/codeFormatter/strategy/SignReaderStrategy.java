package codeFormatter.strategy;


import reader.Reader;

/**
 * Created by aleks on 27.11.2016.
 */
public class SignReaderStrategy implements ReaderStrategy {

    private final Reader reader;

    public SignReaderStrategy(final Reader reader) {
        this.reader = reader;
    }

    @Override
    public String getNext() {
        return null;
    }

    @Override
    public void close() {
    }
}
