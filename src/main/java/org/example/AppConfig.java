package org.example;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:./application.properties"})
public interface AppConfig extends Config {

    @Key("start.url")
    String getLink();

    @Key("mail")
    String getMail();

    @Key("password")
    String getPassword();

    @Key("search.word")
    String getSearchWord();

    @Key("browser.name")
    String getBrowserName();

    @Key("timeout.element")
    int getTimeoutElement();

    @Key("timeout.page")
    int getTimeoutPage();
}
//end