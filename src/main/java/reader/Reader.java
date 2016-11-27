package reader;

/**
 * Created by aleks on 27.11.2016.
 */
public class Reader implements iReader {



    @Override
    public char read() throws ReaderException {
        return 0;
    }

    @Override
    public void close() throws ReaderException {

    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
