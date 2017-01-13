package edu.ap.proxy;

import java.io.*;
import java.util.*;

public class Map implements AbstractMap {
    
	private String fileName;

    public Map(String fileName) {
    	
    	this.fileName = fileName;
    	File file = new File(fileName);

    	try {
    		file.createNewFile();
    	} 
    	catch (IOException e) {
    		System.out.println(e.getMessage());
    	}
    }
 
    public String find(String key) throws IOException {
    	
    	InputStream is = new FileInputStream(fileName);
    	Properties props = new Properties();
    	props.load(is);
    	is.close();
    	
    	return props.getProperty(key);
    }

    public void add(String key, String value) throws IOException {
    	
    	InputStream is = new FileInputStream(fileName);
    	Properties props = new Properties();
    	props.load(is);
		is.close();
		props.setProperty(key, value);
		OutputStream os = new FileOutputStream(fileName);
		props.store(os, "Properties file");
    }
}
