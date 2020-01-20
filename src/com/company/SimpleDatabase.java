package com.company;
import org.omg.CORBA.TRANSACTION_MODE;
import org.w3c.dom.html.HTMLMapElement;

import javax.print.attribute.standard.MediaSize;
import java.io. *;
import java.util. *;

public class SimpleDatabase {
    private Map<String, String> map = new HashMap<String ,String >();

    public SimpleDatabase(Reader r)throws IOException {
        BufferedReader reader= new BufferedReader(r);
        String line;

        while (true){
            line = reader.readLine();
            if(line ==null){
                break;
            }else{
                int equalIndex =line.indexOf("=");
                if(equalIndex>0) {
                    String key = line.substring(0, equalIndex);
                    String value= line.substring(equalIndex + 1);
                    putValue(key,value);
                }
            }
        }
    }
    public void putValue(String key, String value){
        map.put(key, value);
    }
    public String getValue(String key){return map.get(key);}

    public Iterator<String>iterator(){
        return map.keySet().iterator();
    }

}
