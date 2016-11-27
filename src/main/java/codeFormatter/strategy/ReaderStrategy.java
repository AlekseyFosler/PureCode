package codeFormatter.strategy;

/**
 * Created by aleks on 27.11.2016.
 */
public interface ReaderStrategy {
    String getNext();
    void close();
}
