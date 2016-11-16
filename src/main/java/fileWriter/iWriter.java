package fileWriter;

/**
 * Created by aleks on 16.11.2016.
 */
public interface iWriter {
    void close() throws WriterException;

    void write(String data) throws WriterException;
}
