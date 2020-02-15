package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    //Properties class는 Hast table의 하위 class. Key value으르 갖는다. 차이점은 file 입출력을 지원한다.
    private final Properties properties;
    private final String filename;

    public Database(String filename) {
        this.filename = filename;
        this.properties= new Properties();
        try{
            properties.load(new FileInputStream(filename));
        }catch (IOException igonore){}

    }

    public void set(String key, String  value){
        properties.setProperty(key,value);
    }

    public String get(String key){
        return properties.getProperty(key,null);
    }

    public void update() throws IOException{
        properties.store(new FileOutputStream(filename),"");
    }

    public Properties getProperties(){
        return properties;
    }

}
