package codeFormatter.context;

/**
 * Created by aleks on 27.11.2016.
 */
public class PermanentContext {
    private String openBrace;

    private PermanentContext() {
    }

    public String getOpenBrace() {
        return openBrace;
    }

    public static Builder newBuilder() {
        return new PermanentContext().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setOpenBrace(final String openBrace) {
            PermanentContext.this.openBrace = openBrace;
            return this;
        }

        public PermanentContext build() {
            return PermanentContext.this;
        }
    }
}
