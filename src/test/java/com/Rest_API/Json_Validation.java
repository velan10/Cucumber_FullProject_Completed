package com.Rest_API;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Validation {
public static void main(String[] args) throws IOException, ParseException {
	//Conver json into file 
	File f= new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\Payroll\\payroll.json");
	
	//Create Object for FileReader and pass the File
	FileReader reader = new FileReader(f);
	
	//Create Object for Json Parser
	JSONParser parser = new JSONParser();
	
	//refname.parse(reader refname)
	Object parse = parser.parse(reader);
	
	//Type Casting the Object refname in to JSONObject
	JSONObject jsonobj = (JSONObject) parse; //----> Narrowing(downcasting)
	
	//By using that method use get method.----> return type Object
	Object object = jsonobj.get("Name");
	String value = object.toString();
	System.out.println(value);
	
	
	
	
}
}
