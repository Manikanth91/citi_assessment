package com.ci.config;

import com.ci.base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static  void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }
    private void ReadProperty() throws IOException {
        //Create Property Object
        Properties prop = new Properties();
        //Load the Property file available in same package
        InputStream inputStream = new FileInputStream("src/com/ci/config/GlobalConfig.properties");
        prop.load(inputStream);
        //Get Reporting String
        Settings.ReportingConnectionString = prop.getProperty("ReportingConnectionString");
        //Get LogPath
        Settings.LogPath = prop.getProperty("LogPath");
        //Browser Type
        Settings.BrowserType = BrowserType.valueOf(prop.getProperty("BrowserType"));
        //Get AUT
        Settings.AUT = prop.getProperty("AUT");
    }
}
