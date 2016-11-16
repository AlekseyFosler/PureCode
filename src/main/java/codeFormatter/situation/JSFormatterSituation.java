package codeFormatter.situation;

/**
 * Created by aleks on 17.11.2016.
 */
public class JSFormatterSituation implements Situation{
    private String currentCharacters;
    private String lastCharacters;
    private String formatterString = "";
    private int nestingLevel;

    public JSFormatterSituation() {}

    public String getCurrentCharacters() {
        return currentCharacters;
    }

    public String getLastCharacters() {
        return lastCharacters;
    }

    public String getFormattedString() {
        return formatterString;
    }

    public int getNestingLevel() {
        return nestingLevel;
    }

    public boolean setCurrentCharacters(String currentCharacters) {
        this.currentCharacters = currentCharacters;
        return true;
    }

    public boolean setLastCharacters(String lastCharacters) {
        this.lastCharacters = lastCharacters;
        return true;
    }

    public boolean setFormattedString(String formattedString) {
        this.formatterString = formattedString;
        return true;
    }

    public boolean setNestingLevel(int nestingLevel) {
        this.nestingLevel = nestingLevel;
        return true;
    }

}
