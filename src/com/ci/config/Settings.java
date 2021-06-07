package com.ci.config;

import com.ci.base.BrowserType;
import com.ci.utils.LogUtil;

import java.sql.Connection;

public class Settings {

    //Log Path for framework
    public static String LogPath;
    //For Reporting
    public static Connection ReportingConnection;
    public static String ReportingConnectionString;
    public static BrowserType BrowserType;
    public static LogUtil Logs;
    public static String AUT;
}
