package com.lightbringer.test.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {
            configuration.load();

            configValue = configuration.get("ForgeCraft", "configValue", true, "An example config value").getBoolean(true);

        }

        catch(Exception e) {

        }

        finally {
            configuration.save();
        }
        System.out.println("Config Test: " + configValue);

    }
}
