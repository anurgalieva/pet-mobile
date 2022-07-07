package ru.nurgalieva.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config{
    String user();
    String key();
    String app();
}
