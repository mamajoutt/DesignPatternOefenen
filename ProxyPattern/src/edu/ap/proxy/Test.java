package edu.ap.proxy;

public class Test {

    private static String fileName;
 
    public static void main (String[] args) {

    	AbstractMap map, mapProxy;
    	String key = "name";
    	String value = "HP";

    	String sep = System.getProperty("file.separator");
    	if (sep.equals("/")) {
    		fileName = "/tmp/key_values";
    	}
    	else {
    		fileName = "C:\\Users\\Public\\Videos";
    	}

    	try {
    		map = new Map(fileName);
    		map.add(key, value);
    		System.out.println(map.find(key));
	    
    		mapProxy = new MapProxy(map);
    		System.out.println(mapProxy.find(key));
    		System.out.println(mapProxy.find(key));
    	} 
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}
