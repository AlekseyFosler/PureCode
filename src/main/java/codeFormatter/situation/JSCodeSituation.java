package codeFormatter.situation;

/**
 * Created by aleks on 17.11.2016.
 */

public class JSCodeSituation {
    private String semicolon;
    private String space;
    private String newLine;
    private String openBrace;
    private String closeBrace;


    private JSCodeSituation() {}

    public String getSemicolon() {
        return semicolon;
    }

    public String getSpace() {
        return space;
    }

    public String getNewLine() {
        return newLine;
    }

    public String getOpenBrace() {
        return openBrace;
    }

    public String getCloseBrace() {
        return closeBrace;
    }

    public static Builder JSSetCodeSituation() {
        return new JSCodeSituation().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setSemicolon(final String semicolon) {
            JSCodeSituation.this.semicolon = semicolon;
            return this;
        }

        public Builder setSpace(final String space) {
            JSCodeSituation.this.space = space;
            return this;
        }

        public Builder setNewLine(final String newLine) {
            JSCodeSituation.this.newLine = newLine;
            return this;
        }

        public Builder setOpenBrace(final String openBrace) {
            JSCodeSituation.this.openBrace = openBrace;
            return this;
        }

        public Builder setCloseBrace(final String closeBrace) {
            JSCodeSituation.this.closeBrace = closeBrace;
            return this;
        }

        public JSCodeSituation build() {
            return JSCodeSituation.this;
        }
    }
}
