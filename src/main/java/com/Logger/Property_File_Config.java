package com.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import groovy.util.logging.Log4j;

public class Property_File_Config {
    
    //Factory Design Pattern
static Logger log = Logger.getLogger(Property_File_Config.class); 

public static void main(String[] args) {
	
	//Basic Configurator
//BasicConfigurator.configure();		
	PropertyConfigurator.configure("log4j.properties");
	log.debug("Debug");
	
	log.info("Info");
	
	log.warn("Warning");
	
	log.error("Error");
	
	log.fatal("Faral Message");
}

}
