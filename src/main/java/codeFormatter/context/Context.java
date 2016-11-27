package codeFormatter.context;

/**
 * Created by aleks on 27.11.2016.
 */
public interface Context {
    String getCurrentCharacters();
    String getLastCharacters();
    String getFormattedString();
    int getNestingLevel();
    Context getContext();

    void setCurrentCharacters(String currentCharacters);
    void setLastCharacters(String lastCharacters);
    void setFormattedString(String formattedString);
    void setNestingLevel(int nestingLevel);
}
