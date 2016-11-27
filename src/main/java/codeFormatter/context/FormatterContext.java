package codeFormatter.context;

/**
 * Created by aleks on 28.11.2016.
 */
public class FormatterContext implements Context {

    private String lastCharacters;
    private String currentCharacters;
    private String formatterString = "";
    private int nestingLevel;

    public FormatterContext() {
    }

    @Override
    public String getCurrentCharacters() {
        return currentCharacters;
    }

    @Override
    public String getLastCharacters() {
        return lastCharacters;
    }

    @Override
    public String getFormattedString() {
        return formatterString;
    }

    @Override
    public int getNestingLevel() {
        return nestingLevel;
    }

    @Override
    public Context getContext() {
        return new FormatterContext();
    }

    @Override
    public void setCurrentCharacters(String currentCharacters) {
        this.currentCharacters = currentCharacters;
    }

    @Override
    public void setLastCharacters(String lastCharacters) {
        this.lastCharacters = lastCharacters;
    }

    @Override
    public void setFormattedString(String formattedString) {
        this.formatterString = formattedString;
    }

    @Override
    public void setNestingLevel(int nestingLevel) {
        this.nestingLevel = nestingLevel;
    }
}
