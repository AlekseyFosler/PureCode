package fileWriter;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by aleks on 16.11.2016.
 */

public class Writer implements iWriter {

    private final BufferedWriter bufWriter;
    private boolean isStreamClosed = false;

    public Writer(final String fileName) throws WriterException {
        if (fileName == null) {
            throw new WriterException("file_name_cant_null");
        }
        try {
            bufWriter = new BufferedWriter(new java.io.FileWriter(fileName, false));
        } catch (IOException ex) {
            throw new WriterException("file_cant_open");
        }
    }

    public void close() throws WriterException {
        try {
            bufWriter.close();
        } catch (IOException ex) {
            throw new WriterException("cant_close_file");
        }
        isStreamClosed = true;
    }

    public void write(final String data) throws WriterException {
        if (isStreamClosed) {
            return;
        }
        try {
            bufWriter.write(data);
        } catch (IOException ex) {
            throw new WriterException("cant_write_data");
        }
    }
}
