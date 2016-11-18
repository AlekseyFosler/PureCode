package codeFormatter.config;

import codeFormatter.config.configParser.IConfigParser;

/**
 * Created by aleks on 18.11.2016.
 */
public interface ICheckConfig {
    public void checkStartConfig(IConfigParser tested) throws ICheckConfigException;
}
