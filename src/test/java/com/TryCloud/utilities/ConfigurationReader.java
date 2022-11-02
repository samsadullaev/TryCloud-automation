package com.TryCloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//
public class ConfigurationReader {

   private static Properties prop = new Properties();

   static {
        //create the object file input stream
        try {
            FileInputStream file = new FileInputStream("config.properties");
            prop.load(file);

            file.close();
        } catch (IOException e){
            e.printStackTrace();

        }

    }

    public static String getProperty(String key){
        return prop.getProperty(key);
    }

}

