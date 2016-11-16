package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by aleks on 15.11.2016.
 */
public class Reader implements iReader {

    private final BufferedReader buffReader;
    private Character actualCharacter;
    private Character nextCharacter;
    private boolean isReaderClosed = false;

    public Reader (String fileName) throws ReaderException {
        if (fileName == null) {
            throw new ReaderException("file_name_cant_be_null");
        }
        try {
            buffReader = new BufferedReader(new java.io.FileReader(fileName));
        } catch (FileNotFoundException ex) {
            throw new ReaderException("file_cant_be_opened");
        }
        actualCharacter = readNext();
        nextCharacter = readNext();
    }

    public char read() throws ReaderException {
        if (isReaderClosed || !hasNext()) {
            return (char) -1;
        }
        char result = actualCharacter;
        actualCharacter = nextCharacter;
        nextCharacter = readNext();

        return result;
    }

    private Character readNext() throws ReaderException {
        try {
            int characterCode = buffReader.read();
            if (characterCode == -1) {
                return null;
            }
            return (char) characterCode;
        } catch (IOException ex) {
            throw new ReaderException("cant_read_character_file");
        }
    }

    public boolean hasNext() {
        return actualCharacter != null;
    }

    public void close() throws ReaderException {
        isReaderClosed = true;
        try {
            buffReader.close();
        } catch (IOException ex) {
            throw new ReaderException("cant_close_file_reader");
        }
    }
}
