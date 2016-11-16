package codeFormatter.situation;

/**
 * Created by aleks on 17.11.2016.
 */
public interface Situation {
    String getCurrentCharacters();

    String getLastCharacters();

    String getFormattedString();

    int getNestingLevel();

    boolean setCurrentCharacters(String currentCharacters);

    boolean setLastCharacters(String lastCharacters);

    boolean setFormattedString(String formattedString);

    boolean setNestingLevel(int nestingLevel);
}
