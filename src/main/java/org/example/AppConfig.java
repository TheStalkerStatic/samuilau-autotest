package org.example;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:./application.properties}"})
public interface AppConfig extends Config {

    @Key("start.url")
    String startUrl();
}
