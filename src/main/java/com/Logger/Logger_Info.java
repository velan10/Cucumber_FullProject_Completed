package com.Logger;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Info {
        
	     //Factory Design Pattern
	static Logger log = Logger.getLogger(Logger_Info.class); 

	public static void main(String[] args) {
		
		//Basic Configurator
BasicConfigurator.configure();		
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Faral Message");
	}
	

}
