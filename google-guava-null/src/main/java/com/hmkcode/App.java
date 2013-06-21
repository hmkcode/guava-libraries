package com.hmkcode;


import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Optional;
import static com.google.common.base.Strings.emptyToNull;

public class App 
{
    public static void main( String[] args )
    {
    

    	List<String> list = new LinkedList<String>();
    	list.add("A");
    	list.add(null);
    	list.add("C");
    	list.add(null);
    	list.add("E");
    	list.add("");


    	Optional<String> possible;
    	for(int i = 0 ; i < list.size(); i++){
    		possible = Optional.fromNullable(emptyToNull(list.get(i)));
    		System.out.println("index: "+i+" -  value: "+possible.or("no value"));
    	}
    	
    	String value;
    	for(int i = 0 ; i < list.size(); i++){
    		value = list.get(i);
    		if(value == null || value.equals(""))
    			System.out.println("index: "+i+" - value: no value");
    		else
    			System.out.println("index: "+i+" - value: "+value);
    	}
    	
    	
     
    }
  
}
