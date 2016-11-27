package config;

import codeFormatter.Formatter;
import codeFormatter.context.PermanentContext;
import codeFormatter.handlers.Handler;
import codeFormatter.strategy.ReaderStrategy;

import com.typesafe.config.Config;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import reader.Reader;
import writer.Writer;

/**
 * Created by aleks on 28.11.2016.
 */
public class JSConfigFactory implements ConfigFactory {

    private final Config config;

    public JSConfigFactory() {
        this.config = com.typesafe.config.ConfigFactory.load();
    }

    private Reader buildReader() throws ConfigFactoryException {
        try {
            Class readerClass = Class.forName(config.getString("reader.class"));
            Constructor constructor = readerClass.getConstructor(String.class);
            return (Reader) constructor.newInstance(config.getString("reader.param.file"));
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                InvocationTargetException e) {
            throw new ConfigFactoryException("Exception on constructing Reader", e);
        }
    }

    private Map<String, Handler> buildHandlers() {
        Map<String, Handler> handlers = new HashMap<>();
        List<Config> configs = (List<Config>) config.getConfigList("handlers");
        for (Config handlerConfig : configs) {
            handlers.put(handlerConfig.getString("key"), buildHandler(handlerConfig.getString("class")));
        }
        return handlers;
    }

    private Handler buildHandler(final String className) {
        try {
            Class handlerClass = Class.forName(className);
            Constructor constructor = handlerClass.getConstructor(PermanentContext.class);
            return (Handler) constructor.newInstance(buildPermanentContext());
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException |
                IllegalAccessException e) {
            throw new ConfigFactoryException("Exception on constructing Context", e);
        }
    }

    private PermanentContext buildPermanentContext() {
        PermanentContext.Builder builder;
        try {
            Class contextClass = Class.forName(config.getString("context.class"));
            Method method = contextClass.getMethod("newBuilder");
            builder = (PermanentContext.Builder) method.invoke(PermanentContext.Builder.class);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassNotFoundException e) {
            throw new ConfigFactoryException("Exception on constructing Permanent Context", e);
        }
        builder.setOpenBrace(config.getString("context.params.open-brace"));
        return builder.build();
    }

    @Override
    public ReaderStrategy buildReaderStrategy() throws ConfigFactoryException {
        try {
            Class readerClass = Class.forName(config.getString("reader-strategy.class"));
            Constructor constructor = readerClass.getConstructor(Reader.class);
            return (ReaderStrategy) constructor.newInstance(buildReader());
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                InvocationTargetException e) {
            throw new ConfigFactoryException("Exception on constructing ReaderStrategy", e);
        }
    }

    @Override
    public Writer buildWriter() throws ConfigFactoryException {
        try {
            Class readerClass = Class.forName(config.getString("writer.class"));
            Constructor constructor = readerClass.getConstructor(String.class);
            return (Writer) constructor.newInstance(config.getString("writer.param.file"));
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException |
                ClassNotFoundException e) {
            throw new ConfigFactoryException("Exception on constructing Writer", e);
        }
    }

    @Override
    public Formatter buildFormatter() throws ConfigFactoryException {
        try {
            Class readerClass = Class.forName(config.getString("formatter.class"));
            Constructor constructor = readerClass.getConstructor(Map.class);
            return (Formatter) constructor.newInstance(buildHandlers());
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException |
                ClassNotFoundException e) {
            throw new ConfigFactoryException("Exception on constructing Formatter", e);
        }
    }
}
