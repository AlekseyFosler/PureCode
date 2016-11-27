package reader;

/**
 * Created by aleks on 16.11.2016.
 */

public interface iReader {
    public char read() throws ReaderException;

    public void close() throws ReaderException;

    public boolean hasNext();
}
