package edu.ap.proxy;

import java.util.Hashtable;

public class MapProxy implements AbstractMap {

	private AbstractMap map = null;
    private Hashtable<String, String> hashtable;

    public MapProxy(AbstractMap map) {
    
        this.map = map;
        hashtable = new Hashtable<String, String>();
    }

    public String find(String key) throws Exception {
    
    	String value = null;
    	
    	if ( (value = hashtable.get(key)) != null ) {
    		System.out.println("Key found in proxy");
    	}
    	else {
    		System.out.println("Key not found in proxy, delegating to real Map.");
    		value = map.find(key);
    		hashtable.put(key, value);
        }
    	return value;
    }

    public void add(String key, String value) throws Exception {
    	
    	if ( !hashtable.contains(key) ) {
        	hashtable.put(key, value);
        	map.add(key, value);
        }
    }

}
