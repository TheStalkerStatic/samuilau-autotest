package org.example;

import org.aeonbits.owner.ConfigFactory;

public class ReaderHelper {

    private static AppConfig config;

    public static AppConfig getConf() {
        if (config == null) {
            config = ConfigFactory.create(AppConfig.class);
        }
        return config;
    }
}
